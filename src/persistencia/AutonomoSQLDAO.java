package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entidades.VeiculoAutonomo;

public class AutonomoSQLDAO implements AutonomoDAO {
	
	private static final String DRIVER_NAME = "org.hsqldb.jdbcDriver";
	private static final String DB_URI = "jdbc:hsqldb:hsql://localhost/";
	private static final String DB_USER = "SA";
	private static final String DB_PWD = "";
	private static final String INSERIR = "INSERT INTO AUTONOMOS(matricula, capacidade, latitude, longitude) VALUES(?, ?, ?, ?)";
	private static final String BUSCAR = "SELECT* FROM AUTONOMOS";
	
	
	
	public AutonomoSQLDAO() throws SQLException, ClassNotFoundException {
		Class.forName(AutonomoSQLDAO.DRIVER_NAME);
	};
	
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(AutonomoSQLDAO.DB_URI, 
				AutonomoSQLDAO.DB_USER, AutonomoSQLDAO.DB_PWD);
	};
	
	
	@Override
	public void inserir(VeiculoAutonomo veiculo) throws Exception {
		PreparedStatement stmt = this.getConnection().prepareStatement(AutonomoSQLDAO.INSERIR);
		stmt.setString(1, veiculo.getMatricula());
		stmt.setDouble(2, veiculo.getCapacidade());
		stmt.setInt(3, veiculo.getLatitude());
		stmt.setInt(4, veiculo.getLongitude());
		//stmt.executeUpdate();
		stmt.execute();
		stmt.close();
	};
	@Override
	public VeiculoAutonomo buscar() throws Exception {
		PreparedStatement stmt = this.getConnection().prepareStatement(AutonomoSQLDAO.BUSCAR);
		ResultSet rSet = stmt.executeQuery();
		while(rSet.next())
			System.out.println(rSet.getString("matricula") + "- " + rSet.getString("capacidade") + " / " + rSet.getInt("latitude") + "/" + rSet.getInt("longitude"));
		rSet.close();
		stmt.close();
		return null; //wtf
	};
	

}

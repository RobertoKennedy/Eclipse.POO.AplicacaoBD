package testes;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import entidades.Drone;
import persistencia.AutonomoSQLDAO;


public class Teste {
	
	public void run() throws Exception {
		
		Drone novo = new Drone("teste", 0,0,0);
		AutonomoSQLDAO teste = new AutonomoSQLDAO();
		teste.inserir(novo);
	};
	public void run2() throws Exception {
		AutonomoSQLDAO teste1 = new AutonomoSQLDAO();
		teste1.buscar();
		
	};
	public static void main(String[] args) throws Exception, SQLException, ClassNotFoundException {
		(new Teste()).run2();
		System.out.println("Finalizando...");
	}
	
}

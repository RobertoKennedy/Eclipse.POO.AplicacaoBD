package entidades;

public class VeiculoTerrestre extends VeiculoAutonomo{
	private static final double fixo = 30;
	//construtor
	public VeiculoTerrestre(String matricula, double capacidade, int latitude, int logitude) { 	
		super(matricula, capacidade, latitude, logitude);
	};	
	//calcula custo usando o metodo getDistancia(); Se menor que 30, retorna valor fixo;
	@Override
	public double getCusto(int coletax, int coletay, int destinox, int destinoy, double carga) {	
		double custo = this.getDistancia(coletax, coletay, destinox, destinoy) * (carga);//multiplica o getDistancia pela carga
		if(custo <fixo)
			return fixo;
		return custo;		
	}
	//conjunto de gets
	@Override
	public String getMatricula() {
		return this.matricula;
	}
	@Override
	public double getCapacidade() {
		return this.capacidade;
	}
	@Override
	public int getLatitude() {
		return this.latitude;
	}
	@Override
	public int getLongitude() {
		return this.longitude;
	};


	


}//

package entidades;

public abstract class VeiculoAutonomo {
	
	protected String matricula;
	protected double capacidade;
	protected int latitude;
	protected int longitude;
	
	public VeiculoAutonomo(String matricula, double capacidade, int latitude, int longitude) {
		
		this.setMatricula(matricula);
		this.setCapacidade(capacidade);
		this.setLatitude(latitude);
		this.setLongitude(longitude);
	}
	//calcula a distancia manhattan
		public double getDistancia(int coletax, int coletay, int destinox, int destinoy) {	
			 double calcDist = (double)((coletax - destinox)) + (coletay - destinoy);
			 if(calcDist < 0)
				 return (calcDist*(-1));
			 return calcDist;
		};

	private void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	private void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	private void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	private void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public abstract String getMatricula();	
	public abstract double getCapacidade();
	public abstract int getLatitude();
	public abstract int getLongitude();
	public double getCusto(int coletax, int coletay, int destinox, int destinoy, double carga) {
		return 0;
	};


}

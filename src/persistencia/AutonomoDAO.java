package persistencia;
import entidades.VeiculoAutonomo;

public interface AutonomoDAO {
	public void inserir(VeiculoAutonomo veiculo) throws Exception;
	public VeiculoAutonomo buscar() throws Exception;

}

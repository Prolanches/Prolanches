package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Marca;
import br.com.ProjecJava.service.MarcaService;

public class Marca_Teste {

	public static void main(String[] args) throws SQLException {
		MarcaService marcaService = new MarcaService();
		
		//inserindo marca FUNCIONANDO
		//Marca marca = new Marca( "Coca-Cola");
		//marcaService.inserir(marca);
		
		//excluindo marca FUNCIONANDO
		//marcaService.excluir(2);
		
		//listando as marcas FUNCIONANDO
		List<Marca> lMarca = MarcaService.listarMarca();
		for (Marca marca : lMarca) {
			imprimeMarca(marca);
		}
		
	}
	private static void imprimeMarca(Marca marca) {
		System.out.println("Código: "+marca.getCodigo()+ " Nome: "+marca.getNome());
	}
}

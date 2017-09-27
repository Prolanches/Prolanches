package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.dto.MarcaDTO;
import br.com.ProjecJava.service.MarcaService;

public class Marca_Teste {

	public static void main(String[] args) throws SQLException {
		MarcaService marcaService = new MarcaService();
		
		//inserindo marca FUNCIONANDO
		//MarcaDTO marca = new MarcaDTO(null,"Perdigão");
		//marcaService.inserir(marca);
		
		//excluindo marca FUNCIONANDO
		//marcaService.excluir(21);
		
		//listando as marcas FUNCIONANDO
		List<MarcaDTO> lMarca = MarcaService.listarMarca();
		for (MarcaDTO marca1 : lMarca) {
			imprimeMarca(marca1);
		}
		
	}
	private static void imprimeMarca(MarcaDTO marca) {
		System.out.println("Código: "+marca.getCodigoMarca()+ " Nome: "+marca.getNomeMarca());
	}
}

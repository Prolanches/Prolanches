/**
 * Este é o pacote resposanvel pelas Classes de Teste
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.dto.PaisDTO;
import br.com.ProjecJava.model.Pais;
import br.com.ProjecJava.service.PaisService;
/**
 * Esta é a Classe Teste responsavel pelos Paises
 * @author Lucas Braz
 *
 */
public class Pais_Teste {
	/**
	 * Metodos de listagem dos Paises
	 * @param args
	 * @throws SQLException
	 */
        public static void main(String[] args) throws SQLException {
		/**
		 * Instância da classe Service
		 */
		PaisService paisService = new PaisService();
		
		/**
		 *  Listagem dos Paises
		 */
		List<PaisDTO> lPais = paisService.listarPais();
		for (PaisDTO br : lPais) {
			imprimirPais(br);
		}	
	}
	private static void imprimirPais(PaisDTO br) {
		System.out.println("Codígo: "+ br.getCodigoPais()+", Nome: "+ br.getNomePais() + ", Sigla: "+br.getSiglaPais());
	}
	
}


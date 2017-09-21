/**
 * Este é o pacote resposanvel pelas Classes de Teste
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.dto.PerfilDTO;
import br.com.ProjecJava.service.PerfilService;
/**
 * Esta é a Classe Teste responsavel pelos Perfis
 * @author Lucas Braz
 *
 */
public class Perfil_Teste {
	/**
	 * Metodos de listagem dos Perfis
	 * @param args
	 * @throws SQLException
	 */
        public static void main(String[] args) throws SQLException {
		/**
		 * Instância da classe Service
		 */
		PerfilService perfilService = new PerfilService();
		
		/**
		 *  Listagem dos Perfis
		 */
		List<PerfilDTO> lPerfil = perfilService.listarPerfil();
		for (PerfilDTO pf : lPerfil) {
			imprimirPerfil(pf);
		}	
	}
	private static void imprimirPerfil(PerfilDTO pf) {
		System.out.println("Codígo: "+ pf.getCodigoPerfil()+"\nNome: "+ pf.getNivelPerfil());
	}
}

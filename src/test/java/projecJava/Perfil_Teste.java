/**
 * Este é o pacote resposanvel pelas Classes de Teste
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Perfil;
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
		List<Perfil> lPerfil = perfilService.listarPerfil();
		for (Perfil pf : lPerfil) {
			imprimirPerfil(pf);
		}	
	}
	private static void imprimirPerfil(Perfil pf) {
		System.out.println("Codígo: "+ pf.getCodigo()+"\nNome: "+ pf.getNivel());
	}
}

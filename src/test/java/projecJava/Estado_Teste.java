/**
 * Este pacote é responsavel pelas Classes de Teste 
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.service.EstadoService;

/**
 * Esta classe é responsavel pelos Testes dos Estados 
 * @author Lucas Braz
 *
 */
public class Estado_Teste {
	
	/**
	 * Metodo de listagem dos Estados 
	 * @param args
	 * @throws SQLException
	 */
    public static void main(String[] args) throws SQLException {
		//Instância da classe Service
		EstadoService estadoService = new EstadoService();
		
		// Listagem dos Estados
		List<Estado> lEstado = estadoService.listarEstado();
		for (Estado uf : lEstado) {
			imprimirEstado(uf);
		}	

    }
	private static void imprimirEstado(Estado uf) {
		System.out.println("Codígo: "+ uf.getCodigo()+", Nome: "+ uf.getNome() + ", UF: "+uf.getUf());
	}
}

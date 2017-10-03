/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.dto.UsuarioDTO;
import br.com.ProjecJava.service.UsuarioService;

/**
 * Esta classe é responsavel pelos Testes dos Usuários 
 * 
 * @author Lucas Braz
 *
 */
public class Usuario_Teste {
	public static void main(String[] args) throws SQLException {
		/**
		 * Instância da classe Service
		 */
		UsuarioService usuarioService = new UsuarioService();
		/**
		 *  inserindo o Usuário 
		 */
		//UsuarioDTO usuario = new UsuarioDTO(null,"itamarzinho", 82,"senha", 1);
		//usuarioService.inserir(usuario);
		
		/**
		 * alterando o Usuário 
		 */
	    //usuarioService.alterar(new UsuarioDTO(62, "lucas",82,"vale456",1));
		
		/**
		 * excluindo o Usuário 
		 */
		//usuarioService.excluir(62);

		/**
		 * Listagem dos Funcionarios
		 */
		List<UsuarioDTO> lUsuario = usuarioService.listarUsuario();
		for (UsuarioDTO usu : lUsuario) {
			imprimirUsuario(usu);
		}
	}

	private static void imprimirUsuario(UsuarioDTO usu) {
		System.out.println("Codígo: "+usu.getCodigoUsuario()+"\nLogin: "+usu.getLoginUsuario()+"\nFuncionário: "+usu.getNomeFuncionario()+"\nSenha: "+usu.getSenhaUsuario()+"\nPerfil: "+usu.getNivelPerfil());
	}
}

/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Empresa;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Funcao;
import br.com.ProjecJava.model.Funcionario;
import br.com.ProjecJava.model.Pais;
import br.com.ProjecJava.model.Perfil;
import br.com.ProjecJava.model.Usuario;
import br.com.ProjecJava.service.EmpresaService;
import br.com.ProjecJava.service.FuncionarioService;
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
		FuncionarioService funcionarioService = new FuncionarioService();

		
		Pais pais = new Pais(1, "Brasil", "BR");
		Estado estado = new Estado(24, "Santa Catarina", "SC", pais);
		Cidade cidade = new Cidade(4449, "Blumenau", estado);
		Endereco endereco = new Endereco(1, "2 de Setembro", cidade);
		Empresa empresa = new Empresa(1, "Snack Time", endereco,"02.722.800/0001-50","(47)3035-2650","projecjava@gmail.com");
		Funcao funcao = new Funcao(1,"Gerente");
		Funcionario funcionario = new Funcionario(2,"Itamar Rockfeller", funcao, empresa);
		Perfil perfil = new Perfil(1,"Administrador");
		

		/**
		 *  inserindo o Usuário 
		 */
		Usuario usuario = new Usuario(5,"tipo", funcionario,"vale1233", perfil);
		usuarioService.inserir(usuario);
		
		/**
		 * alterando o Usuário 
		 */
	    //usuarioService.alterar(new Usuario(16, "Joao",funcionario,"vale456",perfil));
		
		/**
		 * excluindo o Usuário 
		 */
		//usuarioService.excluir(16);

		/**
		 * Listagem dos Funcionarios
		 */
		List<Usuario> lUsuario = UsuarioService.listarUsuario();
		for (Usuario usu : lUsuario) {
			imprimirUsuario(usu);
		}
	}

	private static void imprimirUsuario(Usuario usu) {
		System.out.println("Codígo: "+usu.getCodigo()+"\nLogin: "+usu.getLogin()+"\nFuncionário: "+usu.getFuncionario().getNome()+"\nSenha: "+usu.getSenha()+"\nPerfil: "+usu.getPerfil().getNivel());
	}
}

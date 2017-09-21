/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.dto.FuncionarioDTO;
import br.com.ProjecJava.service.FuncionarioService;

/**
 * Esta classe é responsavel pelos Testes dos Funcionarios
 * 
 * @author Lucas Braz
 *
 */
public class Funcionario_Teste {
	public static void main(String[] args) throws SQLException {
		/**
		 * Instância da classe Service
		 */

		FuncionarioService funcionarioService = new FuncionarioService();

		/**
		 * inserindo o funcionario
		 */
		FuncionarioDTO funcionario = new FuncionarioDTO(null, "Lucas Braz", 24, 55);
		funcionarioService.inserir(funcionario);

		/**
		 * alterando o funcionario
		 */
		// funcionarioService.alterar(new Funcionario(7, "Lucas Braz",funcao,empresa));

		/**
		 * excluindo a empresa
		 */
		// funcionarioService.excluir(7);

		/**
		 * Listagem dos Funcionarios
		 */
		List<FuncionarioDTO> lFuncionario = funcionarioService.listarFuncionarios();
		for (FuncionarioDTO fun : lFuncionario) {
			imprimirFuncionario(fun);
		}
	}

	private static void imprimirFuncionario(FuncionarioDTO fun) {
		System.out.println("Codígo: " + fun.getCodigoFuncionario() + "\nNome: " + fun.getNomeFuncionario()
				+ "\nFuncao: " + fun.getNomeFuncao() + "\nEmpresa: " + fun.getNomeEmpresa());
	}
}

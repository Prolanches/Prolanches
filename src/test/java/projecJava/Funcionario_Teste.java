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
import br.com.ProjecJava.service.EmpresaService;
import br.com.ProjecJava.service.EnderecoService;
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
		EmpresaService empresaService = new EmpresaService();
		FuncionarioService funcionarioService = new FuncionarioService();

		Funcao funcao = new Funcao(1,"Gerente");
		Pais pais = new Pais(1, "Brasil", "BR");
		Estado estado = new Estado(24, "Santa Catarina", "SC", pais);
		Cidade cidade = new Cidade(4449, "Blumenau", estado);
		Endereco endereco = new Endereco(1, "2 de Setembro", cidade);
		Empresa empresa = new Empresa(1, "Snack Time", endereco,"02.722.800/0001-50","(47)3035-2650","projecjava@gmail.com");
		

		/**
		 *  inserindo o funcionario 
		 */
		Funcionario funcionario = new Funcionario(2,"Itamar Rockfeller", funcao, empresa);
		funcionarioService.inserir(funcionario);
		
		/**
		 * alterando o funcionario 
		 */
		//funcionarioService.alterar(new Funcionario(7, "Lucas Braz",funcao,empresa));
		
		/**
		 * excluindo a empresa 
		 */
		//funcionarioService.excluir(7);

		/**
		 * Listagem dos Funcionarios
		 */
		List<Funcionario> lFuncionario = FuncionarioService.listarFuncionarios();
		for (Funcionario fun : lFuncionario) {
			imprimirFuncionario(fun);
		}
	}

	private static void imprimirFuncionario(Funcionario fun) {
		System.out.println("Codígo: "+fun.getCodigo()+"\nNome: "+fun.getNome()+"\nFuncao: "+fun.getFuncao().getNome()+"\nEmpresa: "+fun.getEmpresa().getNome());
	}
}

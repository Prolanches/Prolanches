/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Funcao;
import br.com.ProjecJava.service.FuncaoService;
/**
 * Esta classe é responsavel pelos Testes das Funções
 * 
 * @author Lucas Braz
 *
 */
public class Funcao_Teste {
	public static void main(String[] args) throws SQLException {
		/**
		 * Instância da classe Service
		 */
		
		FuncaoService funcaoService = new FuncaoService();

		/**
		 *  inserindo a Função 
		 */
		Funcao funcao = new Funcao(2,"Gerente");
		funcaoService.inserir(funcao);
		
		/**
		 * alterando a Função 
		 */
		//funcaoService.alterar(new Funcao(1,"Atendente"));
		
		/**
		 * excluindo a Função 
		 */
		//funcaoService.excluir(1);

		/**
		 *  Listagem das Funções
		 */
		List<Funcao> lFuncao = FuncaoService.listarFuncao();
		for (Funcao func : lFuncao) {
			imprimirFuncao(func);
		}
	}

	private static void imprimirFuncao(Funcao func) {
		System.out.println("Codígo: "+func.getCodigo()+"\nNome: "+func.getNome());
	}
}

/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.dto.FuncaoDTO;
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
		//FuncaoDTO funcao = new FuncaoDTO(null,"Atendente");
	    //funcaoService.inserir(funcao);
		
		/**
		 * alterando a Função 
		 */
		//funcaoService.alterar(new FuncaoDTO(81,"Testando"));
		
		/**
		 * excluindo a Função 
		 */
		//funcaoService.excluir(81);

		/**
		 *  Listagem das Funções
		 */
		List<FuncaoDTO> lFuncao = funcaoService.listarFuncao();
		for (FuncaoDTO func : lFuncao) {
			imprimirFuncao(func);
		}
	}

	private static void imprimirFuncao(FuncaoDTO func) {
		System.out.println("Codígo: "+func.getCodigoFuncao()+"\nNome: "+func.getNomeFuncao());
	}
}

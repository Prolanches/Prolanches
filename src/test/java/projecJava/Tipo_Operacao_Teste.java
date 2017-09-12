/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;

import java.util.List;

import br.com.ProjecJava.model.Tipo_Operacao;
import br.com.ProjecJava.service.Tipo_OperacaoService;
/**
 * Esta classe é responsavel pelos Testes dos Tipos de Operações
 * 
 * @author Lucas Braz
 *
 */
public class Tipo_Operacao_Teste {
	public static void main(String[] args) throws SQLException {
		/**
		 * listando tipo operação
		 */
		List<Tipo_Operacao> lTipo_Operacao = Tipo_OperacaoService.listarTipo_Operacao();
		for (Tipo_Operacao tipoop : lTipo_Operacao) {
			imprimeTipo_Operacao(tipoop);
		}
			
	}
	private static void imprimeTipo_Operacao(Tipo_Operacao tipoop){
		System.out.println("codigo: " + tipoop.getCodigo()+" \nTipo: "+tipoop.getNomeOPeracao());
	}
}


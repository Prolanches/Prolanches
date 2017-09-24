/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;

import java.util.List;

import br.com.ProjecJava.dto.Tipo_OperacaoDTO;
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
		List<Tipo_OperacaoDTO> lTipo_Operacao = Tipo_OperacaoService.listarTipo_Operacao();
		for (Tipo_OperacaoDTO tipoop : lTipo_Operacao) {
			imprimeTipo_Operacao(tipoop);
		}
			
	}
	private static void imprimeTipo_Operacao(Tipo_OperacaoDTO tipoop){
		System.out.println("codigo: " + tipoop.getCodigoTipoOP()+" \nTipo: "+tipoop.getNomeTipoOP());
	}
}


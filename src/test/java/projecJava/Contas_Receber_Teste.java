/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.ProjecJava.dto.Contas_ReceberDTO;
import br.com.ProjecJava.service.Contas_ReceberService;

/**
 * Esta classe é responsavel pelos Testes do Contas_Receber
 * 
 * @author Lucas Braz
 *
 */
public class Contas_Receber_Teste {

	public static void main(String[] args) throws SQLException, ParseException {
		/**
		 * Instância da classe Service
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Contas_ReceberService contas_receberService = new Contas_ReceberService();

		/**
		 * inserir Contas_Receber
		 */
		Contas_ReceberDTO contas_receber = new Contas_ReceberDTO(null,1,1,"12/09/2017",150.00);
		contas_receberService.inserir(contas_receber);
		/**
		 * Listagem do Contas_Receber
		 */
		List<Contas_ReceberDTO> lContas_Receber = contas_receberService.listarContas_Receber();
		for (Contas_ReceberDTO cont_rec : lContas_Receber) {
			imprimeContas_Receber(cont_rec);
		}
	}

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private static void imprimeContas_Receber(Contas_ReceberDTO cont_rec) {
		System.out.println("Código: " + cont_rec.getCodigoContasReceber() + "\nCódigo do Pedido: " + cont_rec.getCodigoPedido()
				+ "\nValor do Pedido: " + cont_rec.getValorPedido() + "\nPeriodo: " + cont_rec.getDataContasReceber()
				+ "\nValores: " + cont_rec.getValorContasReceber());
	}
}

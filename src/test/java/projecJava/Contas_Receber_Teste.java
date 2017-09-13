/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.ProjecJava.model.Contas_Receber;
import br.com.ProjecJava.model.Pedido;
import br.com.ProjecJava.model.Tipo_Operacao;
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

		Tipo_Operacao tipooperacao = new Tipo_Operacao(1, "Mesa");
		Pedido pedido = new Pedido(1, sdf.parse("11/09/2017"), tipooperacao, 150.00);

		/**
		 * inserir Contas_Receber
		 */
		Contas_Receber contas_receber = new Contas_Receber(1, pedido, sdf.parse("12/09/2017"), 150.00);
		contas_receberService.inserir(contas_receber);
		/**
		 * Listagem do Contas_Receber
		 */
		List<Contas_Receber> lContas_Receber = Contas_ReceberService.listarContas_Receber();
		for (Contas_Receber cont_rec : lContas_Receber) {
			imprimeContas_Receber(cont_rec);
		}
	}

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private static void imprimeContas_Receber(Contas_Receber cont_rec) {
		System.out.println("Código: " + cont_rec.getCodigo() + "\nCódigo do Pedido: " + cont_rec.getPedido().getCodigo()
				+ "\nValor do Pedido: " + cont_rec.getPedido().getValor() + "\nPeriodo: " + cont_rec.getData()
				+ "\nValores: " + cont_rec.getValor());
	}
}

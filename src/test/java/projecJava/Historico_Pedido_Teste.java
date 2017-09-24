/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.ProjecJava.dto.Historico_PedidoDTO;
import br.com.ProjecJava.service.Historico_PedidoService;
/**
 * Esta classe é responsavel pelos Testes dos Historico_Pedido 
 * 
 * @author Lucas Braz
 *
 */
public class Historico_Pedido_Teste {

	public static void main(String[] args) throws SQLException, ParseException {
		/**
		 * Instância da classe Service
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		Historico_PedidoService historico_pedidoService = new Historico_PedidoService();

	

		/**
		 * inserir Historico_Pedido
		 */
		Historico_PedidoDTO historico_pedido = new Historico_PedidoDTO(null, 1, 1, 1);
		historico_pedidoService.inserir(historico_pedido);
		/**
		 * Listagem do Historico_Pedido
		 */
		List<Historico_PedidoDTO> lHistorico_Pedido = historico_pedidoService.listarHistorico_Pedido();
		for (Historico_PedidoDTO hit_pedido : lHistorico_Pedido) {
			imprimeHistorico_Pedido(hit_pedido);
		}
	}

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

	private static void imprimeHistorico_Pedido(Historico_PedidoDTO hit_pedido) {
		System.out.println("Código: " + hit_pedido.getCodigoHistoricoPedido() + "\nCódigo Pedido: "
				+ hit_pedido.getCodigoPedido() + "\nData do Pedido: " + hit_pedido.getDataPedido()
				+ "\nValor do Pedido: " + hit_pedido.getValorPedido() + "\nFuncionário: "
				+ hit_pedido.getNomeFuncionario() + "\nStatus do Pedido: "+hit_pedido.getNomeStatusPedido());
	}
}

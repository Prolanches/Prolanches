/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.dto.PedidoDTO;
import br.com.ProjecJava.dto.ProdutoDTO;
import br.com.ProjecJava.dto.SuprimentoDTO;
import br.com.ProjecJava.model.Pedido;
import br.com.ProjecJava.model.Tipo_Operacao;
import br.com.ProjecJava.service.PedidoService;

/**
 * Esta classe é responsavel pelos Testes dos Pedidos
 * 
 * @author Lucas Braz
 *
 */
public class Pedido_Teste {
	public static void main(String[] args) throws SQLException, ParseException {
		/**
		 * Instância da classe Service
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		PedidoService pedidoService = new PedidoService();

		/**
		 * inserindo o Pedido FUNCIONANDO FALTA ARRUMAR DATA
		 */
		List<ProdutoDTO> lProdutos = new ArrayList<>();

		ProdutoDTO produto = new ProdutoDTO(62, "X-Teste", 1.50,0,"Cliente");
		lProdutos.add(produto);

		PedidoDTO pedido = new PedidoDTO(null,"26/09/2017",1, 0);
		pedidoService.inserir(pedido, lProdutos);

		

		//pedidoService.alterar(new PedidoDTO(3, "10/05/2015 10:35:00", 2, 212.00));

		/**
		 * excluindo a Pedido FUNCIONANDO
		 */
		// pedidoService.excluir(2,2);

		/**
		 * Listagem dos Funcionarios
		 */
		List<PedidoDTO> lPedido = pedidoService.listarPedido();
		for (PedidoDTO ped : lPedido) {
			imprimirPedido(ped);
		}
	}

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	private static void imprimirPedido(PedidoDTO ped) {
		System.out.println("Codígo: " + ped.getCodigoPedido() + "\nData: " + sdf.format(ped.getDataPedido())
				+ "\nTipo de Operação: " + ped.getNomeTipoOP() + "\nValor: " + ped.getValorPedido());
	}
}

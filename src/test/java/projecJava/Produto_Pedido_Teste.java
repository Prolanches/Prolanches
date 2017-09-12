/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.ProjecJava.model.Pedido;
import br.com.ProjecJava.model.Produto;
import br.com.ProjecJava.model.Produto_Pedido;
import br.com.ProjecJava.model.Tipo_Operacao;
import br.com.ProjecJava.service.Produto_PedidoService;



/**
 * Esta classe é responsavel pelos Testes dos Produtos Pedidos
 * 
 * @author Lucas Braz
 *
 */
public class Produto_Pedido_Teste {
	public static void main(String[] args) throws SQLException, ParseException {
		/**
		 * Instância da classe Service
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Produto_PedidoService produto_pedidoService = new Produto_PedidoService();
		
		Tipo_Operacao tipooperacao = new Tipo_Operacao(1,"Balção");
		Pedido pedido = new Pedido(1,sdf.parse("11/09/2017"), tipooperacao, 100.00);
        Produto produto = new Produto (1,"X-Burguer",1.60,17.00);
		
		

		/**
		 *  inserindo o Produto_Pedido
		 */
		//Produto_Pedido produto_pedido = new Produto_Pedido(2,pedido, produto,"Lucas Braz");
		//produto_pedidoService.inserir(produto_pedido);
		
		/**
		 * alterando o Produto_Pedido 
		 */
		//produto_pedidoService.alterar(new Produto_Pedido(7, pedido,produto,"Itamar"));
		
		/**
		 * excluindo o Produto_Pedido
		 */
		//produto_pedidoService.excluir(7);

		/**
		 * Listagem dos Produtos_Pedidos
		 */
		List<Produto_Pedido> lProduto_Pedido = Produto_PedidoService.listarProduto_Pedido();
		for (Produto_Pedido prodped : lProduto_Pedido) {
			imprimirProduto_Pedido(prodped);
		}
	}

	private static void imprimirProduto_Pedido(Produto_Pedido prodped) {
		System.out.println("Codígo: "+prodped.getCodigo()+"\nData: "+prodped.getPedido().getDataPedido()+"\nTipo de Operação: "+prodped.getPedido().getTipoOperacao().getNomeOPeracao()+"\nNome do Cliente: "+prodped.getNomeCliente());
	}
}

/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

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
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		PedidoService pedidoService = new PedidoService();
		Tipo_Operacao tipooperacao = new Tipo_Operacao(1,"Mesa");
		
		/**
		 *  inserindo o Pedido 
		 */
	    Pedido pedido = new Pedido(1,sdf.parse("11/09/2017"),tipooperacao,150.00);
	    pedidoService.inserir(pedido);
		
		/**
		 * alterando o Pedido 
		 */
		//pedidoService.alterar(new Pedido(1,sdf.parse("11/09/2017"),tipooperacao,200.00));
		
		/**
		 * excluindo a Pedido  
		 */
		//pedidoService.excluir(1);

		/**
		 * Listagem dos Funcionarios
		 */
		List<Pedido> lPedido = PedidoService.listarPedido();
		for (Pedido ped : lPedido) {
			imprimirPedido(ped);
		}
	}

	private static void imprimirPedido(Pedido ped) {
		System.out.println("Codígo: "+ped.getCodigo()+"\nData: "+ped.getDataPedido()+"\nTipo de Operação: "+ped.getTipoOperacao().getCodigo()+"\nValor: "+ped.getValor());
	}
}

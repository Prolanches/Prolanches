/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.dto.Status_PedidoDTO;
import br.com.ProjecJava.service.Status_PedidoService;
/**
 * Esta classe é responsavel pelos Testes dos Status do Pedido
 * 
 * @author Lucas Braz
 *
 */
public class Status_Pedido_Teste {
	public static void main(String[] args) throws SQLException {
		/**
		 * listando Status do Pedido
		 */
		Status_PedidoService status_PedidoService = new Status_PedidoService();
		
		List<Status_PedidoDTO> lStatus_Pedido = status_PedidoService.listarStatus_Pedido();
		for (Status_PedidoDTO status : lStatus_Pedido) {
			imprimeStatus_Pedido(status);
		}
			
	}
	private static void imprimeStatus_Pedido(Status_PedidoDTO status){
		System.out.println("codigo: " +status.getCodigoStatusPedido()+" \nStatus do Pedido: "+status.getNomeStatusPedido());
	}
}


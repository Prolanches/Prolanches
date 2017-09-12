/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Status_Pedido;
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
		List<Status_Pedido> lStatus_Pedido = Status_PedidoService.listarStatus_Pedido();
		for (Status_Pedido status : lStatus_Pedido) {
			imprimeStatus_Pedido(status);
		}
			
	}
	private static void imprimeStatus_Pedido(Status_Pedido status){
		System.out.println("codigo: " +status.getCodigo()+" \nStatus do Pedido: "+status.getNome());
	}
}


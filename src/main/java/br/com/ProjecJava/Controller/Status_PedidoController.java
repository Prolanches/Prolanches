package br.com.ProjecJava.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.ProjecJava.dto.Status_PedidoDTO;
import br.com.ProjecJava.service.Status_PedidoService;

@Path("statusPedido")
public class Status_PedidoController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<Status_PedidoDTO> listStatusPedido() {
		Status_PedidoService statusPedidoService = new Status_PedidoService();
		try {
			return statusPedidoService.listarStatus_Pedido();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}

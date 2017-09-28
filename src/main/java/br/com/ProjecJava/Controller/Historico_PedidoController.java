package br.com.ProjecJava.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.ProjecJava.dto.Historico_PedidoDTO;
import br.com.ProjecJava.service.Historico_PedidoService;


@Path("historicopedido")
public class Historico_PedidoController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<Historico_PedidoDTO> listProduto() {
		Historico_PedidoService historicoPedidoService = new Historico_PedidoService();
		try {
			return historicoPedidoService.listarHistorico_Pedido();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response create(Historico_PedidoDTO historicoPedido) {
		Historico_PedidoService historicoPedidoService = new Historico_PedidoService();
		try {
			historicoPedidoService.inserir(historicoPedido);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

}

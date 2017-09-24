package br.com.ProjecJava.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.ProjecJava.dto.PedidoDTO;
import br.com.ProjecJava.service.PedidoService;

@Path("pedido")
public class Pedido_Controller {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<PedidoDTO> listProduto() {
		PedidoService pedidoService = new PedidoService();
		try {
			return pedidoService.listarPedido();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response create(PedidoDTO pedido) {
		PedidoService pedidoService = new PedidoService();
		try {
			pedidoService.inserir(pedido);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response update(PedidoDTO pedido) {
		PedidoService pedidoService = new PedidoService();
		try {
			pedidoService.alterar(pedido);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DELETE
	@Path("{codigo}/")
	public Response delete(@PathParam("codigo1,codigo2") int codigo1, int codigo2) {
		PedidoService pedidoService = new PedidoService();
		try {
			pedidoService.excluir(codigo1, codigo2);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
}
}

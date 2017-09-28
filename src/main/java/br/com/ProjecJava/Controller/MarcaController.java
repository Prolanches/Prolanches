package br.com.ProjecJava.Controller;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.ProjecJava.dto.MarcaDTO;
import br.com.ProjecJava.service.MarcaService;

@Path("marca")
public class MarcaController {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response create(MarcaDTO marca) {
		MarcaService marcaService = new MarcaService();
		try {
			marcaService.inserir(marca);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	@DELETE
	@Path("{codigo}/")
	public Response delete(@PathParam("codigo") int codigo) {
		MarcaService marcaService = new MarcaService();
		try {
			marcaService.excluir(codigo);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
}

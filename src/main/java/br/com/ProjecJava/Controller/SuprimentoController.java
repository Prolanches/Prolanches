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

import br.com.ProjecJava.dto.FornecedorDTO;
import br.com.ProjecJava.dto.SuprimentoDTO;
import br.com.ProjecJava.service.SuprimentoService;

@Path("suprimento")
public class SuprimentoController {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<SuprimentoDTO> listSuprimento() {
		SuprimentoService suprimentoService = new SuprimentoService();
		try {
			return suprimentoService.listarSuprimentos();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response create(SuprimentoDTO suprimento, List<FornecedorDTO> lFornecedores) {
		SuprimentoService suprimentoService = new SuprimentoService();
		try {
			suprimentoService.inserir(suprimento, lFornecedores);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response update(SuprimentoDTO suprimento) {
		SuprimentoService suprimentoService = new SuprimentoService();
		try {
			suprimentoService.alterar(suprimento);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DELETE
	@Path("{codigo}/")
	public Response delete(@PathParam("codigo") int codigo) {
		SuprimentoService suprimentoService = new SuprimentoService();
		try {
			suprimentoService.excluir(codigo);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
}

}

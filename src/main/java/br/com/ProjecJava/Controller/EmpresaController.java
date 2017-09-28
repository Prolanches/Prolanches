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

import br.com.ProjecJava.dto.EmpresaDTO;
import br.com.ProjecJava.service.EmpresaService;

@Path("empresa")
public class EmpresaController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<EmpresaDTO> listProduto() {
		EmpresaService empresaService = new EmpresaService();
		try {
			return empresaService.listarEmpresas();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response create(EmpresaDTO empresa) {
		EmpresaService empresaService = new EmpresaService();
		try {
			empresaService.inserir(empresa);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response update(EmpresaDTO empresa) {
		EmpresaService empresaService = new EmpresaService();
		try {
			empresaService.alterar(empresa);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DELETE
	@Path("{codigo}/")
	public Response delete(@PathParam("codigo") int codigo) {
		EmpresaService empresaService = new EmpresaService();
		try {
		    empresaService.excluir(codigo);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
}

}

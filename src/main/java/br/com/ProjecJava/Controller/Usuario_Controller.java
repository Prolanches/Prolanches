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

import br.com.ProjecJava.dto.UsuarioDTO;
import br.com.ProjecJava.service.UsuarioService;

@Path("usuario")
public class Usuario_Controller {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<UsuarioDTO> listusuario() {
		UsuarioService usuarioService = new UsuarioService();
		try {
			return usuarioService.listarUsuario();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response create(UsuarioDTO usuario) {
		UsuarioService usuarioService = new UsuarioService();
		try {
			usuarioService.inserir(usuario);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response update(UsuarioDTO usuario) {
		UsuarioService usuarioService = new UsuarioService();
		try {
			usuarioService.alterar(usuario);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DELETE
	@Path("{codigo}/")
	public Response delete(@PathParam("codigo") int codigo) {
		UsuarioService usuarioService = new UsuarioService();
		try {
			usuarioService.excluir(codigo);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
}

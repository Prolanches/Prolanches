package br.com.ProjecJava.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.ProjecJava.dto.PerfilDTO;
import br.com.ProjecJava.service.PerfilService;

@Path("perfil")
public class Perfil_Controller {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<PerfilDTO> listPerfil() {
		PerfilService perfilService = new PerfilService();
		try {
			return perfilService.listarPerfil();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}

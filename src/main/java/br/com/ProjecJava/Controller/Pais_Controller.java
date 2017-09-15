package br.com.ProjecJava.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.ProjecJava.dto.PaisDTO;
import br.com.ProjecJava.service.PaisService;

@Path("Pais")
public class Pais_Controller {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<PaisDTO> listaPais() {
		PaisService paisService = new PaisService();
		try {
			return paisService.listarPais();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}

package br.com.ProjecJava.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.ProjecJava.dto.Tipo_UnidadeDTO;
import br.com.ProjecJava.service.Tipo_UnidadeService;

@Path("tipoUnidade")
public class Tipo_UnidadeController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<Tipo_UnidadeDTO> listtipoUnidade() {
		Tipo_UnidadeService tipoUnidadeService = new Tipo_UnidadeService();
		try {
			return tipoUnidadeService.listarTiposUnidades();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}

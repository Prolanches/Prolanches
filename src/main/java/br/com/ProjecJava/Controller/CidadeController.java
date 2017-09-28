package br.com.ProjecJava.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.ProjecJava.dto.CidadeDTO;
import br.com.ProjecJava.service.CidadeService;



@Path("cidade")
public class CidadeController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<CidadeDTO>  listaCidade() {
		CidadeService cidadeService = new CidadeService();
		try {
			return cidadeService.listarCidades();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}

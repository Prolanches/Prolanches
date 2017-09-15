package br.com.ProjecJava.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.ProjecJava.dto.EstadoDTO;
import br.com.ProjecJava.service.EstadoService;



@Path("Estado")
public class Estado_Controller {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<EstadoDTO>  listaEstado() {
		EstadoService estadoService = new EstadoService();
		try {
			return estadoService.listarEstado();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}

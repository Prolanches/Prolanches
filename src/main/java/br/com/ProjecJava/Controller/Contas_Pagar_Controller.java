package br.com.ProjecJava.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.ProjecJava.dto.Contas_PagarDTO;
import br.com.ProjecJava.service.Contas_PagarService;


@Path("contaspagar")
public class Contas_Pagar_Controller {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<Contas_PagarDTO> listContasReceber() {
		Contas_PagarService contasPagarService = new Contas_PagarService();
		try {
			return contasPagarService.listarContasPagar();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response create(Contas_PagarDTO contas_Pagar) {
		Contas_PagarService contasPagarService = new Contas_PagarService();
		try {
			contasPagarService.inserir(contas_Pagar);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

}

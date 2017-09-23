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

import br.com.ProjecJava.dto.Contas_ReceberDTO;
import br.com.ProjecJava.service.Contas_ReceberService;


@Path("contasreceber")
public class Contas_Receber_Controller {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<Contas_ReceberDTO> listContasReceber() {
		Contas_ReceberService contasreceberService = new Contas_ReceberService();
		try {
			return contasreceberService.listarContas_Receber();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response create(Contas_ReceberDTO contas_receber) {
		Contas_ReceberService contasreceberService = new Contas_ReceberService();
		try {
			contasreceberService.inserir(contas_receber);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

}

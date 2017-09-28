package br.com.ProjecJava.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.ProjecJava.dto.Tipo_OperacaoDTO;
import br.com.ProjecJava.service.Tipo_OperacaoService;

@Path("tipoOperacao")
public class Tipo_OperacaoController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<Tipo_OperacaoDTO> listTipoOperacao() {
		Tipo_OperacaoService tipoOperacaoService = new Tipo_OperacaoService();
		try {
			return tipoOperacaoService.listarTipo_Operacao();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}

package br.com.ProjecJava.Controller;

import java.sql.SQLException;

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



public class Consultas_Controller {
	/*
	@GET -> esta operação serve para ler, temos duas possibilidades uma de listar e outra de chamado do objeto
	
	@Produces(MediaType.APPLICATION_JSON)
	
	@Path("{codigo}/") -> indica o endereço que o serviço será acessada
	
	public "<Nome da classe DTO>" getPessoa(@PathParam("codigo") int codigo) {
		PessoaService pessoaService = new PessoaService();
		try {
			return pessoaService.buscarPessoaPorCodigo(codigo).toDTO();
		} catch (SQLException e) {
			e.printStackTrace();
			return new PessoaDTO();
		}
	}

	@POST -> esta operação serve para criar
	
	@Consumes(MediaType.APPLICATION_JSON)
	
	@Path("/")
	
	public Response create(PessoaDTO pessoa) {
		PessoaService pessoaService = new PessoaService();
		try {
			pessoaService.inserir(pessoa.toPessoa());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT -> esta operação server para fazer o update 
	 
	@Consumes(MediaType.APPLICATION_JSON)
	
	@Path("/")
	
	public Response update(PessoaDTO pessoa) {
		PessoaService pessoaService = new PessoaService();
		try {
			pessoaService.alterar(pessoa.toPessoa());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DELETE -> esta  operação serve para deletar
	
	@Path("{codigo}/")
	
	public Response delete(@PathParam("codigo") int codigo) {
		PessoaService pessoaService = new PessoaService();
		try {
			pessoaService.excluir(codigo);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
*/
}

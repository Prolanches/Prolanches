package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.Contas_PagarDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Contas_Pagar;

public class Contas_PagarService {

	public void inserir(Contas_Pagar contasPagar) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()){
			new Contas_PagarDAO(conex).inserir(contasPagar);
		}
	}
	public static List<Contas_Pagar> listarContasPagar() throws SQLException {
		try(Connection conex = new ConnectionPoolOracle().getConnection()){
			return new Contas_PagarDAO(conex).listarContasPagar();
		}
	}
	
}

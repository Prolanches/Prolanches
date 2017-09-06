package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.ProjecJava.DAO.SuprimentoDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Suprimento;

public class SuprimentoService {

	public void inserir(Suprimento suprimento) throws SQLException {
		try(Connection conex = new ConnectionPoolOracle().getConnection()) {
			new SuprimentoDAO(conex).inserir(suprimento);
		}
	}
	public void alterar(Suprimento suprimento) throws SQLException {
		try(Connection conex = new ConnectionPoolOracle().getConnection()) {
			new SuprimentoDAO(conex).alterar(suprimento);
		}
	}
	public void excluir(int codigo) throws SQLException {
		try(Connection conex = new ConnectionPoolOracle().getConnection()) {
			new SuprimentoDAO(conex).excluir(codigo);
		}
	}
	public static List<Suprimento> listarSuprimentos() throws SQLException {
		try(Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new SuprimentoDAO(conex).listarSuprimentos();
		}
	}
}

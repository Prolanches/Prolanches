package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.MarcaDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Marca;

public class MarcaService {

	public void inserir(Marca marca) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()){
			new MarcaDAO(conex).inserir(marca);
		}
	}
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new MarcaDAO(conex).excluir(codigo);
		}
	}
	public static List<Marca> listarMarca() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new MarcaDAO(conex).listarMarca();
		}
	}
}

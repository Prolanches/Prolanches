package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.Produto_SuprimentoDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Produto_Suprimento;

public class Produto_SuprimentoService {

	public void inserir(Produto_Suprimento produSupri) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Produto_SuprimentoDAO(conex).inserir(produSupri);
		}		
	}
	public void alterar(Produto_Suprimento produSupri) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Produto_SuprimentoDAO(conex).alterar(produSupri);
		}
	}
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Produto_SuprimentoDAO(conex).excluir(codigo);
		}
	}
	public static List<Produto_Suprimento> listarProdutoSuprimento() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new Produto_SuprimentoDAO(conex).listarProdutoSuprimento();
		}
	}
}

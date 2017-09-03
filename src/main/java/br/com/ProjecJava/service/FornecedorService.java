package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.ProjecJava.DAO.FornecedorDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Fornecedor;

public class FornecedorService {

	public void inserir(Fornecedor fornecedor) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(conex).inserir(fornecedor);
		}
	}

	public void alterar(String nome, String cnpj, int endereco, String telefone, String email)
			throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(conex).alterar(nome, cnpj, endereco, telefone, email);
		}
	}

	public void excluir(String nome) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(conex).excluir(nome);
		}
	}

}

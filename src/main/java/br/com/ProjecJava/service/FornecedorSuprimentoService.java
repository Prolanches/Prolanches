package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.ProjecJava.DAO.FornecedorSuprimentoDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Fornecedor;
import br.com.ProjecJava.model.Suprimento;

public class FornecedorSuprimentoService {

	public void inserir(Fornecedor fornesupri) throws SQLException {
		try(Connection conex = new ConnectionPoolOracle().getConnection()){
			new FornecedorSuprimentoDAO(conex).inserir(fornesupri);
		}
	}
	public void alterar( int codigo, Fornecedor fornecedor, Suprimento suprimento) throws SQLException {
		try(Connection conex = new ConnectionPoolOracle().getConnection()){
			new FOrnecedorSuprimentoDAO(conex).alterar(codigo,fornecedor,suprimento);
		}
	}
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()){
			new FornecedorSuprimentoDAO(conex).excluir(codigo);
		}
	}
	public static List<Fornecedor>
}

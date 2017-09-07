package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.Fornecedor_SuprimentoDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Fornecedor;
import br.com.ProjecJava.model.Fornecedor_Suprimento;
import br.com.ProjecJava.model.Suprimento;

public class Fornecedor_SuprimentoService {

	public void inserir(Fornecedor_Suprimento fornesupri) throws SQLException {
		try(Connection conex = new ConnectionPoolOracle().getConnection()){
			new Fornecedor_SuprimentoDAO(conex).inserir(fornesupri);
		}
	}
	public void alterar( int codigo, Fornecedor fornecedor, Suprimento suprimento) throws SQLException {
		try(Connection conex = new ConnectionPoolOracle().getConnection()){
			new Fornecedor_SuprimentoDAO(conex).alterar(codigo,fornecedor,suprimento);
		}
	}
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()){
			new Fornecedor_SuprimentoDAO(conex).excluir(codigo);
		}
	}
	public static List<Fornecedor_Suprimento> listarForneSupri() throws SQLException {
		try(Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new Fornecedor_SuprimentoDAO(conex).listarForneSupri();
		}
	}
}

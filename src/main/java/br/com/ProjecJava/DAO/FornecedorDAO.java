package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.ProjecJava.model.Fornecedor;

public class FornecedorDAO {

	private final Connection conex;
	
	public FornecedorDAO(Connection con) {
		this.conex = con;
	}
	
	public boolean inserir(Fornecedor fornecedor) throws SQLException {
		String sql = "INSERT INTO FORNECEDOR (FOR_COD,FOR_NOME,FOR_CNPJ,FOR_ENDERECO_COD,FOR_TELEFONE,FOR_EMAIL)VALUES(SEQ_FORNECEDOR.nextval,?,?,?,?,?)";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, fornecedor.getNome());
		statement.setString(2, fornecedor.getCnpj());
		statement.setInt(3, fornecedor.getEndereco().getCodigo());
		statement.setString(4, fornecedor.getTelefone());
		statement.setString(5, fornecedor.getEmail());
		
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(String nome, String cnpj, int endereco, String telefone, String email) throws SQLException {
		String sql = "UPDATE FORNECEDOR SET FOR_NOME = ?, FOR_CNPJ = ?, FOR_ENDERECO_COD = ?, FOR_TELEFONE = ?, FOR_EMAIL = ? WHERE FOR_NOME = ?";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setString(2, cnpj);
		statement.setInt(3, endereco);
		statement.setString(4, telefone);
		statement.setString(5, email);
		statement.setString(6, nome);
		
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(String nome) throws SQLException {
		String sql = "DELETE FORNECEDOR WHERE FOR_NOME = ?";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, nome);
		
		return statement.executeUpdate() > 0;
	}
}

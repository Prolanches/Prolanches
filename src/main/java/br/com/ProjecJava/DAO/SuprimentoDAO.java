package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.ProjecJava.model.Suprimento;

public class SuprimentoDAO {

	private final Connection conex;
	
	public SuprimentoDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir(Suprimento suprimento) throws SQLException {
		String sql = "INSERT INTO SUPRIMENTO(SUPRI_COD,SUPRI_NOME,SUPRI_TIPO_UND_COD,SUPRI_QUANTIDADE,SUPRI_CUSTO,SUPRI_FORNECEDOR,SUPRI_MARCA_COD) VALUES(SEQ_SUPRIMENTO.nextval,?,?,?,?,?,?)";
		
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, suprimento.getNome());
		statement.setInt(2, suprimento.getTipoUnidade().getCodigo());
		statement.setInt(3, suprimento.getQuantidade());
		statement.setDouble(4, suprimento.getCusto());
		statement.setInt(5, suprimento.getFornecedor().getCodigo());
		statement.setInt(6, suprimento.getMarca().getCodigo());
		
		return statement.executeUpdate() > 0;
	}
	public boolean alterar(Suprimento suprimento) throws SQLException {
		String sql = "UPDATE SUPRIMENTO SET SUPRI_NOME = ?, SUPRI_TIPO_UND_COD = ?, SUPRI_QUANTIDADE = ?, SUPRI_CUSTO = ?, SUPRI_FORNECEDOR = ?, SUPRI_MARCA_COD = ? WHERE SUPRI_COD = ?";
		
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, suprimento.getNome());
		statement.setInt(2, suprimento.getTipoUnidade().getCodigo());
		statement.setInt(3, suprimento.getQuantidade());
		statement.setDouble(4, suprimento.getCusto());
		statement.setInt(5, suprimento.getFornecedor().getCodigo());
		statement.setInt(6, suprimento.getMarca().getCodigo());
		statement.setInt(7, suprimento.getCodigo());
		
		return statement.executeUpdate() > 0;
	}
	public boolean excluir(int codigo) throws SQLException {
		String sql = "DELETE EMPRESA WHERE SUPRI_COD = ?";
		
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);
		
		return statement.executeUpdate() > 0;
	}
	
}

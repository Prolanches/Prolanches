package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.model.Fornecedor;
import br.com.ProjecJava.model.Fornecedor_Suprimento;
import br.com.ProjecJava.model.Marca;
import br.com.ProjecJava.model.Suprimento;

public class Fornecedor_SuprimentoDAO {

	private final Connection conex;
	
	public Fornecedor_SuprimentoDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir(Fornecedor_Suprimento forneSupri) throws SQLException {
		String sql = "INSERT INTO FORNECEDOR_SUPRIMENTOS (FOR_SUP_COD,FOR_SUP_FORNECEDOR_COD,FOR_SUP_SUPRIMENTO_COD)VALUES(SEQ_FORNECEDOR_SUPRIMENTOS.nextval,?,?)";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, forneSupri.getFornecedor().getCodigo());
		statement.setInt(2, forneSupri.getSuprimento().getCodigo());
		
		return statement.executeUpdate() > 0;
	}
	public boolean alterar(int codigo, Fornecedor fornecedor, Suprimento suprimento) throws SQLException {
		String sql = "UPDATE FORNECEDOR_SUPRIMENTOS SET FOR_SUP_FORNECEDOR_COD = ?, FOR_SUP_SUPRIMENTO_COD = ? WHERE FOR_SUP_COD = ?";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, fornecedor.getCodigo());
		statement.setInt(2, suprimento.getCodigo());
		statement.setInt(3, codigo);
		
		return statement.executeUpdate() > 0;
	}
	public boolean excluir(int codigo) throws SQLException {
		String sql = "DELETE FORNECEDOR_SUPRIMENTOS WHERE FOR_SUP_COD = ?";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);
		
		return statement.executeUpdate() > 0;
	}
	public List<Fornecedor_Suprimento> listarForneSupri() throws SQLException {
		List<Fornecedor_Suprimento> lForneSupri = new ArrayList<>();
		
		String sql = "SELECT * FROM FORNECEDOR_SUPRIMENTOS"
				+ "INNER JOIN FORNECEDOR ON FORNECEDOR_SUPRIMENTOS.FOR_SUP_FORNECEDOR_COD = FORNECEDOR.FOR_COD"
				+ "INNER JOIN SUPRIMENTO ON FORNECEDOR_SUPRIMENTOS.FOR_SUP_SUPRIMENTO_COD = SUPRIMENTO.SUPRI_COD"
				+ "INNER JOIN MARCA ON SUPRIMENTO.SUPRI_MARCA_COD = MARCA.MARCA_COD";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try(ResultSet rs = stmt.getResultSet()){
				while(rs.next()) {
					int marcaCod = rs.getInt("MARCA_COD");
					String marcaNome = rs.getString("MARCA_NOME");
					Marca marca = new Marca(marcaCod, marcaNome);
					int supriCod = rs.getInt("SUPRI_COD");
					String supriNome = rs.getString("SUPRI_NOME");
					Suprimento supri = new Suprimento(supriCod, supriNome, null, 0, 0, null, marca);
					int forneCod = rs.getInt("FOR_COD");
					String forneNome = rs.getString("FOR_NOME");
					Fornecedor forne = new Fornecedor(forneCod, forneNome, null, null, null, null);
					int forSupCod = rs.getInt("FOR_SUP_COD");
					Fornecedor_Suprimento forneSupri = new Fornecedor_Suprimento(forSupCod, forne, supri);
					lForneSupri.add(forneSupri);
				}
			}
		}
		return lForneSupri;
				
	}
}

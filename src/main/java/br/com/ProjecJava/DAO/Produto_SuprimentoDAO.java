package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.model.Produto;
import br.com.ProjecJava.model.Produto_Suprimento;
import br.com.ProjecJava.model.Suprimento;

public class Produto_SuprimentoDAO {

	private final Connection conex;
	
	public Produto_SuprimentoDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir (Produto_Suprimento produSupri) throws SQLException {
		String sql = " INSERT INTO PRODUTO_SUPRIMENTO(PS_COD,PS_SUPRIMENTO_COD,PS_PRODUTO_COD,PS_QUANTIDADE,PS_CUSTO) VALUES (SEQ_PRODUTO_SUPRIMENTO.NEXTVAL,?,?,?,?)";
		
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, produSupri.getSuprimento().getCodigo());
		statement.setInt(2, produSupri.getProduto().getCodigo());
		statement.setDouble(3, produSupri.getQuantidade());
		statement.setDouble(4, produSupri.getCusto());
		
		return statement.executeUpdate() >0 ;
	}
	public boolean alterar(Produto_Suprimento produSupri) throws SQLException {
		String sql = " UPDATE PRODUTO_SUPRIMENTO SET PS_SUPRIMENTO_COD = ?, PS_PRODUTO_COD = ?, PS_QUANTIDADE = ?, PS_CUSTO = ? WHERE PS_COD = ?";
		
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, produSupri.getSuprimento().getCodigo());
		statement.setInt(2, produSupri.getProduto().getCodigo());
		statement.setDouble(3, produSupri.getQuantidade());
		statement.setDouble(4, produSupri.getCusto());
		statement.setInt(5, produSupri.getCodigo());
		
		return statement.executeUpdate() > 0;
	}
	public boolean excluir(int codigo) throws SQLException {
		String sql = " DELETE PRODUTO_SUPRIMENTO WHERE PS_COD = ?";
		
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);
		
		return statement.executeUpdate() > 0;
	}
	public List<Produto_Suprimento> listarProdutoSuprimento() throws SQLException {
		List<Produto_Suprimento> lProduSupri = new ArrayList<>();
		
		String sql = " SELECT * FROM PRODUTO_SUPRIMENTO "
				+ " INNER JOIN SUPRIMENTO ON PRODUTO_SUPRIMENTO.PS_SUPRIMENTO_COD = SUPRIMENTO.SUPRI_COD "
				+ " INNER JOIN PRODUTO ON PRODUTO_SUPRIMENTO.PS_PRODUTO_COD = PRODUTO.PROD_COD ";
		try(PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try(ResultSet rs = stmt.getResultSet()) {
				while(rs.next()) {
					int supriCod = rs.getInt("SUPRI_COD");
					String supriNome = rs.getString("SUPRI_NOME");
					Suprimento suprimento = new Suprimento(supriCod, supriNome, null, 0, 0, null);
					int produCod = rs.getInt("PROD_COD");
					String produNome = rs.getString("PROD_NOME");
					Produto produto = new Produto(produCod, produNome, 0, 0);
					int psCod = rs.getInt("PS_COD");
					double psQtd = rs.getDouble("PS_QUANTIDADE");
					double psCusto = rs.getDouble("PS_CUSTO");
					Produto_Suprimento produSupri = new Produto_Suprimento(psCod, suprimento, produto, psQtd, psCusto);
					lProduSupri.add(produSupri);
				}
			}
		}
		return lProduSupri;
				
	}
}

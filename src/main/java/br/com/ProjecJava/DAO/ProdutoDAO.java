/**
 * Este é o pacote responsavel pela ligação com o Banco 
 */
package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.dto.ProdutoDTO;
import br.com.ProjecJava.model.Produto;


/**
 * Esta é a Classe responsavel pelos Produtos
 * @author Lucas Braz
 *
 */
public class ProdutoDAO {
	/**
	 * Configurações da Conexão
	 */
	private final Connection conex;
/**
 * Parametros da Conexão 
 * @param con
 */
	public ProdutoDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir(Produto produto) throws SQLException{
		String sqlsequence = "SELECT SEQ_PRODUTO.nextval FROM DUAL";
		
		try (PreparedStatement stmt = conex.prepareStatement(sqlsequence)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					produto.setCodigo(rs.getInt(1));
					
				}
			}
		}
		
		
		String sql = "INSERT INTO PRODUTO (PROD_COD, PROD_NOME, PROD_MARGEM_LUCRO, PROD_PRECO) VALUES (?,?,?,?)";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1,produto.getCodigo());
		statement.setString(2, produto.getNome());
		statement.setDouble(3, produto.getMargemLucro());
		statement.setDouble(4, produto.getPreco());
		
	
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(Produto produto) throws SQLException{
		String sql = "UPDATE PRODUTO SET PROD_NOME = ?, PROD_MARGEM_LUCRO = ?, PROD_PRECO = ? WHERE PROD_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, produto.getNome() );
		statement.setDouble(2, produto.getMargemLucro());
		statement.setDouble(3, produto.getPreco());
		statement.setInt(4, produto.getCodigo());
	
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int codigo) throws SQLException{
		String sql = "DELETE PRODUTO WHERE PROD_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<ProdutoDTO> lista() throws SQLException {
		List<ProdutoDTO> lProduto = new ArrayList<>();

		String sql = "SELECT * FROM PRODUTO";;
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("PROD_COD");
					String nome = rs.getString("PROD_NOME");
					double margemLucro = rs.getDouble("PROD_MARGEM_LUCRO");
					double preco = rs.getDouble("PROD_PRECO");
					
					
				
					
					Produto produto = new Produto(codigo, nome, margemLucro, preco); 
					lProduto.add((produto).toDTO());
				}
			}
		}

		return lProduto;

	}
}

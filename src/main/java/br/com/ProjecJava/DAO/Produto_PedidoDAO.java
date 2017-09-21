/**
 * Este é o pacote responsavel pela ligação com o Banco 
 */
package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.ProjecJava.model.Pedido;
import br.com.ProjecJava.model.Produto;
import br.com.ProjecJava.model.Produto_Pedido;
import br.com.ProjecJava.model.Tipo_Operacao;
/**
 * Esta é a Classe responsavel pelos Produtos Pedido
 * @author Lucas Braz
 *
 */
public class Produto_PedidoDAO {
	/**
	 * Configurações da Conexão
	 */
	private final Connection conex;
/**
 * Parametros da Conexão 
 * @param con
 */
	public Produto_PedidoDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir(Produto_Pedido produto_pedido) throws SQLException{
		String sql = "INSERT INTO PRODUTO_PEDIDO (PROD_PED_COD, PROD_PED_PEDIDO_COD, PROD_PED_PRODUTO_COD, PROD_PED_NOME_CLIENTE) VALUES (SEQ_PRODUTO_PEDIDO.nextval, ?,?,?)";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, produto_pedido.getPedido().getCodigo());
		statement.setInt(2, produto_pedido.getProduto().getCodigo());
		statement.setString(3, produto_pedido.getNomeCliente());
		
	
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(Produto_Pedido produto_pedido) throws SQLException{
		String sql = "UPDATE PRODUTO_PEDIDO SET PROD_PED_PEDIDO_COD = ?, PROD_PED_PRODUTO_COD = ?, PROD_PED_NOME_CLIENTE = ? WHERE PROD_PED_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, produto_pedido.getPedido().getCodigo());
		statement.setInt(2, produto_pedido.getProduto().getCodigo());
		statement.setString(3, produto_pedido.getNomeCliente());
		statement.setInt(4, produto_pedido.getCodigo());
	
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int codigo) throws SQLException{
		String sql = "DELETE PRODUTO_PEDIDO WHERE PROD_PED_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluirporpedido(int codigo) throws SQLException{
		String sql = "DELETE PRODUTO_PEDIDO WHERE PROD_PED_PEDIDO_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<Produto_Pedido> lista() throws SQLException {
		List<Produto_Pedido> lProduto_Pedido = new ArrayList<>();

		String sql = "SELECT * FROM PRODUTO_PEDIDO"
				+ " INNER JOIN PEDIDO ON PRODUTO_PEDIDO.PROD_PED_PEDIDO_COD = PEDIDO.PED_COD"
		        + " INNER JOIN PRODUTO ON PRODUTO_PEDIDO.PROD_PED_PRODUTO_COD = PRODUTO.PROD_COD"
				+ " INNER JOIN TIPO_OPERACAO ON PEDIDO.PED_TIPO_OP_COD = TIPO_OPERACAO.TIPO_OP_COD";;
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("PROD_PED_COD");
					int codigoPedido = rs.getInt("PROD_PED_PEDIDO_COD");
					Date dataPedido = rs.getDate("PED_DATA");
					int codigoTipoOperacao = rs.getInt("PED_TIPO_OP_COD");
					String nomeOperacao = rs.getString("TIPO_OP_NOME");
					double valorPedido = rs.getDouble("PED_VALOR");
					int codigoProduto = rs.getInt("PROD_PED_PRODUTO_COD");
					String nomeCliente = rs.getString("PROD_PED_NOME_CLIENTE");
					
					
				
					
					Produto_Pedido produto_pedido = new Produto_Pedido(codigo, new Pedido(codigoPedido, dataPedido, new Tipo_Operacao(codigoTipoOperacao, nomeOperacao),valorPedido), new Produto (codigoProduto,null,0,0), nomeCliente); 
					lProduto_Pedido.add(produto_pedido);
				}
			}
		}

		return lProduto_Pedido;

	}
}


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

import br.com.ProjecJava.dto.PedidoDTO;
import br.com.ProjecJava.model.Pedido;
import br.com.ProjecJava.model.Tipo_Operacao;

/**
 * Esta é a Classe responsavel pelos Pedidos
 * @author Lucas Braz
 *
 */
public class PedidoDAO {
	/**
	 * Configurações da Conexão
	 */
	private final Connection conex;
/**
 * Parametros da Conexão 
 * @param con
 */
	public PedidoDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir(Pedido pedido) throws SQLException{
    String sqlsequence = "SELECT SEQ_PEDIDO.nextval FROM DUAL";
		
		try (PreparedStatement stmt = conex.prepareStatement(sqlsequence)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					pedido.setCodigo(rs.getInt(1));
					
				}
			}
		}
		
		String sql = "INSERT INTO PEDIDO (PED_COD, PED_DATA, PED_TIPO_OP_COD, PED_VALOR) VALUES (?,?,?,?)";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, pedido.getCodigo());
		java.sql.Date sqlDate = new java.sql.Date(pedido.getDataPedido().getTime());
		statement.setDate(2, sqlDate);
		statement.setInt(3, pedido.getTipoOperacao().getCodigo());
		statement.setDouble(4, pedido.getValor());
		
	
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(Pedido pedido) throws SQLException{
		String sql = "UPDATE PEDIDO SET PED_DATA =	?, PED_TIPO_OP_COD = ?, PED_VALOR = ? WHERE PED_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		java.sql.Date sqlDate = new java.sql.Date(pedido.getDataPedido().getTime());
		statement.setDate(1, sqlDate);
		statement.setInt(2, pedido.getTipoOperacao().getCodigo());
		statement.setDouble(3, pedido.getValor());
		statement.setInt(4, pedido.getCodigo());
	
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int codigo) throws SQLException{
		String sql = "DELETE PEDIDO WHERE PED_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<PedidoDTO> lista() throws SQLException {
		List<PedidoDTO> lPedido = new ArrayList<>();

		String sql = "SELECT * FROM PEDIDO "
				+ " INNER JOIN TIPO_OPERACAO ON PEDIDO.PED_TIPO_OP_COD = TIPO_OPERACAO.TIPO_OP_COD ";;
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("PED_COD");
					Date dataPedido = rs.getDate("PED_DATA");
					int codigoTipoOp = rs.getInt("PED_TIPO_OP_COD");
					String nomeTipoOp = rs.getString("TIPO_OP_NOME");
					double valor = rs.getDouble("PED_VALOR");
					
					
				
					
					Pedido pedido = new Pedido(codigo, dataPedido, new Tipo_Operacao(codigoTipoOp, nomeTipoOp), valor); 
					lPedido.add(pedido.toDTO());
				}
			}
		}

		return lPedido;

	}
}

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

import br.com.ProjecJava.dto.Historico_PedidoDTO;
import br.com.ProjecJava.model.Funcionario;
import br.com.ProjecJava.model.Historico_Pedido;
import br.com.ProjecJava.model.Pedido;
import br.com.ProjecJava.model.Status_Pedido;
/**
 * Esta é a Classe responsavel pelos Históricos dos Pedidos
 * @author Lucas Braz
 *
 */
public class Historico_PedidoDAO {
	/**
	 * Configurações da Conexão
	 */
	private final Connection conex;
/**
 * Parametros da Conexão 
 * @param con
 */
	public Historico_PedidoDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir(Historico_Pedido historico_pedido) throws SQLException{
		String sql = "INSERT INTO HISTORICO_PEDIDO (HIT_PED_COD, HIT_PED_STATUS_COD, HIT_PED_PEDIDO_COD, HIT_PED_FUNCIONARIO_COD) VALUES (SEQ_HISTORICO_PEDIDO.nextval, ?,?,?)";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, historico_pedido.getStatusPedido().getCodigo());
		statement.setInt(2, historico_pedido.getPedido().getCodigo());
		statement.setInt(3, historico_pedido.getFuncionario().getCodigo());
		
	
		return statement.executeUpdate() > 0;
	}
	
	public List<Historico_PedidoDTO> lista() throws SQLException {
		List<Historico_PedidoDTO> lHistorico_Pedido = new ArrayList<>();

		String sql = "SELECT * FROM HISTORICO_PEDIDO"
				+ " INNER JOIN PEDIDO ON HISTORICO_PEDIDO.HIT_PED_PEDIDO_COD = PEDIDO.PED_COD"
		        + " INNER JOIN STATUS_PEDIDO ON HISTORICO_PEDIDO.HIT_PED_STATUS_COD = STATUS_PEDIDO.STA_PED_COD"
				+ " INNER JOIN FUNCIONARIO ON HISTORICO_PEDIDO.HIT_PED_FUNCIONARIO_COD = FUNCIONARIO.FUN_COD";;
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					
					int codigoFuncionario = rs.getInt("FUN_COD");
					String nomeFuncionario = rs.getString("FUN_NOME");
					Funcionario funcionario = new Funcionario(codigoFuncionario,nomeFuncionario,null,null);
					
					int codigoPedido = rs.getInt("PED_COD");
					Date dataPedido = rs.getDate("PED_DATA");
					double valorPedido = rs.getDouble("PED_VALOR");
					Pedido pedido = new Pedido(codigoPedido,dataPedido,null,valorPedido);
				
					int codigoStatus = rs.getInt("STA_PED_COD");
					String status = rs.getString("STA_PED_NOME");
					Status_Pedido statuspedido = new Status_Pedido(codigoStatus,status);
					
					int codigo = rs.getInt("HIT_PED_COD");
					Historico_Pedido historico_pedido = new Historico_Pedido(codigo, pedido, funcionario, statuspedido);
					lHistorico_Pedido.add(historico_pedido.toDTO());
				}
			}
		}

		return lHistorico_Pedido;
	}
}



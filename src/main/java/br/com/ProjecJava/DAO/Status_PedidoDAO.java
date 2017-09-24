/**
 * Este pacote é responsável pelo acesso ao banco
 */
package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.dto.Status_PedidoDTO;
import br.com.ProjecJava.model.Status_Pedido;
/**
 * Classe responsável pelo Status do Pedido
 * 
 * @author Lucas Braz
 *
 */
public class Status_PedidoDAO {
	/**
	 * Configurações da conexão
	 */
	private final Connection conex;

	public Status_PedidoDAO(Connection con) {
		this.conex = con;
	}

	/**
	 * Método utilizado para listar todos os Status do Pedido
	 * 
	 * @return - retorna uma lista de todos os Status do Pedido
	 * @throws SQLException
	 */
	public List<Status_PedidoDTO> listarStatus_Pedido() throws SQLException {
		List<Status_PedidoDTO> lStatus_Pedido = new ArrayList<>();

		String sql = "SELECT * FROM STATUS_PEDIDO";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("STA_PED_COD");
					String nome = rs.getString("STA_PED_NOME");
					Status_Pedido status = new Status_Pedido(codigo, nome);
					lStatus_Pedido.add(status.toDTO());
				}
			}
		}
		return lStatus_Pedido;
	}
}

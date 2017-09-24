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

import br.com.ProjecJava.dto.Contas_ReceberDTO;
import br.com.ProjecJava.model.Contas_Receber;
import br.com.ProjecJava.model.Pedido;

/**
 * Esta é a Classe responsavel pelo Contas à Receber
 * @author Lucas Braz
 *
 */
public class Contas_ReceberDAO {
	/**
	 * Configurações da Conexão
	 */
	private final Connection conex;
/**
 * Parametros da Conexão 
 * @param con
 */
	public Contas_ReceberDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir(Contas_Receber contas_receber) throws SQLException{
		String sql = "INSERT INTO CONTAS_RECEBER (CONT_REC_COD, CONT_REC_PEDIDO_COD, CONT_REC_DATA, CONT_REC_VALOR) VALUES (SEQ_CONTAS_RECEBER.nextval, ?,?,?)";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, contas_receber.getPedido().getCodigo());
		java.sql.Date sqlDate = new java.sql.Date(contas_receber.getData().getTime());
		statement.setDouble(3, contas_receber.getValor());
		statement.setDate(2, sqlDate);

		
	
		return statement.executeUpdate() > 0;
	}
	
	public List<Contas_ReceberDTO> lista() throws SQLException {
		List<Contas_ReceberDTO> lContas_Receber = new ArrayList<>();

		String sql = "SELECT * FROM CONTAS_RECEBER"
				+ " INNER JOIN PEDIDO ON CONTAS_RECEBER.CONT_REC_PEDIDO_COD = PEDIDO.PED_COD";;
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					
					int codigoPedido = rs.getInt("PED_COD");
					Date dataPedido = rs.getDate("PED_DATA");
					double valorPedido = rs.getDouble("PED_VALOR");
					Pedido pedido = new Pedido(codigoPedido,dataPedido,null,valorPedido);
				
					int codigo = rs.getInt("CONT_REC_COD");
					Date dtPedido = rs.getDate("CONT_REC_DATA");
					double valor = rs.getDouble("CONT_REC_VALOR");
					Contas_Receber contas_receber = new Contas_Receber(codigo, pedido, dtPedido, valor);
					lContas_Receber.add(contas_receber.toDTO());
				}
			}
		}

		return lContas_Receber;
	}
}

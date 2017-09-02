/**
 * Este pacote é responsavel pela acesso ao Banco
 */
package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Pais;
/**
 * Classe responsavel pela pesquisa de Estados
 * @author Lucas Braz
 *
 */
public class EstadoDAO {
	/**
	 * Configurações da Conexão
	 */
	private final Connection conex;
/**
 * Parametros da Conexão 
 * @param con
 */
	public EstadoDAO(Connection con) {
		this.conex = con;
		
	}
/**
 * Metodo de listagem dos Estados 
 * @param id codigo do Estado
 * @return retorno dos Estados
 * @throws SQLException 
 */
	public List<Estado> lista() throws SQLException {
		List<Estado> lEstado = new ArrayList<>();

		String sql = "select * from ESTADO";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("ESTADO_COD");
					String nome = rs.getString("ESTADO_NOME");
					String uf = rs.getString("ESTADO_UF");
					String pais = rs.getString("ESTADO_PAIS_COD");
					Estado estado = new Estado(codigo, nome, uf, null);
					lEstado.add(estado);
				}
			}


		return lEstado;
	}
}
	
}

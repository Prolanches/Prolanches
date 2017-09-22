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

import br.com.ProjecJava.dto.Tipo_UnidadeDTO;
import br.com.ProjecJava.model.Tipo_Unidade;

/**
 * Classe responsável pela ligação com o banco de dados
 * 
 * @author Itamar Havenstein
 *
 */
public class Tipo_UnidadeDAO {
	/**
	 * Configurações da conexão
	 */
	private final Connection conex;

	public Tipo_UnidadeDAO(Connection con) {
		this.conex = con;
	}

	/**
	 * Método utilizado para listar todos os tipos de unidades
	 * 
	 * @return - retorna uma lista de tipos de unidades
	 * @throws SQLException
	 */
	public List<Tipo_UnidadeDTO> listarTiposUnidades() throws SQLException {
		List<Tipo_UnidadeDTO> lTipoUnidade = new ArrayList<>();

		String sql = "SELECT * FROM TIPO_UNIDADE";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("TIPO_UND_COD");
					String nome = rs.getString("TIPO_UND_NOME");
					double tipoU = rs.getDouble("TIPO_UND_UNIDADE");
					Tipo_Unidade tipoUni = new Tipo_Unidade(codigo, nome, tipoU);
					lTipoUnidade.add(tipoUni.toDTO());
				}
			}
		}
		return lTipoUnidade;
	}
}

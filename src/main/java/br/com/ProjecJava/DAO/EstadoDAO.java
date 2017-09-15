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

import br.com.ProjecJava.dto.EstadoDTO;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Pais;

/**
 * Classe responsavel pela pesquisa de Estados
 * 
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
	 * 
	 * @param con
	 */
	public EstadoDAO(Connection con) {
		this.conex = con;

	}

	/**
	 * Metodo de listagem dos Estados
	 * 
	 * @param id
	 *            codigo do Estado
	 * @return retorno dos Estados
	 * @throws SQLException
	 */
	public List<EstadoDTO> lista() throws SQLException {
		List<EstadoDTO> lEstado = new ArrayList<>();

		String sql = "SELECT ESTADO_COD,ESTADO_NOME,ESTADO_UF,PAIS_COD,PAIS_NOME,PAIS_SIGLA "
				+ "FROM ESTADO "
				+ "INNER JOIN PAIS ON (ESTADO_PAIS_COD = PAIS_COD)";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt(1);
					String nome = rs.getString(2);
					String uf = rs.getString(3);
					int codigoPais = rs.getInt(4);
					String nomePais = rs.getString(5);
					String siglaPais = rs.getString(6);
					
					Estado estado = new Estado(codigo, nome, uf, new Pais(codigoPais, nomePais,siglaPais));
					lEstado.add(estado.toDTO());
				}
			}

			return lEstado;
		}
	}

}

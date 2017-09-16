/**
 * Este pacote é responsável pelas classes services
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.CidadeDAO;
import br.com.ProjecJava.dto.CidadeDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Cidade;

/**
 * esta é a classe responsável pela service da cidade
 * 
 * @author Itamar Havenstein
 *
 */
public class CidadeService {

	/**
	 * Método responsável por listar as cidades que estão registradas no banco de
	 * dados.
	 * 
	 * @param id
	 *            codigo do estado
	 * @return mostrará as cidades selecionadas
	 * @throws SQLException
	 */
	public static List<Cidade> listarCidades(int id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new CidadeDAO(con).lista(id);
		}
	}
}

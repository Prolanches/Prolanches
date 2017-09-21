/**
 * Este é o pacote responsavel pelas Classes Service 
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.PerfilDAO;
import br.com.ProjecJava.dto.PerfilDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;

/**
 * Esta é a classe Service do Perfil
 * @author Lucas Braz
 *
 */

public class PerfilService {
	/**
	 * Metodo da listagem de Perfil
	 * @return retornará uma lista de Perfil
	 * @throws SQLException
	 */
	public List<PerfilDTO> listarPerfil() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new PerfilDAO(con).lista();
		}

	}
}

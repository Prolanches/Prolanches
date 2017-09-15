/**
 * Este é o pacote responsavel pelas Classes Service 
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.PaisDAO;
import br.com.ProjecJava.dto.PaisDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Pais;

/**
 * Esta é a classe Service dos Paises
 * @author Lucas Braz
 *
 */
public class PaisService {
	/**
	 * Metodo da listagem de Pais
	 * @return retornará uma lista de Pais
	 * @throws SQLException
	 */
	public List<PaisDTO> listarPais() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new PaisDAO(con).lista();
		}

	
		
	}
}

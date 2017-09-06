/**
 * Pacote responsavel pelas Classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.EstadoDAO;
import br.com.ProjecJava.DAO.PaisDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Pais;

/**
 * Esta é a classe responsavel pela Service dos Estados 
 * @author Lucas Braz
 *
 */
public class EstadoService {
	/**
	 * Este é o metodo responsavel pela listagem dos Estados
	 * 
	 * @return retornará à lista de Estados
	 * @throws SQLException
	 */
	public List<Estado> listarEstado() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new EstadoDAO(con).lista();
		}
}
}
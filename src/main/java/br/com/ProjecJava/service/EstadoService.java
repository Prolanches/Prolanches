/**
 * Pacote responsavel pelas Classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.EstadoDAO;

import br.com.ProjecJava.dto.EstadoDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;


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
	public List<EstadoDTO> listarEstado() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new EstadoDAO(con).lista();
		}
}
}
/**
 * Este Pacote é responsável pelas classes services
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.Tipo_UnidadeDAO;
import br.com.ProjecJava.dto.Tipo_UnidadeDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;

/**
 * Esta classe é responsável pela service do tipo_unidade
 * @author Itamar Havenstein
 *
 */
public class Tipo_UnidadeService {
/**
 * Método utilizado para listar os tipos de unidades
 * @return - retorna os tipos de unidades
 * @throws SQLException
 */
	public static List<Tipo_UnidadeDTO> listarTiposUnidades() throws SQLException {
		try(Connection conex = new ConnectionPoolOracle().getConnection()){
			return new Tipo_UnidadeDAO(conex).listarTiposUnidades();
		}
	}
}

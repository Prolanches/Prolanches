/**
 * Este pacote é responsável pelas classes services
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.MarcaDAO;
import br.com.ProjecJava.dto.MarcaDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Marca;

/**
 * Esta classe é responsável pela service da marca
 * 
 * @author Itamar Havenstein
 *
 */
public class MarcaService {

	/**
	 * Método responsável por inserir as marcas no banco
	 * 
	 * @param marca
	 *            - marca a ser inserida
	 * @throws SQLException
	 */
	public void inserir(MarcaDTO marcaDTO) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			Marca marca = new Marca();
			marca.setNome(marcaDTO.getNomeMarca());
			new MarcaDAO(conex).inserir(marca);
		}
	}

	/**
	 * Método de exclusão da marca
	 * 
	 * @param codigo
	 *            - utilizado para remoção da marca
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new MarcaDAO(conex).excluir(codigo);
		}
	}

	/**
	 * Método utilizado para listar as marcas
	 * 
	 * @return - mostra todas as marcas que estão cadastradas no banco de dados
	 * @throws SQLException
	 */
	public static List<MarcaDTO> listarMarca() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new MarcaDAO(conex).listarMarca();
		}
	}
}

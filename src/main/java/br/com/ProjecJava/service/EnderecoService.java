/**
 * Este pacote é responsável pelas classes Services
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.EnderecoDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Endereco;

/**
 * Esta classe é responsável pela Service do endereco
 * 
 * @author Itamar Havenstein
 *
 */
public class EnderecoService {

	/**
	 * Método responsável por inserir os endereços no banco
	 * 
	 * @param endereco
	 * @throws SQLException
	 */
	public void inserir(Endereco endereco) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new EnderecoDAO(conex).inserir(endereco);
		}
	}

	/**
	 * Método responsável por alterar o nome da rua de um determinado endereço
	 * 
	 * @param codigo
	 *            - parametro utilizado para saber qual endereço alterar
	 * @param rua
	 *            - nova informação
	 * @throws SQLException
	 */
	public void alterarRua(Integer codigo, String rua) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new EnderecoDAO(conex).alterarRua(codigo, rua);
		}
	}

	/**
	 * Método responsável por alterar a cidade do endereço
	 * 
	 * @param codigo
	 *            - parametro utilizado para saber qual endereço alterar
	 * @param cidade
	 *            - nova informação
	 * @throws SQLException
	 */
	public void alterarCidade(Integer codigo, Integer cidade) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new EnderecoDAO(conex).alterarCidade(codigo, cidade);
		}
	}

	/**
	 * Método responsável por excluir um determinado endereço
	 * 
	 * @param codigo
	 *            - parametro utilizado para a exclusão do endereço
	 * @throws SQLException
	 */
	public void excluir(Integer codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new EnderecoDAO(conex).excluir(codigo);
		}
	}

	/**
	 * Método responsável para listar os endereços cadastrados
	 * 
	 * @return - retorna lista de endereços
	 * @throws SQLException
	 */
	public static List<Endereco> listarEnderecos() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new EnderecoDAO(conex).listarEnderecos();
		}
	}
}

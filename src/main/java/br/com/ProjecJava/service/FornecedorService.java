
/**
 * Este Pacote é responsável pelas classes services
 */
package br.com.ProjecJava.service;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.EnderecoDAO;
import br.com.ProjecJava.DAO.FornecedorDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Fornecedor;

/**
 * Esta classe é responsável pela Service do Fornecedor
 * 
 * @author Itamar Havenstein
 *
 */
public class FornecedorService {

	/**
	 * Método responsável por inserir os endereços no banco
	 * 
	 * @param fornecedor
	 *            - construtor utilizado para inserir os dados
	 * @throws SQLException
	 */
	public void inserir(Fornecedor fornecedor) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(conex).inserir(fornecedor);
		}
	}

	/**
	 * Método utilizado para a alteração dos dados do fornecedor
	 * 
	 * @param codigo
	 *            - codigo do fornecedor
	 * @param nome
	 *            - novo nome do fornecedor
	 * @param cnpj
	 *            - novo cnpj do fornecedor
	 * @param endereco
	 *            - novo endereço do fornecedor
	 * @param telefone-
	 *            novo telefone do fornecedor
	 * @param email
	 *            - novo e-mail do fornecedor
	 * @throws SQLException
	 */
	public void alterar(int codigo, String nome, String cnpj, Endereco endereco, String telefone, String email)
			throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(conex).alterar(codigo, nome, cnpj, endereco, telefone, email);
		}
	}

	/**
	 * Método de exclusão de um fornecedor
	 * 
	 * @param codigo
	 *            - codigo do fornecedor para ser excluído
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(conex).excluir(codigo);
		}
	}

	/**
	 * Método utilizado para listar os fornecedores
	 * 
	 * @return - retorna todos os fornecedores cadastrados
	 * @throws SQLException
	 */
	public static List<Fornecedor> listarFornecedores() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new FornecedorDAO(conex).listarFornecedores();
		}
	}

}

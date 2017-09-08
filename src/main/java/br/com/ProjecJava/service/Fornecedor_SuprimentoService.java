/**
 * Este pacote é responsável pelas classes services
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.Fornecedor_SuprimentoDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Fornecedor;
import br.com.ProjecJava.model.Fornecedor_Suprimento;
import br.com.ProjecJava.model.Suprimento;

/**
 * Está classse é responsável pela service do Fornecedor_Suprimento
 * 
 * @author Itamar Havenstein
 *
 */
public class Fornecedor_SuprimentoService {

	/**
	 * Método responsável por inserir Fornecedor_Suprimento
	 * 
	 * @param fornesupri
	 *            - construtor utilizado para inserir os dados
	 * @throws SQLException
	 */
	public void inserir(Fornecedor_Suprimento fornesupri) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Fornecedor_SuprimentoDAO(conex).inserir(fornesupri);
		}
	}

	/**
	 * Método rsponsável por alterar Fornecedor_Suprimento
	 * 
	 * @param codigo
	 *            - parametro código para saber qual linha na tabela será alterado
	 * @param fornecedor-
	 *            paramentro novo do fornecedor
	 * @param suprimento
	 *            - parametro novo do suprimento
	 * @throws SQLException
	 */
	public void alterar(int codigo, Fornecedor fornecedor, Suprimento suprimento) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Fornecedor_SuprimentoDAO(conex).alterar(codigo, fornecedor, suprimento);
		}
	}

	/**
	 * Método responsável por excluir Fornecedor_Suprimento
	 * 
	 * @param codigo
	 *            - parametro utilizado para remover uma linha da tabela onde foi
	 *            salvo os dados de Fornecedor_Suprimento
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Fornecedor_SuprimentoDAO(conex).excluir(codigo);
		}
	}

	/**
	 * Método responsável para listar Fornecedor_Suprimento
	 * 
	 * @return - retorna todos os dados de Fornecedor_Suprimento adicionado no banco
	 * @throws SQLException
	 */
	public static List<Fornecedor_Suprimento> listarForneSupri() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new Fornecedor_SuprimentoDAO(conex).listarForneSupri();
		}
	}
}

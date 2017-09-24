/**
 * este pacote é responsável pelas classes services
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.Contas_PagarDAO;
import br.com.ProjecJava.dto.Contas_PagarDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Contas_Pagar;

/**
 * Esta classe é responsável pela service do contas Pagar
 * 
 * @author Itamar Havenstein
 *
 */
public class Contas_PagarService {

	/**
	 * Método responsável por inserir as contas a pagar
	 * 
	 * @param contasPagar
	 *            - construtor para inserir os dados da contas a pagar
	 * @throws SQLException
	 */
	public void inserir(Contas_Pagar contasPagar) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Contas_PagarDAO(conex).inserir(contasPagar);
		}
	}

	/**
	 * Método para listar as contas a pagar
	 * 
	 * @return - retornara todas as contas inseridas no banco
	 * @throws SQLException
	 */
	public static List<Contas_PagarDTO> listarContasPagar() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new Contas_PagarDAO(conex).listarContasPagar();
		}
	}

}

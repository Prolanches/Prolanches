/**
 * este pacote é responsável pelas classes services
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


import br.com.ProjecJava.DAO.Contas_ReceberDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Contas_Receber;

/**
 * Esta classe é responsável pela service do contas Receber
 * 
 * @author Lucas Braz
 *
 */
public class Contas_ReceberService {

	/**
	 * Método responsável por inserir as contas a receber
	 * 
	 * @param contasPagar construtor para inserir os dados da contas a receber
	 *            
	 * @throws SQLException
	 */
	public void inserir(Contas_Receber contas_receber) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Contas_ReceberDAO(conex).inserir(contas_receber);
		}
	}

	/**
	 * Método para listar as contas a receber
	 * 
	 * @return - retornara todas as contas inseridas no banco
	 * @throws SQLException
	 */
	public static List<Contas_Receber> listarContas_Receber() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new Contas_ReceberDAO(conex).lista();
		}
	}
}

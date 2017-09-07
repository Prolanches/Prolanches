/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


import br.com.ProjecJava.DAO.FuncionarioDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Funcionario;

/**
 * 
 * Esta classe é responsavel pela Classe FuncioanrioService
 * @author Lucas Braz
 *
 */
public class FuncionarioService {
	/**
	 * Este é o metodo responsavel pela listagem do Funcionario
	 * @return mostrará o Funcionario
	 * @throws SQLException 
	 */
	public static List<Funcionario> listarFuncionarios() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new FuncionarioDAO(conex).lista();
		}
	}
	/**
	 * Metodo para inserir 
	 * @param Funcionario
	 * @throws SQLException
	 */
	public void inserir(Funcionario funcionario) throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FuncionarioDAO(conex).inserir(funcionario);
		}
	}
	/**
	 * Metodo alterar
	 * @param Funcionario
	 * @throws SQLException
	 */
	public void alterar(Funcionario funcionario)throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FuncionarioDAO(conex).alterar(funcionario);
		}
	}
	/**
	 * Metodo excluir 
	 * @param Funcionario
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FuncionarioDAO(conex).excluir(codigo);
		}
	}
	
}

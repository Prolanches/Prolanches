/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.EmpresaDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Empresa;



/**
 * Esta classe é responsavel pela Classe EmpresaService
 * @author Lucas Braz
 *
 */
public class EmpresaService {
	
	/**
	 * Este é o metodo responsavel pela listagem da Empresa
	 * @return mostrará a empresa
	 * @throws SQLException 
	 */
	public static List<Empresa> listarEmpresas() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new EmpresaDAO(conex).lista();
		}
	}
	/**
	 * Metodo para inserir 
	 * @param empresa
	 * @throws SQLException
	 */
	public void inserir(Empresa empresa) throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new EmpresaDAO(conex).inserir(empresa);
		}
	}
	/**
	 * Metodo alterar
	 * @param empresa
	 * @throws SQLException
	 */
	public void alterar(Empresa empresa)throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new EmpresaDAO(conex).alterar(empresa);
		}
	}
	/**
	 * Metodo excluir 
	 * @param codigo
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new EmpresaDAO(conex).excluir(codigo);
		}
	}
	
		
	}


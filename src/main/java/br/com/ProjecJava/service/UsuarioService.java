/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.UsuarioDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Usuario;
/**
 * 
 * Esta classe é responsavel pela Classe UsuarioService
 * @author Lucas Braz
 *
 */

public class UsuarioService {
	/**
	 * Este é o metodo responsavel pela listagem do Usuario
	 * @return mostrará o Usuario
	 * @throws SQLException 
	 */
	public static List<Usuario> listarUsuario() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new UsuarioDAO(conex).lista();
		}
	}
	/**
	 * Metodo para inserir 
	 * @param usuario
	 * @throws SQLException
	 */
	public void inserir(Usuario usuario) throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new UsuarioDAO(conex).inserir(usuario);
		}
	}
	/**
	 * Metodo alterar
	 * @param usuario
	 * @throws SQLException
	 */
	public void alterar(Usuario usuario)throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new UsuarioDAO(conex).alterar(usuario);
		}
	}
	/**
	 * Metodo excluir 
	 * @param usuario
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new UsuarioDAO(conex).excluir(codigo);
		}
	}
}

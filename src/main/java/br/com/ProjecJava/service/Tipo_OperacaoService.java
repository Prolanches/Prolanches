/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.Tipo_OperacaoDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Tipo_Operacao;
/**
 * 
 * Esta classe é responsavel pela Classe Tipo_OperacaoService
 * @author Lucas Braz
 *
 */
public class Tipo_OperacaoService {
	/**
	 * Método utilizado para listar os tipos de operações
	 * @return - retorna os tipos de operações
	 * @throws SQLException
	 */
		public static List<Tipo_Operacao> listarTipo_Operacao() throws SQLException {
			try(Connection conex = new ConnectionPoolOracle().getConnection()){
				return new Tipo_OperacaoDAO(conex).listarTipo_Operacao();
			}
		}
	}


/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.Status_PedidoDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Status_Pedido;
/**
 * 
 * Esta classe é responsavel pela Classe Status_PedidoService
 * @author Lucas Braz
 *
 */
public class Status_PedidoService {
	/**
	 * Método utilizado para listar os status do pedido
	 * @return - retorna os tipos de status do pedido
	 * @throws SQLException
	 */
		public static List<Status_Pedido> listarStatus_Pedido() throws SQLException {
			try(Connection conex = new ConnectionPoolOracle().getConnection()){
				return new Status_PedidoDAO(conex).listarStatus_Pedido();
			}
		}
	}


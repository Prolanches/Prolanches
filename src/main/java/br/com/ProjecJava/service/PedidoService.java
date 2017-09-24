/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.PedidoDAO;
import br.com.ProjecJava.DAO.ProdutoDAO;
import br.com.ProjecJava.DAO.Produto_PedidoDAO;
import br.com.ProjecJava.DAO.Produto_SuprimentoDAO;
import br.com.ProjecJava.dto.PedidoDTO;
import br.com.ProjecJava.dto.ProdutoDTO;
import br.com.ProjecJava.dto.SuprimentoDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Pedido;
import br.com.ProjecJava.model.Produto;
import br.com.ProjecJava.model.Produto_Pedido;
import br.com.ProjecJava.model.Produto_Suprimento;
import br.com.ProjecJava.model.Suprimento;
import br.com.ProjecJava.model.Tipo_Operacao;

/**
 * 
 * Esta classe é responsavel pela Classe PedidoService
 * @author Lucas Braz
 *
 */
public class PedidoService {
	/**
	 * Este é o metodo responsavel pela listagem dos Pedidos
	 * @return mostrará o Pedido
	 * @throws SQLException 
	 */
	public List<PedidoDTO> listarPedido() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new PedidoDAO(conex).lista();
		}
	}
	/**
	 * Metodo para inserir 
	 * @param pedido
	 * @throws SQLException
	 */
	public void inserir(PedidoDTO pedidoDTO, List<ProdutoDTO> lProdutos) throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			PedidoDAO pedidoDAO = new PedidoDAO(conex);
			Produto_PedidoDAO produto_pedidoDAO = new Produto_PedidoDAO(conex);
			
			Tipo_Operacao tipo_op = new Tipo_Operacao();
			tipo_op.setCodigo(pedidoDTO.getCodigoTipoOP());
			
			Pedido pedido = new Pedido();
			pedido.setDataPedido(pedidoDTO.getDataPedido());
			pedido.setTipoOperacao(tipo_op);
			pedido.setValor(pedidoDTO.getValorPedido());
			pedidoDAO.inserir(pedido);
			
			double pedidoTotal = 0;
			for (ProdutoDTO produtoDTO : lProdutos) {
				Produto_Pedido produto_pedido = new Produto_Pedido();
				Produto produto = new Produto();
				produto.setCodigo(produtoDTO.getCodigo());
				produto.setNome(produtoDTO.getNome());
				produto.setMargemLucro(produto.getMargemLucro());
				produto.setPreco(produto.getPreco());
				
				produto_pedido.setProduto(produto);
				produto_pedido.setPedido(pedido);
				produto_pedido.setNomeCliente(pedidoDTO.);
				produto_pedidoDAO.inserir(produto_pedido);
				pedidoTotal += produtoDTO.getMargemLucro()*produtoDTO.getPreco();
			}
			
			
			//realizar o calculo do valor do produto
			double valorPedido = pedidoTotal + pedido.getValor();
			
			pedido.setValor(valorPedido);
			
			pedidoDAO.alterar(pedido);
		}
	}
	/**
	 * Metodo alterar
	 * @param pedido
	 * @throws SQLException
	 */
	public void alterar(PedidoDTO pedidoDTO)throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			Tipo_Operacao tipo_op = new Tipo_Operacao();
			tipo_op.setCodigo(pedidoDTO.getCodigoTipoOP());
			
			Pedido pedido = new Pedido();
			pedido.setCodigo(pedidoDTO.getCodigoPedido());
			pedido.setDataPedido(pedidoDTO.getDataPedido());
			pedido.setTipoOperacao(tipo_op);
			pedido.setValor(pedidoDTO.getValorPedido());
			
			
			new PedidoDAO(conex).alterar(pedido);
		}
	}
	/**
	 * Metodo excluir 
	 * @param pedido
	 * @throws SQLException
	 */
	public void excluir(int codigo1,int codigo2) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Produto_PedidoDAO(conex).excluirporpedido(codigo1);
			new PedidoDAO(conex).excluir(codigo2);
		}
	}
}

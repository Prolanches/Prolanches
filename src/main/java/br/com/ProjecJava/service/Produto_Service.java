/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.ProdutoDAO;
import br.com.ProjecJava.DAO.Produto_SuprimentoDAO;
import br.com.ProjecJava.dto.ProdutoDTO;
import br.com.ProjecJava.dto.SuprimentoDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Marca;
import br.com.ProjecJava.model.Produto;
import br.com.ProjecJava.model.Produto_Suprimento;
import br.com.ProjecJava.model.Suprimento;
import br.com.ProjecJava.model.Tipo_Unidade;


/**
 * 
 * Esta classe é responsavel pela Classe ProdutoService
 * @author Lucas Braz
 *
 */
public class Produto_Service {
	/**
	 * Este é o metodo responsavel pela listagem do Produto
	 * @return mostrará o Produto
	 * @throws SQLException 
	 */
	public List<ProdutoDTO> listarProduto() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new ProdutoDAO(conex).lista();
		}
	}
	/**
	 * Metodo para inserir 
	 * @param produto
	 * @throws SQLException
	 */
	public void inserir(ProdutoDTO produtoDTO, List<SuprimentoDTO> lSuprimentos) throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			ProdutoDAO produtoDAO = new ProdutoDAO(conex);
			Produto_SuprimentoDAO produto_SuprimentoDAO = new Produto_SuprimentoDAO(conex);
			
			//inserir produto
			
			Produto produto = new Produto();
			produto.setNome(produtoDTO.getNome());	
			produto.setMargemLucro(produtoDTO.getMargemLucro());
			produto.setPreco(produtoDTO.getPreco());
			produtoDAO.inserir(produto);
			
			double custoTotal = 0;
			for (SuprimentoDTO suprimentoDTO : lSuprimentos) {
				Produto_Suprimento produto_Suprimento = new Produto_Suprimento();
				Suprimento suprimento = new Suprimento();
				suprimento.setCodigo(suprimentoDTO.getCodigo());
				suprimento.setNome(suprimentoDTO.getNome());
				suprimento.setCusto(suprimentoDTO.getCusto());
				suprimento.setQuantidade(suprimentoDTO.getQuantidade());
				
				produto_Suprimento.setSuprimento(suprimento);
				produto_Suprimento.setProduto(produto);
				produto_Suprimento.setQuantidade(suprimentoDTO.getQuantidadeutilizada());
				produto_Suprimento.setCusto(suprimentoDTO.getCusto());
				produto_SuprimentoDAO.inserir(produto_Suprimento);
				custoTotal += suprimentoDTO.getQuantidade()*suprimentoDTO.getCusto();
			}
			
			//realizar o calculo do valor do produto
			double valorProduto = custoTotal * produto.getMargemLucro();
			
			produto.setPreco(valorProduto);
			
			produtoDAO.alterar(produto);
			
			
			
			
		}
	}
	/**
	 * Metodo alterar
	 * @param produto
	 * @throws SQLException
	 */
	public void alterar(Produto produto)throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new ProdutoDAO(conex).alterar(produto);
		}
	}
	/**
	 * Metodo excluir 
	 * @param produto
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new ProdutoDAO(conex).excluir(codigo);
		}
	}
}

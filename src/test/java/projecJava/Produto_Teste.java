/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;


import br.com.ProjecJava.model.Produto;

import br.com.ProjecJava.service.Produto_Service;


/**
 * Esta classe é responsavel pelos Testes dos Produtos 
 * 
 * @author Lucas Braz
 *
 */
public class Produto_Teste {
	public static void main(String[] args) throws SQLException {
		/**
		 * Instância da classe Service
		 */
		Produto_Service produtoService = new Produto_Service();
		
		/**
		 *  inserindo o Produto 
		 */
		Produto produto = new Produto(1,"X-Burguer",1.60,15.50);
		produtoService.inserir(produto);
		
		/**
		 * alterando o Produto 
		 */
		//produtoService.alterar(new Produto(1, "X-Tudo",2.0,20.00));
		
		/**
		 * excluindo a Produto 
		 */
		//produtoService.excluir(1);

		/**
		 * Listagem dos Funcionarios
		 */
		//List<Produto> lProduto = Produto_Service.listarProduto();
		//for (Produto prod : lProduto) {
		//	imprimirProduto(prod);
		//}
	}

	private static void imprimirProduto(Produto prod) {
		System.out.println("Codígo: "+prod.getCodigo()+"\nNome: "+prod.getNome()+"\nMargem de Lucro: "+prod.getMargemLucro()+"\nPreço: "+prod.getPreco());
	}
}

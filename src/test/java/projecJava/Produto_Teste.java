/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.dto.ProdutoDTO;
import br.com.ProjecJava.dto.SuprimentoDTO;

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
		 * inserindo o Produto
		 */
		List<SuprimentoDTO> lSuprimentos = new ArrayList<>();

		SuprimentoDTO suprimento = new SuprimentoDTO(62, "Pão", 21, 1000, 10,1, 2);
		SuprimentoDTO suprimento1 = new SuprimentoDTO(63,"Hamburguer",21,1000,10,1,22);
		SuprimentoDTO suprimento2 = new SuprimentoDTO(81,"Embalagem",21,1000,500,1,2);
		lSuprimentos.add(suprimento2);
		lSuprimentos.add(suprimento1);
		lSuprimentos.add(suprimento);

		ProdutoDTO produto = new ProdutoDTO(null, "X-Tudo", 1.50, 0,"Cliente");
		produtoService.inserir(produto, lSuprimentos);

		/**
		 * alterando o Produto n
		 */
		//produtoService.alterar(new ProdutoDTO(1, "X-Tudo",2.0,0,"Cliente"));

		/**
		 * excluindo a Produto
		 */
		 //produtoService.excluir(61);

		/**
		 * Listagem dos Produtos
		 */

		// List<Produto> lProduto = Produto_Service.listarProduto();
		// for (Produto prod : lProduto) {
		// imprimirProduto(prod);

		List<ProdutoDTO> lProduto = produtoService.listarProduto();
		for (ProdutoDTO prod : lProduto) {
			imprimirProduto(prod);
		}
	}

	private static void imprimirProduto(ProdutoDTO prod) {
		System.out.println("Codígo: " + prod.getCodigo() + "\nNome: " + prod.getNome() + "\nMargem de Lucro: "
				+ prod.getMargemLucro() + "\nPreço: " + prod.getPreco());

	}
}

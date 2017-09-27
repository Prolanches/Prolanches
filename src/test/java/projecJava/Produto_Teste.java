/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.dto.ProdutoDTO;
import br.com.ProjecJava.dto.SuprimentoDTO;

import br.com.ProjecJava.service.ProdutoService;

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

		ProdutoService produtoService = new ProdutoService();

		/**
		 * inserindo o Produto
		 */
		List<SuprimentoDTO> lSuprimentos = new ArrayList<>();

		SuprimentoDTO suprimento = new SuprimentoDTO(1, "Pão", 1, 100, 10, 100.0, 2);
		lSuprimentos.add(suprimento);

		ProdutoDTO produto = new ProdutoDTO(null, "X-Teste", 1.50, 0);
		produtoService.inserir(produto, lSuprimentos);

		/**
		 * alterando o Produto
		 */
		// produtoService.alterar(new Produto(1, "X-Tudo",2.0,20.00));

		/**
		 * excluindo a Produto
		 */
		// produtoService.excluir(1);

		/**
		 * Listagem dos Funcionarios
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

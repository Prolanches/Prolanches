package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Produto;
import br.com.ProjecJava.model.Produto_Suprimento;
import br.com.ProjecJava.model.Suprimento;
import br.com.ProjecJava.service.Produto_SuprimentoService;

public class Produto_Suprimento_Teste {

	public static void main(String[] args) throws SQLException{
		Produto_SuprimentoService produSupriService = new Produto_SuprimentoService();
		
		Suprimento suprimento = new Suprimento(2, "Hamburgue", null, 0, 0, null);
		Produto produto = new Produto(1, "X-Burguer", 0, 0);
		
		//inserindo produto suprimento FUNCIONANDO
		//Produto_Suprimento produto_pedido = new Produto_Suprimento(0, suprimento, produto, 2, 120);
		//produSupriService.inserir(produto_pedido);
		
		//alterando produto suprimento FUNCIONANDO
		//Produto_Suprimento prosuSupri = new Produto_Suprimento(1, suprimento, produto, 3, 300);
		//produSupriService.alterar(prosuSupri);
		
		//excluindo produto suprimento FUNCIONANDO
		//produSupriService.excluir(1);
		
		//listando produto_suprimento
		List<Produto_Suprimento> lproSupri = Produto_SuprimentoService.listarProdutoSuprimento();
		for (Produto_Suprimento produto_Suprimento : lproSupri) {
			imprimeProduSupri(produto_Suprimento);
			
		}
	}
	private static void imprimeProduSupri(Produto_Suprimento produSupri) {
		System.out.println(" Código: "+produSupri.getCodigo()+"\nSuprimento Nome: "+produSupri.getSuprimento().getNome()+
				"\nProduto Nome: "+produSupri.getProduto().getNome()+"\nQuantidade: "+produSupri.getQuantidade()+
				"\nCusto: "+produSupri.getCusto());
	}
}

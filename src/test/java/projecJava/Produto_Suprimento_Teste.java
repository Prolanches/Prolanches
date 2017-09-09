package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Produto_Suprimento;
import br.com.ProjecJava.service.Produto_SuprimentoService;

public class Produto_Suprimento_Teste {

	public static void main(String[] args) throws SQLException{
		Produto_SuprimentoService produSupriService = new Produto_SuprimentoService();
		
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

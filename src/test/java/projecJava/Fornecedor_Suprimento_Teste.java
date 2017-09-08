package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Fornecedor;
import br.com.ProjecJava.model.Fornecedor_Suprimento;
import br.com.ProjecJava.model.Suprimento;
import br.com.ProjecJava.service.Fornecedor_SuprimentoService;

public class Fornecedor_Suprimento_Teste {

	public static void main(String[] args) throws SQLException {
		Fornecedor_SuprimentoService forneSupriServi = new Fornecedor_SuprimentoService();
		
		Fornecedor fornecedor = new Fornecedor(4, "forne1", "1235.2359.98", null, "3030-6598", "forne1@hotmail.com");
		Suprimento suprimento = new Suprimento(1, "Hamburgue", null, 100, 1.35d, null);
		
		//inserindo fornecedor_suprimento FUNCIONANDO
		//Fornecedor_Suprimento forneSupri = new Fornecedor_Suprimento(0, fornecedor, suprimento);
		//forneSupriServi.inserir(forneSupri);
		
		//alterando fornecedor_suprimento FUNCIONANDO
		//forneSupriServi.alterar(1, fornecedor, suprimento);
		
		//excluindo fornecedor_suprimento FUNCIONANDO
		//forneSupriServi.excluir(2);
		
		//listando fornecedor_suprimento FUNCIONANDO
		List<Fornecedor_Suprimento> lforneSupri = Fornecedor_SuprimentoService.listarForneSupri();
		for (Fornecedor_Suprimento fornecedor_Suprimento : lforneSupri) {
			imprimeForneSupri(fornecedor_Suprimento);
		}
	}
	private static void imprimeForneSupri(Fornecedor_Suprimento forsup) {
		System.out.println("Código: "+forsup.getCodigo()+"\nFornecedor: "+forsup.getFornecedor().getNome()+"\nSuprimento: "+forsup.getSuprimento().getNome());
	}
}

package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Fornecedor;
import br.com.ProjecJava.model.Marca;
import br.com.ProjecJava.model.Suprimento;
import br.com.ProjecJava.model.Tipo_Unidade;
import br.com.ProjecJava.service.SuprimentoService;

public class Suprimento_Teste {

	public static void main(String[] args) throws SQLException {
		//instanciando a classe suprimentoService
		SuprimentoService suprimentoService = new SuprimentoService();
		
		Tipo_Unidade tipoUnidade = new Tipo_Unidade(1, "kG", 1);
		Fornecedor fornecedor = new Fornecedor(2, "forne", "1235.356.326/589", null, "3333-2325", "forne2@gmail.com.br");
		Marca marca = new Marca(1, "thabrulai");
		
		//inserindo Suprimento FUNCIONANDO
		//Suprimento suprimento = new Suprimento(0, "Hamburgue", tipoUnidade, 100, 1.35, fornecedor, marca);
		//suprimentoService.inserir(suprimento);
		
		//alterando Suprimento FUNCIONANDO
		//Suprimento suprimento1 = new Suprimento(2, "Frango", tipoUnidade, 50, 1.05, fornecedor, marca);
		//suprimentoService.alterar(suprimento1);
		
		//excluido Suprimento
		
		//listando suprimento
		List<Suprimento> lSuprimento = SuprimentoService.listarSuprimentos();
		for (Suprimento suprimento2 : lSuprimento) {
			imprimeSuprimento(suprimento2);
		}
	}
	private static void imprimeSuprimento(Suprimento supri) {
		System.out.println("Código: "+supri.getCodigo()+"\nNome Suprimento; "+supri.getNome());
	}
}

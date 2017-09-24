package projecJava;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;

import br.com.ProjecJava.dto.SuprimentoDTO;
import br.com.ProjecJava.service.SuprimentoService;

public class Suprimento_Teste {

	public static void main(String[] args) throws SQLException {
		// instanciando a classe suprimentoService
		
		SuprimentoService suprimentoService = new SuprimentoService();

		// inserindo Suprimento FUNCIONANDO
		SuprimentoDTO suprimento = new SuprimentoDTO(null, "Pão", 1, 100,10, 1.35, 2);
		suprimentoService.inserir(suprimento);

		// alterando Suprimento FUNCIONANDO
		// Suprimento suprimento1 = new Suprimento(2, "Frango", tipoUnidade, 50, 1.05,
		// fornecedor, marca);
		// suprimentoService.alterar(suprimento1);

		// excluido Suprimento FUNCIONANDO
		// suprimentoService.excluir(1);

		// listando suprimento FUNCIONANDO
		List<SuprimentoDTO> lSuprimento = suprimentoService.listarSuprimentos();
		for (SuprimentoDTO suprimento2 : lSuprimento) {
			imprimeSuprimento(suprimento2);
		}
	}
   public static DecimalFormat df = new DecimalFormat("#0.00"); 
    	
	private static void imprimeSuprimento(SuprimentoDTO supri) {
		System.out.println("Código: " + supri.getCodigo() + "\nNome Suprimento: " + supri.getNome() + "\nTipo_Unidade: "
				+ supri.getNomeTipo_Unidade() + "\nQuantidade: " + supri.getQuantidade() + "\nCusto: "
				+ df.format(supri.getCusto()) + "\nMarca: " + supri.getNomeMarca());
	}
}

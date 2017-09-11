package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Contas_Pagar;
import br.com.ProjecJava.service.Contas_PagarService;

public class Contas_Pagar_Teste {

	public static void main(String[] args) throws SQLException {
		Contas_PagarService conPagaService = new Contas_PagarService();
		
		List<Contas_Pagar> lContPag = Contas_PagarService.listarContasPagar();
		for (Contas_Pagar contas_Pagar : lContPag) {
			imprimeContasPagar(contas_Pagar);
		}
	}
	private static void imprimeContasPagar(Contas_Pagar contPag) {
		System.out.println("Fornecedor: "+contPag.getFornecedor().getNome()+" CNPJ: "+contPag.getFornecedor().getCnpj()
				+" \n Telefone: "+contPag.getFornecedor().getTelefone()+" E-mail: "+contPag.getFornecedor().getEmail()
				+" \n Suprimento: "+contPag.getSuprimento().getNome());
	}
}

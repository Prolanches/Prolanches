package projecJava;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.ProjecJava.dto.Contas_PagarDTO;
import br.com.ProjecJava.service.Contas_PagarService;

public class Contas_Pagar_Teste {

	public static void main(String[] args) throws SQLException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Contas_PagarService conPagaService = new Contas_PagarService();
			

		List<Contas_PagarDTO> lContPag = conPagaService.listarContasPagar();
		for (Contas_PagarDTO contas_Pagar : lContPag) {
			imprimeContasPagar(contas_Pagar);
		}
	}

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

	private static void imprimeContasPagar(Contas_PagarDTO contPag) {
		System.out.println("Fornecedor: " + contPag.getNomeFornecedor() + " CNPJ: "
				+ contPag.getCnpjFornecedor()+ "                                       "
				+ sdf.format(contPag.getDataContas_Pagar()) + " \n Telefone: "
				+ contPag.getTelefoneFornecedor() + " E-mail: "
				+ contPag.getEmailFornecedor() + " \n Suprimento: "
				+ contPag.getNomeSuprimento() + " Quantidade: "
				+ contPag.getQuantidadeSuprimento()
				+ contPag.getNomeTipo_Unidade() + " Marca: "
				+ contPag.getNomeMarca() + " Custo Total: " + contPag.getCustoContas_Pagar());
	}
}

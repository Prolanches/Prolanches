package projecJava;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.ProjecJava.dto.Contas_PagarDTO;
import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Contas_Pagar;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Fornecedor;
import br.com.ProjecJava.model.Fornecedor_Suprimento;
import br.com.ProjecJava.model.Marca;
import br.com.ProjecJava.model.Pais;
import br.com.ProjecJava.model.Suprimento;
import br.com.ProjecJava.model.Tipo_Unidade;
import br.com.ProjecJava.service.Contas_PagarService;

public class Contas_Pagar_Teste {

	public static void main(String[] args) throws SQLException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Contas_PagarService conPagaService = new Contas_PagarService();
		
		Pais pais= new Pais(1, "Brasil", "BR");
		Estado estado = new Estado(24, "Santa Catarina", "SC", pais);
		Cidade cidade = new Cidade(4449, "Blumenau", estado);
		Endereco endereco = new Endereco(1, "2 de Setembro", cidade);
		Marca marca = new Marca(2, "thabrulai");
		Tipo_Unidade tipoUnidade = new Tipo_Unidade(1, "kG", 1);
		Suprimento suprimento = new Suprimento(2, "Hamburgue", tipoUnidade, 100, 1.35, marca);
		Fornecedor fornecedor = new Fornecedor(1, "forne2", "1235.356.326/589", endereco, "3333-2325", "forne2@gmail.com.br");
		Fornecedor_Suprimento forSup = new Fornecedor_Suprimento(1, fornecedor, suprimento);
		
		//inserir Contas a Pagar
		Contas_Pagar contasP = new Contas_Pagar(0, 151, forSup, sdf.parse("05/05/2005"));
		conPagaService.inserir(contasP);		

		List<Contas_PagarDTO> lContPag = conPagaService.listarContasPagar();
		for (Contas_PagarDTO contas_Pagar : lContPag) {
			imprimeContasPagar(contas_Pagar);
		}
	}

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

	private static void imprimeContasPagar(Contas_PagarDTO contPag) {
		System.out.println("Fornecedor: " + contPag.getForneSupri().getFornecedor().getNome() + " CNPJ: "
				+ contPag.getForneSupri().getFornecedor().getCnpj() + "                                       "
				+ sdf.format(contPag.getData()) + " \n Telefone: "
				+ contPag.getForneSupri().getFornecedor().getTelefone() + " E-mail: "
				+ contPag.getForneSupri().getFornecedor().getEmail() + " \n Suprimento: "
				+ contPag.getForneSupri().getSuprimento().getNome() + " Quantidade: "
				+ contPag.getForneSupri().getSuprimento().getQuantidade()
				+ contPag.getForneSupri().getSuprimento().getTipoUnidade().getNome() + " Marca: "
				+ contPag.getForneSupri().getSuprimento().getMarca().getNome() + " Custo Total: " + contPag.getCusto());
	}
}

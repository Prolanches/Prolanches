package projecJava;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

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
		Cidade cidade = new Cidade(4435, "Ascurra", estado);
		Endereco endereco = new Endereco(2, "rua Tapajos", cidade);
		Marca marca = new Marca(1, "thabrulai");
		Tipo_Unidade tipoUnidade = new Tipo_Unidade(1, "kG", 1);
		Suprimento suprimento = new Suprimento(21, "Hamburgue", tipoUnidade, 100, 1.35, marca);
		Fornecedor fornecedor = new Fornecedor(4, "forne1", "1235.2359.98", endereco, "3030-6598", "forne1@hotmail.com");
		Fornecedor_Suprimento forSup = new Fornecedor_Suprimento(21, fornecedor, suprimento);
		
		//inserir Contas a Pagar
		//Contas_Pagar contasP = new Contas_Pagar(0, 151, forSup, sdf.parse("05/05/2005"));
		//conPagaService.inserir(contasP);		

		List<Contas_Pagar> lContPag = Contas_PagarService.listarContasPagar();
		for (Contas_Pagar contas_Pagar : lContPag) {
			imprimeContasPagar(contas_Pagar);
		}
	}

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

	private static void imprimeContasPagar(Contas_Pagar contPag) {
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

package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Pais;
import br.com.ProjecJava.service.EnderecoService;

public class Endereco_Teste {

	public static void main(String[] args) throws SQLException {
		//instanciando da classe service
		EnderecoService enderecoService = new EnderecoService();

		Pais pais = new Pais(1, "Brasil", "BR");
		Estado estado = new Estado(24, "Santa Catarina", "SC", pais);
		Cidade cidade = new Cidade(4449, "Blumenau", estado);

		// inserindo o endereço funcionando
		Endereco endereco = new Endereco("jacarepagua 216", cidade);
		enderecoService.inserir(endereco);

		// alterando a cidade funcionando
		enderecoService.alterarCidade(1, 4448);
		// alterando a rua funcionando
		enderecoService.alterarRua(1, "rua Pomerode");

		// listando os endereços funcionando
		List<Endereco> lendereco = EnderecoService.listarEnderecos();
		for (Endereco endereco1 : lendereco) {
			imprimirEndereco(endereco1);
		}

		// excluindo o endereço funcionando
		enderecoService.excluir(1);
	}

	private static void imprimirEndereco(Endereco endereco) {
		System.out.println("codigo: " + endereco.getCodigo()+" Nome cidade: "+endereco.getNomeCidade().getNome()
				+ " rua: " + endereco.getRua());
	}
}

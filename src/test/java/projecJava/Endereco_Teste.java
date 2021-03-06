package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.dto.EnderecoDTO;
import br.com.ProjecJava.service.EnderecoService;

public class Endereco_Teste {

	public static void main(String[] args) throws SQLException {
		//instanciando da classe service
		EnderecoService enderecoService = new EnderecoService();

		// inserindo o endereço funcionando
		//EnderecoDTO endereco = new EnderecoDTO(null,"Amazonas",4449);
		
		//enderecoService.inserir(endereco);

		
		//alterando a rua funcionando
		//enderecoService.alterar(new EnderecoDTO(142, "Altenburg",4449));

		// listando os endereços funcionando
		List<EnderecoDTO> lendereco = enderecoService.listarEnderecos();
		for (EnderecoDTO endereco1 : lendereco) {
			imprimirEndereco(endereco1);
		}

		// excluindo o endereço funcionando
		//enderecoService.excluir(161);
	}

	private static void imprimirEndereco(EnderecoDTO endereco) {
		System.out.println("Codigo: " + endereco.getCodigo()+
			 "\nRua: " + endereco.getRua()+"\nCidade: "+endereco.getNomeCidade()+"\nEstado: "+endereco.getNomeUF());
	}
}

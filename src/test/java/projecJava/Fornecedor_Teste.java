package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Fornecedor;
import br.com.ProjecJava.model.Pais;
import br.com.ProjecJava.service.EnderecoService;
import br.com.ProjecJava.service.FornecedorService;

public class Fornecedor_Teste {
	
	public static void main(String[] args) throws SQLException {
		FornecedorService fornecedorService = new FornecedorService();
		
		Pais pais = new Pais(1, "Brasil", "BR");
		Estado estado = new Estado(24, "Santa Catarina", "SC", pais);
		Cidade cidade = new Cidade(4449, "Blumenau", estado);
		Endereco endereco = new Endereco(6, "rua jacarepagua, 216", cidade);
		
		//inserindo fornecedor FUNCIONANDO
		Fornecedor fornecedor = new Fornecedor("forne2", "1235.356.326/589", endereco, "3333-2325", "forne2@gmail.com.br");
		fornecedorService.inserir(fornecedor);
		
		//alterar fornecedor FUNCIONANDO
		//fornecedorService.alterar(4,"forne1", "1235.2359.98", endereco, "3030-6598", "forne1@hotmail.com");
		
		//excluindo fornecedor FUNCIONANDO
		//fornecedorService.excluir(5);
		
		//listando fornecedores FUNCIONANDO
		List<Fornecedor> lfornecedor = FornecedorService.listarFornecedores();
		for (Fornecedor fornecedor1 : lfornecedor) {
			imprimeFornecedor(fornecedor1);
		}
	}
	
		private static void imprimeFornecedor(Fornecedor fornecedor){
			System.out.println("codigo: " + fornecedor.getCodigo()+" \nNome: "+fornecedor.getNome()
					+ " \ncnpj: " + fornecedor.getCnpj()+"\ntelefone: "+fornecedor.getTelefone()+"\nE-mail: "+fornecedor.getEmail()
					+ " \nEndereço \nRua: "+fornecedor.getEndereco().getRua()+"\nCidade: "+fornecedor.getEndereco().getNomeCidade().getNome()
					+ " \nEstado: "+fornecedor.getEndereco().getNomeCidade().getEstado().getUf()
					+ " \nPaís: "+fornecedor.getEndereco().getNomeCidade().getEstado().getPais().getSigla());
		}
}

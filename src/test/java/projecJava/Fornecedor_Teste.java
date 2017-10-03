package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.dto.FornecedorDTO;
import br.com.ProjecJava.service.FornecedorService;

public class Fornecedor_Teste {
	
	public static void main(String[] args) throws SQLException {
		
		FornecedorService fornecedorService = new FornecedorService();
		
	
		
		//inserindo fornecedor FUNCIONANDO
		//FornecedorDTO fornecedor = new FornecedorDTO(null,"Sadia", "123.456.789/0001-77",162,"Altenburg",4449, "3333-2325", "teste@gmail.com");
		//fornecedorService.inserir(fornecedor);
		
		//alterar fornecedor FUNCIONANDO
	    //fornecedorService.alterar(new FornecedorDTO(61,"Perdigão","123.456.789/0001-88",162,"Asjsfasf",4449, "3030-6595", "testando@hotmail.com"));
		
		//excluindo fornecedor FUNCIONANDO
		//fornecedorService.excluir(61);
		
		//listando fornecedores FUNCIONANDO
		List<FornecedorDTO> lfornecedor = fornecedorService.listarFornecedores();
		for (FornecedorDTO fornecedor1 : lfornecedor) {
			imprimeFornecedor(fornecedor1);
		}
	}
	
		private static void imprimeFornecedor(FornecedorDTO fornecedor){
			System.out.println("Codigo: " + fornecedor.getCodigo()+" \nNome: "+fornecedor.getNome()
					+ " \ncnpj: " + fornecedor.getCnpj()+"\ntelefone: "+fornecedor.getTelefone()+"\nE-mail: "+fornecedor.getEmail()
					+ " \nEndereço \nRua: "+fornecedor.getRua()+"\nCidade: "+fornecedor.getNomeCidade()
					+ " \nEstado: "+fornecedor.getSiglaUF()
					+ " \nPaís: "+fornecedor.getSiglaPais());
		}
}

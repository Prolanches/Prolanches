package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.dto.FornecedorDTO;
import br.com.ProjecJava.service.FornecedorService;

public class Fornecedor_Teste {
	
	public static void main(String[] args) throws SQLException {
		
		FornecedorService fornecedorService = new FornecedorService();
		
	
		
		//inserindo fornecedor FUNCIONANDO
		//FornecedorDTO fornecedor = new FornecedorDTO(null,"Fornecedor Teste", "123.456.789/0001-10",141,"Aquidabam",4449, "3333-2325", "teste@gmail.com.br");
		//fornecedorService.inserir(fornecedor);
		
		//alterar fornecedor FUNCIONANDO
	    //fornecedorService.alterar(new FornecedorDTO(41,"Vale da Web","123.456.789/0001-10",141,"Aquidabam",4449, "3030-6597", "testando@hotmail.com"));
		
		//excluindo fornecedor FUNCIONANDO
		//fornecedorService.excluir(41);
		
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

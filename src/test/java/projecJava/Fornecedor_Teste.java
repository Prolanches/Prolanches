package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.dto.FornecedorDTO;
import br.com.ProjecJava.service.FornecedorService;

public class Fornecedor_Teste {
	
	public static void main(String[] args) throws SQLException {
		
		FornecedorService fornecedorService = new FornecedorService();
		
	
		
		//inserindo fornecedor FUNCIONANDO
		//FornecedorDTO fornecedor = new FornecedorDTO(null,"forne2", "1235.356.326/589",124,"Fides Deeke",4449, "3333-2325", "forne2@gmail.com.br");
		//fornecedorService.inserir(fornecedor);
		
		//alterar fornecedor FUNCIONANDO
	    //fornecedorService.alterar(new FornecedorDTO(22,"Mascada","123.456.789/0001-10",124,"Max Weise",4449, "3030-6598", "forne1@hotmail.com"));
		
		//excluindo fornecedor FUNCIONANDO
		//fornecedorService.excluir(21);
		
		//listando fornecedores FUNCIONANDO
		List<FornecedorDTO> lfornecedor = FornecedorService.listarFornecedores();
		for (FornecedorDTO fornecedor1 : lfornecedor) {
			imprimeFornecedor(fornecedor1);
		}
	}
	
		private static void imprimeFornecedor(FornecedorDTO fornecedor){
			System.out.println("codigo: " + fornecedor.getCodigo()+" \nNome: "+fornecedor.getNome()
					+ " \ncnpj: " + fornecedor.getCnpj()+"\ntelefone: "+fornecedor.getTelefone()+"\nE-mail: "+fornecedor.getEmail()
					+ " \nEndereço \nRua: "+fornecedor.getRua()+"\nCidade: "+fornecedor.getNomeCidade()
					+ " \nEstado: "+fornecedor.getSiglaUF()
					+ " \nPaís: "+fornecedor.getSiglaPais());
		}
}

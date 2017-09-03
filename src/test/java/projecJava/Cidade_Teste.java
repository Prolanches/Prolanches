package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Cidade;

import br.com.ProjecJava.service.CidadeService;


public class Cidade_Teste {

	public static void main(String[] args) throws SQLException {
		List<Cidade> lcidade = CidadeService.listarCidades(24);
		for (Cidade cidade : lcidade) {
			imprimirCidade(cidade);
		}
		
	}
	private static void imprimirCidade(Cidade cidade) {
		System.out.println("codigo: "+cidade.getCodigo()+" Nome: "+ cidade.getNome());
	}
}

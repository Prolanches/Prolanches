package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.dto.CidadeDTO;

import br.com.ProjecJava.service.CidadeService;

public class Cidade_Teste {


	public  void main(String[] args) throws SQLException {

		CidadeService cidadeService = new CidadeService();
		
		List<CidadeDTO> lcidade = cidadeService.listarCidades();
		for (CidadeDTO cidade : lcidade) {
			imprimirCidade(cidade);
		}

	}

	private  void imprimirCidade(CidadeDTO cidade) {
		System.out.println("codigo: " + cidade.getCodigo() + " Nome: " + cidade.getNomeCidade());
	}
}

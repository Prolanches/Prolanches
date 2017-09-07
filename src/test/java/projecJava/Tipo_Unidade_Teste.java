package projecJava;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;


import br.com.ProjecJava.model.Tipo_Unidade;
import br.com.ProjecJava.service.Tipo_UnidadeService;

public class Tipo_Unidade_Teste {

	public static void main(String[] args) throws SQLException {
		
		
		//listando tipo unidade FUNCIONANDO
		List<Tipo_Unidade> lTipoUnidade = Tipo_UnidadeService.listarTiposUnidades();
		for (Tipo_Unidade tipoUnidade : lTipoUnidade) {
			imprimeTipoUnidade(tipoUnidade);
		}
			
	}
	static DecimalFormat df = new DecimalFormat("#0.000#");
	
	private static void imprimeTipoUnidade(Tipo_Unidade tipoUnidade){
		System.out.println("codigo: " + tipoUnidade.getCodigo()+" \nTipo: "+df.format(tipoUnidade.getUnidade())+tipoUnidade.getNome());
	}
}

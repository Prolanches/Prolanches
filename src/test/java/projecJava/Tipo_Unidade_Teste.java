package projecJava;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;

import br.com.ProjecJava.dto.Tipo_UnidadeDTO;
import br.com.ProjecJava.service.Tipo_UnidadeService;

public class Tipo_Unidade_Teste {

	public static void main(String[] args) throws SQLException {
		
		
		//listando tipo unidade FUNCIONANDO
		List<Tipo_UnidadeDTO> lTipoUnidade = Tipo_UnidadeService.listarTiposUnidades();
		for (Tipo_UnidadeDTO tipoUnidade : lTipoUnidade) {
			imprimeTipoUnidade(tipoUnidade);
		}
			
	}
	static DecimalFormat df = new DecimalFormat("#0.000#");
	
	private static void imprimeTipoUnidade(Tipo_UnidadeDTO tipoUnidade){
		System.out.println("codigo: " + tipoUnidade.getCodigoTipo_Unidade()+" \nTipo: "+df.format(tipoUnidade.getUnidadeTipo_Unidade())+tipoUnidade.getNomeTipo_Unidade());
	}
}

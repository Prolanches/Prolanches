package projecJava;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Empresa;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Funcao;
import br.com.ProjecJava.model.Funcionario;
import br.com.ProjecJava.model.Historico_Pedido;
import br.com.ProjecJava.model.Pais;
import br.com.ProjecJava.model.Pedido;
import br.com.ProjecJava.model.Status_Pedido;
import br.com.ProjecJava.model.Tipo_Operacao;
import br.com.ProjecJava.service.Historico_PedidoService;

public class Historico_Pedido_Teste {

	public static void main(String[] args) throws SQLException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		Historico_PedidoService historico_pedidoService = new Historico_PedidoService();

		Pais pais = new Pais(1, "Brasil", "BR");
		Estado estado = new Estado(24, "Santa Catarina", "SC", pais);
		Cidade cidade = new Cidade(4449, "Blumenau", estado);
		Endereco endereco = new Endereco(2, "2 de Setembro", cidade);
		Status_Pedido status = new Status_Pedido(5, "Aguarde");
		Empresa empresa = new Empresa(2, "Snack Time", endereco, "02.722.800/0001-50", "(47)3035-2650",
				"projecjava@gmail.com");
		Funcao funcao = new Funcao(1, "Gerente");
		Funcionario funcionario = new Funcionario(1, "Itamar Rockfeller", funcao, empresa);
		Tipo_Operacao tipooperacao = new Tipo_Operacao(1, "Mesa");
		Pedido pedido = new Pedido(1, sdf.parse("12/09/2017"), tipooperacao, 250.00);

		/**
		 * inserir Historico_Pedido
		 */
		Historico_Pedido historico_pedido = new Historico_Pedido(1, pedido, funcionario, status);
		historico_pedidoService.inserir(historico_pedido);

		List<Historico_Pedido> lHistorico_Pedido = Historico_PedidoService.listarHistorico_Pedido();
		for (Historico_Pedido hit_pedido : lHistorico_Pedido) {
			imprimeHistorico_Pedido(hit_pedido);
		}
	}

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

	private static void imprimeHistorico_Pedido(Historico_Pedido hit_pedido) {
		System.out.println("Código: " + hit_pedido.getCodigo() + "\nCódigo Pedido: "
				+ hit_pedido.getPedido().getCodigo() + "\nData do Pedido: " + hit_pedido.getPedido().getDataPedido()
				+ "\nValor do Pedido: " + hit_pedido.getPedido().getValor() + "\nFuncionário: "
				+ hit_pedido.getFuncionario().getNome() + "\nStatus do Pedido: "+hit_pedido.getStatusPedido().getNome());
	}
}

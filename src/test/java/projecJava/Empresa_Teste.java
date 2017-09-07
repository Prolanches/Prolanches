/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Empresa;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Pais;
import br.com.ProjecJava.service.EmpresaService;
import br.com.ProjecJava.service.EnderecoService;

/**
 * Esta classe é responsavel pelos Testes das Empresas
 * 
 * @author Lucas Braz
 *
 */

public class Empresa_Teste {

	public static void main(String[] args) throws SQLException {
		/**
		 * Instância da classe Service
		 */
		EnderecoService enderecoService = new EnderecoService();
		EmpresaService empresaService = new EmpresaService();

		Pais pais = new Pais(1, "Brasil", "BR");
		Estado estado = new Estado(24, "Santa Catarina", "SC", pais);
		Cidade cidade = new Cidade(4449, "Blumenau", estado);
		Endereco endereco = new Endereco(22, "2 de Setembro", cidade);

		/**
		 *  inserindo a empresa 
		 */
		Empresa empresa = new Empresa(2, "Snack Time", endereco,
	    "02.722.800/0001-50","(47)3035-2650","projecjava@gmail.com");
		empresaService.inserir(empresa);
		
		/**
		 * alterando a empresa 
		 */
		//empresaService.alterar(new Empresa(24, "Snack Time",endereco, "77.666.555/0002-20", "(47) 3333-7777", "lucas.brazbr@bol.com.br"));
		
		/**
		 * excluindo a empresa 
		 */
		//empresaService.excluir(24);

		/**
		 *  Listagem das Empresas
		 */
		List<Empresa> lEmpresa = EmpresaService.listarEmpresas();
		for (Empresa emp : lEmpresa) {
			imprimirEmpresa(emp);
		}
	}

	private static void imprimirEmpresa(Empresa emp) {
		System.out.println("Codígo: " + emp.getCodigo() + "\nEmpresa Nome: " + emp.getNome() + "\nEndereço: "
				+ emp.getEndereco().getRua() + "\nCidade: " + emp.getEndereco().getNomeCidade().getNome() + "\nEstado: "
				+ emp.getEndereco().getNomeCidade().getEstado().getUf() + "\nPais: "
				+ emp.getEndereco().getNomeCidade().getEstado().getPais().getSigla() + "\nCNPJ: " + emp.getCnpj()
				+ "\nTelefone: " + emp.getTelefone() + "\nE-mail: " + emp.getEmail() + "\n");
	}
}

/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;


import br.com.ProjecJava.model.Empresa;
import br.com.ProjecJava.service.EmpresaService;
import br.com.ProjecJava.dto.EmpresaDTO;

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
		EmpresaService empresaService = new EmpresaService();
		/**
		 * inserindo a empresa
		 */
		EmpresaDTO empresa = new EmpresaDTO(null, "Snack Time", 2, "2 de Setembro",4449,"Blumenau", 24, "Santa Catarina", "SC", 1,
				"Brasil", "BR", "77.666.555/0002-40", "(47) 3333-7777", "lucas.brazbr@bol.com.br");
		empresaService.inserir(empresa);

		/**
		 * alterando a empresa
		 */
		// empresaService.alterar(new Empresa(24, "Snack Time",endereco,
		// "77.666.555/0002-20", "(47) 3333-7777", "lucas.brazbr@bol.com.br"));

		/**
		 * excluindo a empresa
		 */
		// empresaService.excluir(24);

		/**
		 * Listagem das Empresas
		 */
		List<Empresa> lEmpresa = EmpresaService.listarEmpresas();
		for (Empresa emp : lEmpresa) {
			imprimirEmpresa(emp);
		}
	}

	private static void imprimirEmpresa(Empresa emp) {
		System.out.println("Codígo: " + emp.getCodigo() + "\nEmpresa Nome: " + emp.getNome() + "\nEndereço: "
				+ emp.getEndereco().getRua() + "\nCidade: " + emp.getEndereco().getCidade().getNome() + "\nEstado: "
				+ emp.getEndereco().getCidade().getEstado().getUf() + "\nPais: "
				+ emp.getEndereco().getCidade().getEstado().getPais().getSigla() + "\nCNPJ: " + emp.getCnpj()
				+ "\nTelefone: " + emp.getTelefone() + "\nE-mail: " + emp.getEmail() + "\n");
	}
}

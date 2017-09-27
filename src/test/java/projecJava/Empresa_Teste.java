/**
 * Este pacote é responsavel pelas Classes Testes 
 */
package projecJava;

import java.sql.SQLException;
import java.util.List;


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
		//EmpresaDTO empresa = new EmpresaDTO(null, "Vale da Web", 141, "Gaspar",4449, "77.666.555/0002-15", "(47) 3333-7777", "lucas.brazbr@bol.com.br");
		//empresaService.inserir(empresa);

		/**
		 * alterando a empresa
		 */
		//empresaService.alterar(new EmpresaDTO(81, "Teste Empresa", 141,"11 de Setembro",4449,"77.666.555/0002-99", "(47) 3333-7777", "lucas.brazbr@bol.com.br"));

		/**
		 * excluindo a empresa
		 */
	   //empresaService.excluir(81);

		/**
		 * Listagem das Empresas
		 */
		List<EmpresaDTO> lEmpresa = empresaService.listarEmpresas();
		for (EmpresaDTO emp : lEmpresa) {
			imprimirEmpresa(emp);
		}
	}

	private static void imprimirEmpresa(EmpresaDTO emp) {
		System.out.println("Codígo: " + emp.getCodigo() + "\nEmpresa Nome: " + emp.getNome() + "\nEndereço: "
				+ emp.getRua() + "\nCidade: " + emp.getNomeCidade() + "\nEstado: "
				+ emp.getNomeUF() + "\nPais: "
				+ emp.getSiglaPais() + "\nCNPJ: " + emp.getCnpj()
				+ "\nTelefone: " + emp.getTelefone() + "\nE-mail: " + emp.getEmail() + "\n");
	}
}

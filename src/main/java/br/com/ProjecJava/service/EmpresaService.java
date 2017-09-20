/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.EmpresaDAO;
import br.com.ProjecJava.DAO.EnderecoDAO;
import br.com.ProjecJava.dto.EmpresaDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Empresa;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Pais;




/**
 * Esta classe é responsavel pela Classe EmpresaService
 * @author Lucas Braz
 *
 */
public class EmpresaService {
	
	/**
	 * Este é o metodo responsavel pela listagem da Empresa
	 * @return mostrará a empresa
	 * @throws SQLException 
	 */
	public static List<EmpresaDTO> listarEmpresas() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new EmpresaDAO(conex).lista();
		}
	}
	/**
	 * Metodo para inserir 
	 * @param empresa
	 * @throws SQLException
	 */
	public void inserir(EmpresaDTO empresaDTO) throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			
			Pais pais = new Pais();
			pais.setCodigo(empresaDTO.getCodigoPais());
			
			Estado estado = new Estado();
			estado.setCodigo(empresaDTO.getCodigoUF());
			estado.setPais(pais);
			
			Cidade cidade = new Cidade();
			cidade.setCodigo(empresaDTO.getCodigoCidade());
			cidade.setEstado(estado);
			
			
			Endereco endereco = new Endereco();
			endereco.setCodigo(empresaDTO.getCodigoEndereco());
			endereco.setRua(empresaDTO.getRua());
			endereco.setCidade(cidade);
			
			new EnderecoDAO(conex).inserir(endereco);
			
			Empresa empresa = new Empresa();
			empresa.setNome(empresaDTO.getNome());
			empresa.setEndereco(endereco);
			empresa.setCnpj(empresaDTO.getCnpj());
			empresa.setTelefone(empresaDTO.getTelefone());
			empresa.setEmail(empresaDTO.getEmail());
			
			
			new EmpresaDAO(conex).inserir(empresa);
			
		}
	}

	/**
	 * Metodo alterar
	 * @param empresa
	 * @throws SQLException
	 */
	public void alterar(Empresa empresa)throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new EmpresaDAO(conex).alterar(empresa);
		}
	}
	/**
	 * Metodo excluir 
	 * @param codigo
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new EmpresaDAO(conex).excluir(codigo);
		}
	}

}
		
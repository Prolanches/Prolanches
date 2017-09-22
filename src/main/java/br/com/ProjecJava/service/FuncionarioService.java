/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


import br.com.ProjecJava.DAO.FuncionarioDAO;
import br.com.ProjecJava.dto.FuncionarioDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Empresa;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Funcao;
import br.com.ProjecJava.model.Funcionario;
import br.com.ProjecJava.model.Pais;

/**
 * 
 * Esta classe é responsavel pela Classe FuncioanrioService
 * @author Lucas Braz
 *
 */
public class FuncionarioService {
	/**
	 * Este é o metodo responsavel pela listagem do Funcionario
	 * @return mostrará o Funcionario
	 * @throws SQLException 
	 */
	public List<FuncionarioDTO> listarFuncionarios() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new FuncionarioDAO(conex).lista();
		}
	}
	/**
	 * Metodo para inserir 
	 * @param Funcionario
	 * @throws SQLException
	 */
	public void inserir(FuncionarioDTO funcionarioDTO) throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			Pais pais = new Pais();
			pais.setCodigo(funcionarioDTO.getCodigoPais());
			
			Estado estado = new Estado();
			estado.setCodigo(funcionarioDTO.getCodigoUF());
			estado.setPais(pais);
			
			Cidade cidade = new Cidade();
			cidade.setCodigo(funcionarioDTO.getCodigoCidade());
			cidade.setEstado(estado);
			
			Endereco endereco = new Endereco();
			endereco.setCodigo(funcionarioDTO.getCodigoEndereco());
			endereco.setCidade(cidade);
			
			Empresa empresa = new Empresa();
			empresa.setCodigo(funcionarioDTO.getCodigoEmpresa());
			empresa.setEndereco(endereco);
			
			Funcao funcao = new Funcao();
			funcao.setCodigo(funcionarioDTO.getCodigoFuncao());
			
			Funcionario funcionario = new Funcionario();
			funcionario.setNome(funcionarioDTO.getNomeFuncionario());
			funcionario.setFuncao(funcao);
			funcionario.setEmpresa(empresa);
			
			new FuncionarioDAO(conex).inserir(funcionario);
		}
	}
	/**
	 * Metodo alterar
	 * @param Funcionario
	 * @throws SQLException
	 */
	public void alterar(FuncionarioDTO funcionarioDTO)throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			Pais pais = new Pais();
			pais.setCodigo(funcionarioDTO.getCodigoPais());
			
			Estado estado = new Estado();
			estado.setCodigo(funcionarioDTO.getCodigoUF());
			estado.setPais(pais);
			
			Cidade cidade = new Cidade();
			cidade.setCodigo(funcionarioDTO.getCodigoCidade());
			cidade.setEstado(estado);
			
			Endereco endereco = new Endereco();
			endereco.setCodigo(funcionarioDTO.getCodigoEndereco());
			endereco.setCidade(cidade);
			
			Empresa empresa = new Empresa();
			empresa.setCodigo(funcionarioDTO.getCodigoEmpresa());
			empresa.setEndereco(endereco);
			
			Funcao funcao = new Funcao();
			funcao.setCodigo(funcionarioDTO.getCodigoFuncao());
			
			Funcionario funcionario = new Funcionario();
			funcionario.setCodigo(funcionarioDTO.getCodigoFuncionario());
			funcionario.setNome(funcionarioDTO.getNomeFuncionario());
			funcionario.setFuncao(funcao);
			funcionario.setEmpresa(empresa);
			
			new FuncionarioDAO(conex).alterar(funcionario);
		}
	}
	/**
	 * Meetodo excluir 
	 * @param Funcionario
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FuncionarioDAO(conex).excluir(codigo);
		}
	}
	
}

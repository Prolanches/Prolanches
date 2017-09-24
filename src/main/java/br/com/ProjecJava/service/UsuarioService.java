/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.UsuarioDAO;
import br.com.ProjecJava.dto.UsuarioDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Empresa;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Funcao;
import br.com.ProjecJava.model.Funcionario;
import br.com.ProjecJava.model.Pais;
import br.com.ProjecJava.model.Perfil;
import br.com.ProjecJava.model.Usuario;
/**
 * 
 * Esta classe é responsavel pela Classe UsuarioService
 * @author Lucas Braz
 *
 */

public class UsuarioService {
	/**
	 * Este é o metodo responsavel pela listagem do Usuario
	 * @return mostrará o Usuario
	 * @throws SQLException 
	 */
	public List<UsuarioDTO> listarUsuario() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
	           return new UsuarioDAO(conex).lista();
		}
	}
	/**
	 * Metodo para inserir 
	 * @param usuario
	 * @throws SQLException
	 */
	public void inserir(UsuarioDTO usuarioDTO) throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			Pais pais = new Pais();
			pais.setCodigo(usuarioDTO.getCodigoPais());
			
			Estado estado = new Estado();
			estado.setCodigo(usuarioDTO.getCodigoUF());
			estado.setPais(pais);
			
			Cidade cidade = new Cidade();
			cidade.setCodigo(usuarioDTO.getCodigoCidade());
			cidade.setEstado(estado);
			
			Endereco endereco = new Endereco();
			endereco.setCodigo(usuarioDTO.getCodigoEndereco());
			endereco.setCidade(cidade);
			
			Empresa empresa = new Empresa();
			empresa.setCodigo(usuarioDTO.getCodigoEmpresa());
			empresa.setEndereco(endereco);
			
			Funcao funcao = new Funcao();
			funcao.setCodigo(usuarioDTO.getCodigoFuncao());
			
			Funcionario funcionario = new Funcionario();
			funcionario.setCodigo(usuarioDTO.getCodigoFuncionario());
			
			Perfil perfil = new Perfil();
			perfil.setCodigo(usuarioDTO.getCodigoPerfil());
	
			
			Usuario usuario = new Usuario();
			usuario.setLogin(usuarioDTO.getLoginUsuario());
			usuario.setFuncionario(funcionario);
			usuario.setSenha(usuarioDTO.getSenhaUsuario());
			usuario.setPerfil(perfil);
			new UsuarioDAO(conex).inserir(usuario);
		}
	}
	/**
	 * Metodo alterar
	 * @param usuario
	 * @throws SQLException
	 */
	public void alterar(UsuarioDTO usuarioDTO)throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			
			Pais pais = new Pais();
			pais.setCodigo(usuarioDTO.getCodigoPais());
			
			Estado estado = new Estado();
			estado.setCodigo(usuarioDTO.getCodigoUF());
			estado.setPais(pais);
			
			Cidade cidade = new Cidade();
			cidade.setCodigo(usuarioDTO.getCodigoCidade());
			cidade.setEstado(estado);
			
			Endereco endereco = new Endereco();
			endereco.setCodigo(usuarioDTO.getCodigoEndereco());
			endereco.setCidade(cidade);
			
			Empresa empresa = new Empresa();
			empresa.setCodigo(usuarioDTO.getCodigoEmpresa());
			empresa.setEndereco(endereco);
			
			Funcao funcao = new Funcao();
			funcao.setCodigo(usuarioDTO.getCodigoFuncao());
			
			Funcionario funcionario = new Funcionario();
			funcionario.setCodigo(usuarioDTO.getCodigoFuncionario());
			
			Perfil perfil = new Perfil();
			perfil.setCodigo(usuarioDTO.getCodigoPerfil());
			
			
			Usuario usuario = new Usuario();
			usuario.setCodigo(usuarioDTO.getCodigoUsuario());
			usuario.setLogin(usuarioDTO.getLoginUsuario());
			usuario.setFuncionario(funcionario);
			usuario.setSenha(usuarioDTO.getSenhaUsuario());
			usuario.setPerfil(perfil);
			
			new UsuarioDAO(conex).alterar(usuario);
		}
	}
	/**
	 * Metodo excluir 
	 * @param usuario
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new UsuarioDAO(conex).excluir(codigo);
	}
	}
}

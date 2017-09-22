/**
 * Este é o pacote responsavel pela ligação com o Banco 
 */
package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.dto.UsuarioDTO;
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
 * Esta é a Classe responsavel pelos Usuários 
 * @author Lucas Braz
 *
 */
public class UsuarioDAO {
	/**
	 * Configurações da Conexão
	 */
	private final Connection conex;
/**
 * Parametros da Conexão 
 * @param con
 */
	public UsuarioDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir(Usuario usuario) throws SQLException{
		String sql = "INSERT INTO USUARIO (USU_COD, USU_NOME, USU_FUNCIONARIO_COD, USU_SENHA, USU_NIVEL_COD) VALUES (SEQ_USUARIO.nextval, ?,?,?,?)";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, usuario.getLogin());
		statement.setInt(2, usuario.getFuncionario().getCodigo());
		statement.setString(3, usuario.getSenha());
		statement.setInt(4, usuario.getPerfil().getCodigo());
	
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(Usuario usuario) throws SQLException{
		String sql = "UPDATE USUARIO SET USU_NOME = ?, USU_FUNCIONARIO_COD = ?, USU_SENHA = ?, USU_NIVEL_COD = ? WHERE USU_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, usuario.getLogin());
		statement.setInt(2, usuario.getFuncionario().getCodigo());
		statement.setString(3, usuario.getSenha());
		statement.setInt(4, usuario.getPerfil().getCodigo());
		statement.setInt(5, usuario.getCodigo());
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int codigo) throws SQLException{
		String sql = "DELETE USUARIO WHERE USU_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<UsuarioDTO> lista() throws SQLException {
		List<UsuarioDTO> lUsuario = new ArrayList<>();

		String sql = "SELECT * FROM USUARIO"
				+ " INNER JOIN PERFIL ON USUARIO.USU_NIVEL_COD = PERFIL.PERFIL_COD"
				+ " INNER JOIN FUNCIONARIO ON USUARIO.USU_FUNCIONARIO_COD = FUNCIONARIO.FUN_COD"
				+ " INNER JOIN FUNCAO ON FUNCIONARIO.FUN_FUNCAO_COD = FUNCAO.FUNCAO_COD"
		        + " INNER JOIN EMPRESA ON FUNCIONARIO.FUN_EMPRESA_COD = EMPRESA.EMP_COD"
		        + " INNER JOIN ENDERECO ON EMPRESA.EMP_ENDERECO_COD = ENDERECO.END_COD"
		        + " INNER JOIN CIDADE ON ENDERECO.END_CIDADE_COD = CIDADE.CIDADE_COD"
				+ " INNER JOIN ESTADO ON CIDADE.CIDADE_UF_COD = ESTADO.ESTADO_COD"
				+ " INNER JOIN PAIS ON ESTADO.ESTADO_PAIS_COD = PAIS.PAIS_COD";;
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					
					int codigoPais = rs.getInt("PAIS_COD");
					String nomePais = rs.getString("PAIS_NOME");
					String siglaPais= rs.getString("PAIS_SIGLA");
					Pais pais = new Pais(codigoPais,nomePais,siglaPais);
					
					int codigoEstado = rs.getInt("ESTADO_COD");
					String nomeEstado = rs.getString("ESTADO_NOME");
					String ufEstado = rs.getString("ESTADO_UF");
					Estado estado = new Estado(codigoEstado,nomeEstado,ufEstado,pais);
					
					int codigoCidade = rs.getInt("CIDADE_COD");
					String nomeCidade = rs.getString("CIDADE_NOME");
					Cidade cidade = new Cidade(codigoCidade,nomeCidade,estado);
		
					int codigoEndereco = rs.getInt("END_COD");
					String ruaEndereco = rs.getString("END_RUA");
					Endereco endereco = new Endereco(codigoEndereco,ruaEndereco,cidade);
				
					
					int codigoEmpresa = rs.getInt("EMP_COD");
					String nomeEmpresa = rs.getString("EMP_NOME");
					String cnpj = rs.getString("EMP_CNPJ_CPF");
					String telefone= rs.getString("EMP_TELEFONE");
					String email = rs.getString("EMP_EMAIL");
					Empresa empresa = new Empresa(codigoEmpresa,nomeEmpresa,endereco,cnpj,telefone,email);
					
					int codigoFuncao = rs.getInt("FUNCAO_COD");
					String nomeFuncao = rs.getString("FUNCAO_NOME");
					Funcao funcao = new Funcao(codigoFuncao,nomeFuncao);
					
					int codigoFuncionario = rs.getInt("FUN_COD");
					String nomeFuncionario = rs.getString("FUN_NOME");
					Funcionario funcionario = new Funcionario(codigoFuncionario,nomeFuncionario,funcao,empresa);
					
					int codigoPerfil = rs.getInt("PERFIL_COD");
					String nomePerfil = rs.getString("PERFIL_NIVEIS");
					Perfil perfil = new Perfil(codigoPerfil,nomePerfil);
					
					int codigo = rs.getInt("USU_COD");
					String login = rs.getString("USU_NOME");
					String senha = rs.getString("USU_SENHA");
					
					Usuario usuario = new Usuario(codigo,login,funcionario,senha,perfil);
					lUsuario.add(usuario.toDTO());
				}
			}
		}

		return lUsuario;

	}
}

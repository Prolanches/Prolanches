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

import br.com.ProjecJava.model.Empresa;
import br.com.ProjecJava.model.Funcao;
import br.com.ProjecJava.model.Funcionario;
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
		String sql = "INSERT INTO USUARIO (USU_COD, USU_LOGIN, USU_FUNCIONARIO_COD, USU_SENHA, USU_NIVEL_COD) VALUES (SEQ_USUARIO.nextval, ?,?,?,?)";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, usuario.getLogin());
		statement.setInt(2, usuario.getFuncionario().getCodigo());
		statement.setString(3, usuario.getSenha());
		statement.setInt(4, usuario.getPerfil().getCodigo());
	
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(Usuario usuario) throws SQLException{
		String sql = "UPDATE USUARIO SET USU_LOGIN = ?, USU_FUNCIONARIO_COD = ?, USU_SENHA = ?, USU_NIVEL_COD = ? WHERE USU_COD = ?";
		 
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

	public List<Usuario> lista() throws SQLException {
		List<Usuario> lUsuario = new ArrayList<>();

		String sql = "SELECT * FROM USUARIO"
				+ " INNER JOIN FUNCIONARIO ON USUARIO.USU_FUNCIONARIO_COD = FUNCIONARIO.FUN_COD"
		        + " INNER JOIN PERFIL ON USUARIO.USU_NIVEL_COD = PERFIL.PERFIL_COD"
		        + " INNER JOIN EMPRESA ON FUNCIONARIO.FUN_EMPRESA_COD = EMPRESA.EMP_COD";;
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("USU_COD");
					String login = rs.getString("USU_LOGIN");
					int codigoFuncionario = rs.getInt("FUN_COD");
					String nomeFuncionario = rs.getString("FUN_NOME");
					int codigoEmpresa = rs.getInt("EMP_COD");
					String nomeEmpresa = rs.getString("EMP_NOME");
					String senha = rs.getString("USU_SENHA");
					int codigoPerfil = rs.getInt("PERFIL_COD");
					String nomePerfil = rs.getString("PERFIL_NIVEIS");
					
				
					
					Usuario usuario = new Usuario(codigo, login, new Funcionario (codigoFuncionario, nomeFuncionario,null, new Empresa(codigoEmpresa,nomeEmpresa,null,null,null,null)), senha, new Perfil(codigoPerfil,nomePerfil));
					lUsuario.add(usuario);
				}
			}
		}

		return lUsuario;

	}
}

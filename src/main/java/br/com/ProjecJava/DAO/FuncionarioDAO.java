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





/**
 * Esta é a Classe responsavel pelos Funcionarios
 * @author Lucas Braz
 *
 */
public class FuncionarioDAO {
	/**
	 * Configurações da Conexão
	 */
	private final Connection conex;
/**
 * Parametros da Conexão 
 * @param con
 */
	public FuncionarioDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir(Funcionario funcionario) throws SQLException{
		String sql = "INSERT INTO FUNCIONARIO (FUN_COD, FUN_NOME, FUN_FUNCAO_COD, FUN_EMPRESA_COD) VALUES (SEQ_FUNCIONARIO.nextval, ?, ?, ?)";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, funcionario.getNome());
		statement.setInt(2, funcionario.getFuncao().getCodigo());
		statement.setInt(3, funcionario.getEmpresa().getCodigo());
		
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(Funcionario funcionario) throws SQLException{
		String sql = "UPDATE FUNCIONARIO SET FUN_NOME = ?, FUN_FUNCAO_COD = ?, FUN_EMPRESA_COD = ? WHERE FUN_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, funcionario.getNome());
		statement.setInt(2, funcionario.getFuncao().getCodigo());
		statement.setInt(3, funcionario.getEmpresa().getCodigo());
		statement.setInt(4, funcionario.getCodigo());
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int codigo) throws SQLException{
		String sql = "DELETE FUNCIONARIO WHERE FUN_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<Funcionario> lista() throws SQLException {
		List<Funcionario> lFuncionario = new ArrayList<>();

		String sql = "SELECT * FROM FUNCIONARIO"
				+ " INNER JOIN FUNCAO ON FUNCIONARIO.FUN_FUNCAO_COD = FUNCAO.FUNCAO_COD"
		        + " INNER JOIN EMPRESA ON FUNCIONARIO.FUN_EMPRESA_COD = EMPRESA.EMP_COD";;
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("FUN_COD");
					String nome = rs.getString("FUN_NOME");
					int codigoFuncao = rs.getInt("FUNCAO_COD");
					String nomeFuncao = rs.getString("FUNCAO_NOME");
					int codigoEmpresa = rs.getInt("EMP_COD");
					String nomeEmpresa = rs.getString("EMP_NOME");
					
					
					Funcionario funcionario = new Funcionario(codigo, nome, new Funcao (codigoFuncao, nomeFuncao), new Empresa (codigoEmpresa, nomeEmpresa,null,null,null,null));
					lFuncionario.add(funcionario);
				}
			}
		}

		return lFuncionario;

	}
}

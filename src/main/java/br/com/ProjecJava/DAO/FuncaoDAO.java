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

import br.com.ProjecJava.dto.FuncaoDTO;
import br.com.ProjecJava.model.Funcao;
/**
 * Esta é a Classe responsavel pelas Funções
 * @author Lucas Braz
 *
 */
public class FuncaoDAO {
	/**
	 * Configurações da Conexão
	 */
	private final Connection conex;
/**
 * Parametros da Conexão 
 * @param con
 */
	public FuncaoDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir(Funcao funcao) throws SQLException{
		String sql = "INSERT INTO FUNCAO (FUNCAO_COD, FUNCAO_NOME) VALUES (SEQ_FUNCAO.nextval, ?)";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, funcao.getNome());
		
		
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(Funcao funcao) throws SQLException{
		String sql = "UPDATE FUNCAO SET FUNCAO_NOME = ? WHERE FUNCAO_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, funcao.getNome());
		statement.setInt(2, funcao.getCodigo());
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int codigo) throws SQLException{
		String sql = "DELETE FUNCAO WHERE FUNCAO_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<FuncaoDTO> lista() throws SQLException {
		List<FuncaoDTO> lFuncao = new ArrayList<>();

		String sql = "SELECT * FROM FUNCAO";;
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("FUNCAO_COD");
					String nome = rs.getString("FUNCAO_NOME");
				
					
					Funcao funcao = new Funcao(codigo, nome);
					lFuncao.add(funcao.toDTO());
				}
			}
		}

		return lFuncao;

	}
}

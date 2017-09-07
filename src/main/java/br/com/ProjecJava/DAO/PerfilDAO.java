/**
 * Este pacote responsavel pelo acesso no Banco 
 */
package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.model.Perfil;
/**
 * Classe responsavel pela pesquisa de Perfil
 * @author Lucas Braz 
 *
 */
public class PerfilDAO {
	/**
	 * Configurações da Conexão
	 */
	private final Connection conex;
/**
 * Parametros da Conexão 
 * @param con
 */
	public PerfilDAO(Connection con) {
		this.conex = con;
		
	}
/**
 * Metodo de listagem do Perfil
 * @return Retorna a lista de Perfil 
 * @throws SQLException
 */
	public List<Perfil> lista() throws SQLException {
		List<Perfil> lPerfil = new ArrayList<>();

		String sql = "select * from PERFIL";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("PERFIL_COD");
					String nivel = rs.getString("PERFIL_NIVEIS");
					Perfil perfil = new Perfil(codigo, nivel);
					lPerfil.add(perfil);
				}
			}


		return lPerfil;
	}
}
}

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

import br.com.ProjecJava.model.Pais;

/**
 * Classe responsavel pela pesquisa de Pais
 * @author Lucas Braz 
 *
 */
public class PaisDAO {
	
	/**
	 * Configurações da Conexão
	 */
	private final Connection conex;
/**
 * Parametros da Conexão 
 * @param con
 */
	public PaisDAO(Connection con) {
		this.conex = con;
		
	}
/**
 * Metodo de listagem dos Paises
 * @return Retorna a lista de Paises 
 * @throws SQLException
 */
	public List<Pais> lista() throws SQLException {
		List<Pais> lPais = new ArrayList<>();

		String sql = "select * from PAIS";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("PAIS_COD");
					String nome = rs.getString("PAIS_NOME");
					String sigla = rs.getString("PAIS_SIGLA");
					Pais pais = new Pais(codigo, nome, sigla);
					lPais.add(pais);
				}
			}


		return lPais;
	}
}
	
}

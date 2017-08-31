/**
 * pacote responsável ao acesso no banco
 */
package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.model.Cidade;
/**
 * Classe responsável em buscar os dados
 * @author Itamar Havenstein
 *
 */
public class CidadeDAO {
	/**
	 * configuração da conexao
	 */
	private final Connection conex;

	public CidadeDAO(Connection con) {
		this.conex = con;
	}
	/**
	 * metodo que listará as cidades do banco de dados
	 * @return retornará as cidades do banco de dados
	 * @throws SQLException
	 */

	public List<Cidade> lista() throws SQLException {
		List<Cidade> lCidade = new ArrayList<>();

		String sql = "SELECT * FROM CIDADE "
				+ "INNER CIDADE ON CIDADE.CIDADE_UF_COD  = ESTADO.ESTADO_COD"
				+ "WHERE CIDADE_UF_COD = ?";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("CIDADE_COD");
					String nome = rs.getString("CIDADE_NOME");
					
					Cidade cidade = new Cidade(codigo, nome, null);
					lCidade.add(cidade);
				}
			}
		}

		return lCidade;
}
}

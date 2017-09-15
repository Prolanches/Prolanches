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

import br.com.ProjecJava.dto.CidadeDTO;
import br.com.ProjecJava.model.Cidade;

/**
 * Classe responsável em buscar os dados da cidade
 * 
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
	 * Método de listagem das cidades
	 * 
	 * @param id
	 *            codigo do estado para selecionar as cidades referente ao estado
	 *            selecionado
	 * @return retorna as cidades do estado selecionado
	 * @throws SQLException
	 */

	public List<CidadeDTO> lista(int id) throws SQLException {
		List<CidadeDTO> lCidade = new ArrayList<>();
		String sql = "SELECT * FROM CIDADE INNER JOIN ESTADO ON (CIDADE.CIDADE_UF_COD  = ESTADO.ESTADO_COD) WHERE CIDADE_UF_COD IN ?";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.setInt(1, id);
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("CIDADE_COD");
					String nome = rs.getString("CIDADE_NOME");
					
					lCidade.add(new Cidade(codigo, nome, null).toDTO());
				}
				rs.close();
			}
			stmt.close();
		}
		return lCidade;
	}
	
}



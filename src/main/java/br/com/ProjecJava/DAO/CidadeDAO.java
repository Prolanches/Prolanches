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
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Pais;

/**
 * Classe responsável em buscar os dados da cidade
 * 
 * @author Itamar Havenstein
 *
 */
public class CidadeDAO {
	/**
	 * 
	 * confi guração da conexao
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

	public List<CidadeDTO> lista() throws SQLException {
		List<CidadeDTO> lCidade = new ArrayList<>();
		String sql = "SELECT * FROM CIDADE "
				+ " INNER JOIN ESTADO ON CIDADE.CIDADE_UF_COD  = ESTADO.ESTADO_COD "
				+ " INNER JOIN PAIS ON ESTADO.ESTADO_PAIS_COD  = PAIS.PAIS_COD ";;
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					
					int codigoPais = rs.getInt("PAIS_COD");
					String nomePais = rs.getString("PAIS_NOME");
					String siglaPais = rs.getString("PAIS_SIGLA");
					Pais pais = new Pais(codigoPais, nomePais, siglaPais);
					
					
					int codigoUF = rs.getInt("ESTADO_COD");
					String nomeUF = rs.getString("ESTADO_NOME");
					String siglaUF = rs.getString("ESTADO_UF");
					Estado estado = new Estado(codigoUF, nomeUF, siglaUF, pais);
					
					
					int codigo = rs.getInt("CIDADE_COD");
					String nome = rs.getString("CIDADE_NOME");
					Cidade cidade = new Cidade(codigo, nome, estado);
					lCidade.add(cidade.toDTO());
				}
				rs.close();
			}
			stmt.close();
		}
		return lCidade;
	}
	
}



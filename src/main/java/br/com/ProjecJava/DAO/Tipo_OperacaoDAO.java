/**
 * Este pacote é responsável pelo acesso ao banco
 */
package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.model.Tipo_Operacao;

/**
 * Classe responsável pela ligação com o banco de dados
 * 
 * @author Lucas Braz
 *
 */
public class Tipo_OperacaoDAO {
	/**
	 * Configurações da conexão
	 */
	private final Connection conex;

	public Tipo_OperacaoDAO(Connection con) {
		this.conex = con;
	}

	/**
	 * Método utilizado para listar todos os tipos de operação
	 * 
	 * @return - retorna uma lista de tipos de operação
	 * @throws SQLException
	 */
	public List<Tipo_Operacao> listarTipo_Operacao() throws SQLException {
		List<Tipo_Operacao> lTipo_Operacao = new ArrayList<>();

		String sql = "SELECT * FROM TIPO_OPERACAO";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("TIPO_OP_COD");
					String nome = rs.getString("TIPO_OP_NOME");
					Tipo_Operacao tipooperacao = new Tipo_Operacao(codigo, nome);
					lTipo_Operacao.add(tipooperacao);
				}
			}
		}
		return lTipo_Operacao;
	}
}


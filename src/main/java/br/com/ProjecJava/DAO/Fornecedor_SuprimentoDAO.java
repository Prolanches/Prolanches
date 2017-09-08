/**
 * Esta classe é responsável pelo acesso ao banco
 */
package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.model.Fornecedor;
import br.com.ProjecJava.model.Fornecedor_Suprimento;
import br.com.ProjecJava.model.Marca;
import br.com.ProjecJava.model.Suprimento;

/**
 * Classe responsável pela ligação do Fornecedor_Suprimento com o banco
 * 
 * @author Itamar Havenstein
 *
 */
public class Fornecedor_SuprimentoDAO {

	/**
	 * Configuração da conexão
	 */
	private final Connection conex;

	public Fornecedor_SuprimentoDAO(Connection con) {
		this.conex = con;
	}

	/**
	 * Método de inserção de novos Fornecedores e suprimentos
	 * 
	 * @param forneSupri
	 *            - construtor utilizado para adicionar os codigos de fornecedor e
	 *            suprimento
	 * @return
	 * @throws SQLException
	 */
	public boolean inserir(Fornecedor_Suprimento forneSupri) throws SQLException {
		String sql = "INSERT INTO FORNECEDOR_SUPRIMENTOS (FOR_SUP_COD,FOR_SUP_FORNECEDOR_COD,FOR_SUP_SUPRIMENTO_COD)VALUES(SEQ_FORNECEDOR_SUPRIMENTOS.nextval,?,?)";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, forneSupri.getFornecedor().getCodigo());
		statement.setInt(2, forneSupri.getSuprimento().getCodigo());

		return statement.executeUpdate() > 0;
	}

	/**
	 * Método utilizado para a alteração de dados sobre fornecedor e suprimento
	 * 
	 * @param codigo
	 *            - codigo que será utilizado para saber qual modificar
	 * @param fornecedor
	 *            - nova informação a ser adicionada a fornecedor
	 * @param suprimento
	 *            - nova informação a ser adicionada a suprimento
	 * @return
	 * @throws SQLException
	 */
	public boolean alterar(int codigo, Fornecedor fornecedor, Suprimento suprimento) throws SQLException {
		String sql = "UPDATE FORNECEDOR_SUPRIMENTOS SET FOR_SUP_FORNECEDOR_COD = ?, FOR_SUP_SUPRIMENTO_COD = ? WHERE FOR_SUP_COD = ?";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, fornecedor.getCodigo());
		statement.setInt(2, suprimento.getCodigo());
		statement.setInt(3, codigo);

		return statement.executeUpdate() > 0;
	}

	/**
	 * Método utilizado para a exclusão do fornecedor_suprimento
	 * 
	 * @param codigo
	 *            - codigo utilizado para saber qual será removido
	 * @return
	 * @throws SQLException
	 */
	public boolean excluir(int codigo) throws SQLException {
		String sql = "DELETE FORNECEDOR_SUPRIMENTOS WHERE FOR_SUP_COD = ?";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);

		return statement.executeUpdate() > 0;
	}

	/**
	 * Método utilizado para listar todos os fornecedores_suprimentos
	 * 
	 * @return - retorna a lista de todos os fornecedores e suprimentos adicionados
	 *         na tabela Fornecedor_Suprimento
	 * @throws SQLException
	 */
	public List<Fornecedor_Suprimento> listarForneSupri() throws SQLException {
		List<Fornecedor_Suprimento> lForneSupri = new ArrayList<>();

		String sql = "SELECT * FROM FORNECEDOR_SUPRIMENTOS "
				+ " INNER JOIN FORNECEDOR ON FORNECEDOR_SUPRIMENTOS.FOR_SUP_FORNECEDOR_COD = FORNECEDOR.FOR_COD "
				+ " INNER JOIN SUPRIMENTO ON FORNECEDOR_SUPRIMENTOS.FOR_SUP_SUPRIMENTO_COD = SUPRIMENTO.SUPRI_COD "
				+ " INNER JOIN MARCA ON SUPRIMENTO.SUPRI_MARCA_COD = MARCA.MARCA_COD ";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int marcaCod = rs.getInt("MARCA_COD");
					String marcaNome = rs.getString("MARCA_NOME");
					Marca marca = new Marca(marcaCod, marcaNome);
					int supriCod = rs.getInt("SUPRI_COD");
					String supriNome = rs.getString("SUPRI_NOME");
					Suprimento supri = new Suprimento(supriCod, supriNome, null, 0, 0, marca);
					int forneCod = rs.getInt("FOR_COD");
					String forneNome = rs.getString("FOR_NOME");
					Fornecedor forne = new Fornecedor(forneCod, forneNome, null, null, null, null);
					int forSupCod = rs.getInt("FOR_SUP_COD");
					Fornecedor_Suprimento forneSupri = new Fornecedor_Suprimento(forSupCod, forne, supri);
					lForneSupri.add(forneSupri);
				}
			}
		}
		return lForneSupri;

	}
}

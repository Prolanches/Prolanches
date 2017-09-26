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

import br.com.ProjecJava.dto.SuprimentoDTO;
import br.com.ProjecJava.model.Marca;
import br.com.ProjecJava.model.Suprimento;
import br.com.ProjecJava.model.Tipo_Unidade;

/**
 * Classe responsável pela ligação com o banco de dados
 * 
 * @author Itamar Havenstein
 *
 */
public class SuprimentoDAO {

	/**
	 * Configuração da conexão
	 */
	private final Connection conex;

	public SuprimentoDAO(Connection con) {
		this.conex = con;
	}

	/**
	 * Método para inserir os dados do suprimento no banco de dados
	 * 
	 * @param suprimento
	 *            - construtor utilizado para adicionar o suprimento
	 * @return
	 * @throws SQLException
	 */
	public boolean inserir(Suprimento suprimento) throws SQLException {
		String sql = "INSERT INTO SUPRIMENTO(SUPRI_COD,SUPRI_NOME,SUPRI_TIPO_UND_COD,SUPRI_QUANTIDADE,SUPRI_CUSTO,SUPRI_MARCA_COD) VALUES(SEQ_SUPRIMENTO.nextval,?,?,?,?,?)";

		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, suprimento.getNome());
		statement.setInt(2, suprimento.getTipoUnidade().getCodigo());
		statement.setInt(3, suprimento.getQuantidade());
		statement.setDouble(4, suprimento.getCusto());
		statement.setInt(5, suprimento.getMarca().getCodigo());

		return statement.executeUpdate() > 0;
	}

	/**
	 * Método utilizado para a alteração de dados do suprimento
	 * 
	 * @param suprimento
	 *            - construtor utilizado para adicionar as alterações no banco
	 * @return
	 * @throws SQLException
	 */
	public boolean alterar(Suprimento suprimento) throws SQLException {
		String sql = "UPDATE SUPRIMENTO SET SUPRI_NOME = ?, SUPRI_TIPO_UND_COD = ?, SUPRI_QUANTIDADE = ?, SUPRI_CUSTO = ?, SUPRI_MARCA_COD = ? WHERE SUPRI_COD = ?";

		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, suprimento.getNome());
		statement.setInt(2, suprimento.getTipoUnidade().getCodigo());
		statement.setInt(3, suprimento.getQuantidade());
		statement.setDouble(4, suprimento.getCusto());
		statement.setInt(5, suprimento.getMarca().getCodigo());
		statement.setInt(6, suprimento.getCodigo());

		return statement.executeUpdate() > 0;
	}

	/**
	 * Método utilizado para exclusão do suprimento
	 * 
	 * @param codigo
	 *            - código utilizado para exclusão de um suprimento
	 * @return
	 * @throws SQLException
	 */
	public boolean excluir(int codigo) throws SQLException {
		String sql = " DELETE SUPRIMENTO WHERE SUPRI_COD = ? ";

		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);

		return statement.executeUpdate() > 0;
	}

	/**
	 * Método utilizado para listar todos os suprimentos adicionados ao banco
	 * 
	 * @return - retorna os suprimentos encontrados no banco de dados
	 * @throws SQLException
	 */
	public List<SuprimentoDTO> listarSuprimentos() throws SQLException {
		List<SuprimentoDTO> lSuprimento = new ArrayList<>();

		String sql = " SELECT * FROM SUPRIMENTO " + " INNER JOIN MARCA ON MARCA.MARCA_COD = SUPRIMENTO.SUPRI_MARCA_COD "
				+ " INNER JOIN TIPO_UNIDADE ON TIPO_UNIDADE.TIPO_UND_COD = SUPRIMENTO.SUPRI_TIPO_UND_COD ";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int marcaCod = rs.getInt("MARCA_COD");
					String marcaNome = rs.getString("MARCA_NOME");
					Marca marca = new Marca(marcaCod, marcaNome);
					
					int tipoCod = rs.getInt("TIPO_UND_COD");
					String tipoNome = rs.getString("TIPO_UND_NOME");
					int tipoUni = rs.getInt("TIPO_UND_UNIDADE");
					Tipo_Unidade tipoUnid = new Tipo_Unidade(tipoCod, tipoNome, tipoUni);
					
					int supriCod = rs.getInt("SUPRI_COD");
					String supriNome = rs.getString("SUPRI_NOME");
					int supriQuant = rs.getInt("SUPRI_QUANTIDADE");
					double supriCusto = rs.getDouble("SUPRI_CUSTO");
					Suprimento supri = new Suprimento(supriCod, supriNome, tipoUnid, supriQuant, supriCusto, marca);
					lSuprimento.add(supri.toDTO());
				}
			}
		}
		return lSuprimento;
	}
}

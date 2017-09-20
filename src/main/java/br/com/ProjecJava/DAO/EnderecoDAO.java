/**
 * Pacote responsável ao acesso no banco
 */
package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.ProjecJava.dto.EnderecoDTO;
import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Pais;

/**
 * Classe responsável por buscar os dados do endereço
 * 
 * @author Itamar Havenstein
 *
 */
public class EnderecoDAO {

	/**
	 * Configuração da conexão
	 */
	private final Connection conex;

	public EnderecoDAO(Connection con) {
		this.conex = con;
	}

	/**
	 * Método de inserção dos endereços
	 * 
	 * @param endereco
	 *            - adicionando os atributos sobre o endereço
	 * @return
	 * @throws SQLException
	 */
	public boolean inserir(Endereco endereco) throws SQLException {
		String sql = "INSERT INTO ENDERECO (END_COD,END_RUA,END_CIDADE_COD)VALUES(SEQ_ENDERECO.nextval,?,?)";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, endereco.getRua());
		statement.setInt(2, endereco.getCidade().getCodigo());

		return statement.executeUpdate() > 0;
	}

	/**
	 * Método utilizado para alteração do endereço de um determinado fornecedor ou
	 * empresa
	 * 
	 * @param codigo
	 *            - parametro utilizado para alteração do endereço
	 * @param rua
	 *            - nova informação para ser inserida
	 * @param cidade
	 *            - nova informação para ser inserida
	 * @return
	 * @throws SQLException
	 */
	public boolean alterar(Endereco endereco) throws SQLException {
		String sql = "UPDATE ENDERECO SET END_RUA = ?, END_CIDADE_COD = ? WHERE END_COD = ?";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, endereco.getRua());
		statement.setInt(2, endereco.getCidade().getCodigo());
		statement.setInt(3, endereco.getCodigo());

		return statement.executeUpdate() > 0;
	}

	/**
	 * Método de exclusão
	 * 
	 * @param codigo-
	 *            numero de registro
	 * @return
	 * @throws SQLException
	 */
	public boolean excluir(int codigo) throws SQLException {
		String sql = "DELETE ENDERECO WHERE END_COD = ?";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);

		return statement.executeUpdate() > 0;
	}

	/**
	 * Método de listagem dos endereços
	 * 
	 * @return - retorna os endereços do adicionados no banco
	 * @throws SQLException
	 */
	public List<EnderecoDTO> listarEnderecos() throws SQLException {
		List<EnderecoDTO> lEnderecos = new ArrayList<>();

		String sql = "SELECT * FROM ENDERECO" + " INNER JOIN CIDADE ON ENDERECO.END_CIDADE_COD = CIDADE.CIDADE_COD"
				+ " INNER JOIN ESTADO ON CIDADE.CIDADE_UF_COD = ESTADO.ESTADO_COD"
				+ " INNER JOIN PAIS ON ESTADO.ESTADO_PAIS_COD = PAIS.PAIS_COD";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					String nome = rs.getString("PAIS_NOME");
					int codigo = rs.getInt("PAIS_COD");
					String sigla = rs.getString("PAIS_SIGLA");
					Pais pais = new Pais(codigo, nome, sigla);
					
					int codigoEstado = rs.getInt("ESTADO_COD");
					String nomeEstado = rs.getString("ESTADO_NOME");
					String siglaEstado = rs.getString("ESTADO_UF");
					Estado estado = new Estado(codigoEstado, nomeEstado, siglaEstado, pais);
					
					int codigoCidade = rs.getInt("CIDADE_COD");
					String nomeCidade = rs.getString("CIDADE_NOME");
					Cidade cidade = new Cidade(codigoCidade, nomeCidade, estado);
					
					int codigoEndereco = rs.getInt("END_COD");
					String ruaEndereco = rs.getString("END_RUA");
					Endereco endereco = new Endereco(codigoEndereco, ruaEndereco, cidade);
					lEnderecos.add(endereco.toDTO());
				}
			}
		}
		return lEnderecos;
	}
}

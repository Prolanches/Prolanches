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

import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Fornecedor;
import br.com.ProjecJava.model.Pais;

/**
 * Classe responsável pela ligação com o banco de dados
 * 
 * @author Itamar Havenstein
 *
 */
public class FornecedorDAO {

	/**
	 * Configuração da conexão
	 */
	private final Connection conex;

	public FornecedorDAO(Connection con) {
		this.conex = con;
	}

	/**
	 * Método de inserção de novos fornecedores
	 * 
	 * @param fornecedor
	 *            - construtor utilizado para adicionar o fornecedor
	 * @return
	 * @throws SQLException
	 */
	public boolean inserir(Fornecedor fornecedor) throws SQLException {
		String sql = "INSERT INTO FORNECEDOR (FOR_COD,FOR_NOME,FOR_CNPJ,FOR_ENDERECO_COD,FOR_TELEFONE,FOR_EMAIL)VALUES(SEQ_FORNECEDOR.nextval,?,?,?,?,?)";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, fornecedor.getNome());
		statement.setString(2, fornecedor.getCnpj());
		statement.setInt(3, fornecedor.getEndereco().getCodigo());
		statement.setString(4, fornecedor.getTelefone());
		statement.setString(5, fornecedor.getEmail());

		return statement.executeUpdate() > 0;
	}

	/**
	 * Método utilizado para a alteração de dados do fornecedor
	 * 
	 * @param codigo
	 *            - codigo do fornecedor utilizado para a alteração
	 * @param nome
	 *            - novo nome do fornecedor para atualização
	 * @param cnpj
	 *            - novo cnpj do fornecedor para atualização
	 * @param endereco
	 *            - novo endereço do fornecedor para atualização
	 * @param telefone
	 *            - novo telefone do fornecedor para atualização
	 * @param email
	 *            - novo e-mail do fornecedor para atualização
	 * @return
	 * @throws SQLException
	 */
	public boolean alterar(int codigo, String nome, String cnpj, Endereco endereco, String telefone, String email)
			throws SQLException {
		String sql = "UPDATE FORNECEDOR SET FOR_NOME = ?, FOR_CNPJ = ?, FOR_ENDERECO_COD = ?, FOR_TELEFONE = ?, FOR_EMAIL = ? WHERE FOR_COD = ?";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setString(2, cnpj);
		statement.setInt(3, endereco.getCodigo());
		statement.setString(4, telefone);
		statement.setString(5, email);
		statement.setInt(6, codigo);

		return statement.executeUpdate() > 0;
	}

	/**
	 * Método utilizado para excluir um fornecedor
	 * 
	 * @param codigo
	 *            - codigo utilizado para a exclução do fornecedor
	 * @return
	 * @throws SQLException
	 */
	public boolean excluir(int codigo) throws SQLException {
		String sql = "DELETE FORNECEDOR WHERE FOR_COD = ?";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);

		return statement.executeUpdate() > 0;
	}

	/**
	 * Método utilizado para listar todos os fornecedores
	 * 
	 * @return - retorna a lista de fornecedores da empresa
	 * @throws SQLException
	 */
	public List<Fornecedor> listarFornecedores() throws SQLException {
		List<Fornecedor> lFornecedores = new ArrayList<>();

		String sql = "SELECT * FROM FORNECEDOR"
				+ " INNER JOIN ENDERECO ON FORNECEDOR.FOR_ENDERECO_COD = ENDERECO.END_COD"
				+ " INNER JOIN CIDADE ON ENDERECO.END_CIDADE_COD = CIDADE.CIDADE_COD"
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
					int codigoFor = rs.getInt("FOR_COD");
					String nomeFor = rs.getString("FOR_NOME");
					String cnpj = rs.getString("FOR_CNPJ");
					String telefone = rs.getString("FOR_TELEFONE");
					String email = rs.getString("FOR_EMAIL");
					Fornecedor fornecedor = new Fornecedor(codigoFor, nomeFor, cnpj, endereco, telefone, email);
					lFornecedores.add(fornecedor);
				}
			}
		}
		return lFornecedores;
	}
}

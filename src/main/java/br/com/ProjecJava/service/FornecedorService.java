
/**
 * Este Pacote é responsável pelas classes services
 */
package br.com.ProjecJava.service;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


import br.com.ProjecJava.DAO.FornecedorDAO;
import br.com.ProjecJava.dto.FornecedorDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Fornecedor;
import br.com.ProjecJava.model.Pais;

/**
 * Esta classe é responsável pela Service do Fornecedor
 * 
 * @author Itamar Havenstein
 *
 */
public class FornecedorService {

	/**
	 * Método responsável por inserir os Fornecedores no banco
	 * 
	 * @param fornecedor
	 *            - construtor utilizado para inserir os dados
	 * @throws SQLException
	 */
	public void inserir(FornecedorDTO fornecedorDTO) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			
			Pais pais = new Pais();
			pais.setCodigo(fornecedorDTO.getCodigoPais());
			
			Estado estado = new Estado();
			estado.setCodigo(fornecedorDTO.getCodigoUF());
			estado.setPais(pais);
			
			Cidade cidade = new Cidade();
			cidade.setCodigo(fornecedorDTO.getCodigoCidade());
			cidade.setEstado(estado);
			
			
			Endereco endereco = new Endereco();
			endereco.setCodigo(fornecedorDTO.getCodigoEndereco());
			endereco.setRua(fornecedorDTO.getRua());
			endereco.setCidade(cidade);
			
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setNome(fornecedorDTO.getNome());
			fornecedor.setCnpj(fornecedorDTO.getCnpj());
			fornecedor.setEndereco(endereco);
			fornecedor.setTelefone(fornecedorDTO.getTelefone());
			fornecedor.setEmail(fornecedorDTO.getEmail());
			
			new FornecedorDAO(conex).inserir(fornecedor);
		}
	}

	/**
	 * Método utilizado para a alteração dos dados do fornecedor
	 * 
	 * @param codigo
	 *            - codigo do fornecedor
	 * @param nome
	 *            - novo nome do fornecedor
	 * @param cnpj
	 *            - novo cnpj do fornecedor
	 * @param endereco
	 *            - novo endereço do fornecedor
	 * @param telefone-
	 *            novo telefone do fornecedor
	 * @param email
	 *            - novo e-mail do fornecedor
	 * @throws SQLException
	 */
	public void alterar(FornecedorDTO fornecedorDTO)throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			
			Pais pais = new Pais();
			pais.setCodigo(fornecedorDTO.getCodigoPais());
			
			Estado estado = new Estado();
			estado.setCodigo(fornecedorDTO.getCodigoUF());
			estado.setPais(pais);
			
			Cidade cidade = new Cidade();
			cidade.setCodigo(fornecedorDTO.getCodigoCidade());
			cidade.setEstado(estado);
			
			
			Endereco endereco = new Endereco();
			endereco.setCodigo(fornecedorDTO.getCodigoEndereco());
			endereco.setRua(fornecedorDTO.getRua());
			endereco.setCidade(cidade);
			
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setCodigo(fornecedorDTO.getCodigo());
			fornecedor.setNome(fornecedorDTO.getNome());
			fornecedor.setCnpj(fornecedorDTO.getCnpj());
			fornecedor.setEndereco(endereco);
			fornecedor.setTelefone(fornecedorDTO.getTelefone());
			fornecedor.setEmail(fornecedorDTO.getEmail());
			
			new FornecedorDAO(conex).alterar(fornecedor);
		}
	}

	/**
	 * Método de exclusão de um fornecedor
	 * 
	 * @param codigo
	 *            - codigo do fornecedor para ser excluído
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(conex).excluir(codigo);
		}
	}

	/**
	 * Método utilizado para listar os fornecedores
	 * 
	 * @return - retorna todos os fornecedores cadastrados
	 * @throws SQLException
	 */
	public List<FornecedorDTO> listarFornecedores() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new FornecedorDAO(conex).listarFornecedores();
		}
	}

}

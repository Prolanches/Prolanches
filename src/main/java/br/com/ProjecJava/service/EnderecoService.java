/**
 * Este pacote é responsável pelas classes Services
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.EnderecoDAO;
import br.com.ProjecJava.dto.EnderecoDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Pais;

/**
 * Esta classe é responsável pela Service do endereco
 * 
 * @author Itamar Havenstein
 *
 */
public class EnderecoService {

	/**
	 * Método responsável por inserir os endereços no banco
	 * 
	 * @param endereco
	 * @throws SQLException
	 */
	public void inserir(EnderecoDTO enderecoDTO) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			
			
			Pais pais = new Pais();
			pais.setCodigo(enderecoDTO.getCodigoPais());
			
			Estado estado = new Estado();
			estado.setCodigo(enderecoDTO.getCodigoUF());
			estado.setPais(pais);
			
			Cidade cidade = new Cidade();
			cidade.setCodigo(enderecoDTO.getCodigoCidade());
			cidade.setEstado(estado);
			
			
			Endereco endereco = new Endereco();
			endereco.setRua(enderecoDTO.getRua());
			endereco.setCidade(cidade);
			
			new EnderecoDAO(conex).inserir(endereco);
		}
	}

	/**
	 * Método responsável pela alteração do endereço
	 * 
	 * @param codigo
	 *            - parametro utilizado para alteração do endereço
	 * @param rua
	 *            - nova informação a ser inserida no endereço
	 * @param cidade
	 * @throws SQLException
	 */
	public void alterar(EnderecoDTO enderecoDTO) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			
			Pais pais = new Pais();
			pais.setCodigo(enderecoDTO.getCodigoPais());
			
			Estado estado = new Estado();
			estado.setCodigo(enderecoDTO.getCodigoUF());
			estado.setPais(pais);
			
			Cidade cidade = new Cidade();
			cidade.setCodigo(enderecoDTO.getCodigoCidade());
			cidade.setEstado(estado);
			
			
			Endereco endereco = new Endereco();
			endereco.setCodigo(enderecoDTO.getCodigo());
			endereco.setRua(enderecoDTO.getRua());
			endereco.setCidade(cidade);
			
			new EnderecoDAO(conex).alterar(endereco);
		}
	}

	/**
	 * Método responsável por excluir um determinado endereço
	 * 
	 * @param codigo
	 *            - parametro utilizado para a exclusão do endereço
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new EnderecoDAO(conex).excluir(codigo);
		}
	}

	/**
	 * Método responsável para listar os endereços cadastrados
	 * 
	 * @return - retorna lista de endereços
	 * @throws SQLException
	 */
	public static List<EnderecoDTO> listarEnderecos() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new EnderecoDAO(conex).listarEnderecos();
		}
	}

	}


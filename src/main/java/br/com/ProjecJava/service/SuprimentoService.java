/**
 * Este pacote é responsável pelas classes services
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.SuprimentoDAO;
import br.com.ProjecJava.dto.SuprimentoDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Marca;
import br.com.ProjecJava.model.Suprimento;
import br.com.ProjecJava.model.Tipo_Unidade;

/**
 * Esta classe é responsável pela Service do Suprimento
 * 
 * @author Itamar Havenstein
 *
 */
public class SuprimentoService {

	/**
	 * Método responsável por inserir os suprimentos no banco
	 * 
	 * @param suprimento
	 *            - construtor utilizado para inserir os novos dados
	 * @throws SQLException
	 */
	public void inserir(SuprimentoDTO suprimentoDTO) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			
			Tipo_Unidade tipounidade = new Tipo_Unidade();
			tipounidade.setCodigo(suprimentoDTO.getCodigoTipo_Unidade());
			
			Marca marca = new Marca();
			marca.setCodigo(suprimentoDTO.getCodigoMarca());
			
			Suprimento suprimento = new Suprimento();
			suprimento.setNome(suprimentoDTO.getNome());
			suprimento.setTipoUnidade(tipounidade);
			suprimento.setQuantidade(suprimentoDTO.getQuantidade());
			suprimento.setCusto(suprimentoDTO.getCusto());
			suprimento.setMarca(marca);
			
			new SuprimentoDAO(conex).inserir(suprimento);
		}
	}

	/**
	 * Método utilizado para a alteração dos dados do suprimento
	 * 
	 * @param suprimento
	 *            - construtor utilizado para fazer as alterações de dados
	 * @throws SQLException
	 */
	public void alterar(SuprimentoDTO suprimentoDTO) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			
			Tipo_Unidade tipounidade = new Tipo_Unidade();
			tipounidade.setCodigo(suprimentoDTO.getCodigoTipo_Unidade());
			
			Marca marca = new Marca();
			marca.setCodigo(suprimentoDTO.getCodigoMarca());
			
			Suprimento suprimento = new Suprimento();
			suprimento.setCodigo(suprimentoDTO.getCodigo());
			suprimento.setNome(suprimentoDTO.getNome());
			suprimento.setQuantidade(suprimentoDTO.getQuantidade());
			suprimento.setCusto(suprimentoDTO.getCusto());
			
			new SuprimentoDAO(conex).alterar(suprimento);
		}
	}

	/**
	 * Método para excluir os suprimentos
	 * 
	 * @param codigo
	 *            - codigo utilizado para excluir do banco
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new SuprimentoDAO(conex).excluir(codigo);
		}
	}

	/**
	 * Método utilizado para listar todos os Suprimentos
	 * 
	 * @return - retorna todos os suprimentos cadastrados no banco
	 * @throws SQLException
	 */
	public static List<SuprimentoDTO> listarSuprimentos() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new SuprimentoDAO(conex).listarSuprimentos();
		}
	}
}

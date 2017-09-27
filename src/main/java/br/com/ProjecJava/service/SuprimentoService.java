/**
 * Este pacote é responsável pelas classes services
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import br.com.ProjecJava.DAO.Contas_PagarDAO;
import br.com.ProjecJava.DAO.Fornecedor_SuprimentoDAO;
import br.com.ProjecJava.DAO.SuprimentoDAO;
import br.com.ProjecJava.dto.FornecedorDTO;
import br.com.ProjecJava.dto.SuprimentoDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Contas_Pagar;
import br.com.ProjecJava.model.Fornecedor;
import br.com.ProjecJava.model.Fornecedor_Suprimento;
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
	public void inserir(SuprimentoDTO suprimentoDTO,  List<FornecedorDTO> lFornecedores) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			SuprimentoDAO suprimentoDAO = new SuprimentoDAO(conex);
			Fornecedor_SuprimentoDAO fornecedor_SuprimentoDAO = new Fornecedor_SuprimentoDAO(conex);
			Contas_PagarDAO contas_pagarDAO = new Contas_PagarDAO(conex);
			
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
			
			suprimentoDAO.inserir(suprimento);
			
			
			for (FornecedorDTO fornecedorDTO : lFornecedores) {
				Fornecedor_Suprimento fornecedor_Suprimento = new Fornecedor_Suprimento();
				Fornecedor fornecedor = new Fornecedor();
				Contas_Pagar contas_pagar = new Contas_Pagar();
				fornecedor.setCodigo(fornecedorDTO.getCodigo());
				fornecedor.setNome(fornecedorDTO.getNome());
				fornecedor.setCnpj(fornecedorDTO.getCnpj());
				fornecedor.setTelefone(fornecedorDTO.getTelefone());
				fornecedor.setEmail(fornecedorDTO.getEmail());
				
				
				fornecedor_Suprimento.setFornecedor(fornecedor);
				fornecedor_Suprimento.setSuprimento(suprimento);
				fornecedor_SuprimentoDAO.inserir(fornecedor_Suprimento);
				contas_pagar.setCusto(suprimentoDTO.getCusto());
				contas_pagar.setForneSupri(fornecedor_Suprimento);
				contas_pagar.setData(new Date());
				contas_pagarDAO.inserir(contas_pagar);
				
				
				
			}
	
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
	public List<SuprimentoDTO> listarSuprimentos() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new SuprimentoDAO(conex).listarSuprimentos();
		}
	}
}

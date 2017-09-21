/**
 * Este é o pacote responsavel pela ligação com o Banco 
 */
package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.dto.FuncionarioDTO;
import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Empresa;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Funcao;
import br.com.ProjecJava.model.Funcionario;
import br.com.ProjecJava.model.Pais;





/**
 * Esta é a Classe responsavel pelos Funcionarios
 * @author Lucas Braz
 *
 */
public class FuncionarioDAO {
	/**
	 * Configurações da Conexão
	 */
	private final Connection conex;
/**
 * Parametros da Conexão 
 * @param con
 */
	public FuncionarioDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir(Funcionario funcionario) throws SQLException{
		String sql = "INSERT INTO FUNCIONARIO (FUN_COD, FUN_NOME, FUN_FUNCAO_COD, FUN_EMPRESA_COD) VALUES (SEQ_FUNCIONARIO.nextval, ?, ?, ?)";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, funcionario.getNome());
		statement.setInt(2, funcionario.getFuncao().getCodigo());
		statement.setInt(3, funcionario.getEmpresa().getCodigo());
		
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(Funcionario funcionario) throws SQLException{
		String sql = "UPDATE FUNCIONARIO SET FUN_NOME = ?, FUN_FUNCAO_COD = ?, FUN_EMPRESA_COD = ? WHERE FUN_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, funcionario.getNome());
		statement.setInt(2, funcionario.getFuncao().getCodigo());
		statement.setInt(3, funcionario.getEmpresa().getCodigo());
		statement.setInt(4, funcionario.getCodigo());
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int codigo) throws SQLException{
		String sql = "DELETE FUNCIONARIO WHERE FUN_COD = ?";
		 
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<FuncionarioDTO> lista() throws SQLException {
		List<FuncionarioDTO> lFuncionario = new ArrayList<>();

		String sql = "SELECT * FROM FUNCIONARIO"
				+ " INNER JOIN FUNCAO ON FUNCIONARIO.FUN_FUNCAO_COD = FUNCAO.FUNCAO_COD"
		        + " INNER JOIN EMPRESA ON FUNCIONARIO.FUN_EMPRESA_COD = EMPRESA.EMP_COD"
		        + " INNER JOIN ENDERECO ON EMPRESA.EMP_ENDERECO_COD = ENDERECO.END_COD"
		        + " INNER JOIN CIDADE ON ENDERECO.END_CIDADE_COD = CIDADE.CIDADE_COD"
				+ " INNER JOIN ESTADO ON CIDADE.CIDADE_UF_COD = ESTADO.ESTADO_COD"
				+ " INNER JOIN PAIS ON ESTADO.ESTADO_PAIS_COD = PAIS.PAIS_COD";;
				
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					
					int codigoFuncao = rs.getInt("FUNCAO_COD");
					String nomeFuncao = rs.getString("FUNCAO_NOME");
					Funcao funcao = new Funcao(codigoFuncao,nomeFuncao);
					
					int codigoPais = rs.getInt("PAIS_COD");
					String nomePais = rs.getString("PAIS_NOME");
					String siglaPais= rs.getString("PAIS_SIGLA");
					Pais pais = new Pais(codigoPais,nomePais,siglaPais);
					
					int codigoEstado = rs.getInt("ESTADO_COD");
					String nomeEstado = rs.getString("ESTADO_NOME");
					String ufEstado = rs.getString("ESTADO_UF");
					Estado estado = new Estado(codigoEstado,nomeEstado,ufEstado,pais);
					
					int codigoCidade = rs.getInt("CIDADE_COD");
					String nomeCidade = rs.getString("CIDADE_NOME");
					Cidade cidade = new Cidade(codigoCidade,nomeCidade,estado);
		
					int codigoEndereco = rs.getInt("END_COD");
					String ruaEndereco = rs.getString("END_RUA");
					Endereco endereco = new Endereco(codigoEndereco,ruaEndereco,cidade);
				
					
					int codigoEmpresa = rs.getInt("EMP_COD");
					String nomeEmpresa = rs.getString("EMP_NOME");
					String cnpj = rs.getString("EMP_CNPJ_CPF");
					String telefone= rs.getString("EMP_TELEFONE");
					String email = rs.getString("EMP_EMAIL");
					Empresa empresa = new Empresa(codigoEmpresa,nomeEmpresa,endereco,cnpj,telefone,email);
					
					int codigo = rs.getInt("FUN_COD");
					String nome = rs.getString("FUN_NOME");
					Funcionario funcionario = new Funcionario(codigo,nome,funcao,empresa);
					lFuncionario.add(funcionario.toDTO());
				}
			}
		}

		return lFuncionario;

	}
}

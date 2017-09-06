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

import br.com.ProjecJava.model.Cidade;
import br.com.ProjecJava.model.Empresa;
import br.com.ProjecJava.model.Endereco;
import br.com.ProjecJava.model.Estado;
import br.com.ProjecJava.model.Pais;

/**
 * Esta é a Classe responsavel pelas Empresas
 * @author Lucas Braz
 *
 */
public class EmpresaDAO {
	/**
	 * Configurações da Conexão
	 */
	private final Connection conex;
/**
 * Parametros da Conexão 
 * @param con
 */
	public EmpresaDAO(Connection con) {
		this.conex = con;
	}
		public boolean inserir(Empresa empresa) throws SQLException{
			String sql = "INSERT INTO EMPRESA (EMP_COD, EMP_NOME, EMP_ENDERECO_COD, EMP_CNPJ_CPF, EMP_TELEFONE, EMP_EMAIL) VALUES (SEQ_EMPRESA.nextval, ?, ?, ?, ?,?)";
			 
			PreparedStatement statement = conex.prepareStatement(sql);
			statement.setString(1, empresa.getNome());
			statement.setInt(2, empresa.getEndereco().getCodigo());
			statement.setString(3, empresa.getCnpj());
			statement.setString(4, empresa.getTelefone());
			statement.setString(5, empresa.getEmail());
			 
			return statement.executeUpdate() > 0;
		}
		
		public boolean alterar(Empresa empresa) throws SQLException{
			String sql = "UPDATE EMPRESA SET EMP_NOME = ?, EMP_ENDERECO_COD = ?, EMP_CNPJ_CPF = ? , EMP_TELEFONE = ?, EMP_EMAIL = ? WHERE EMP_COD = ?";
			 
			PreparedStatement statement = conex.prepareStatement(sql);
			statement.setString(1, empresa.getNome());
			statement.setInt(2, empresa.getEndereco().getCodigo());
			statement.setString(3, empresa.getCnpj());
			statement.setString(4, empresa.getTelefone());
			statement.setString(5, empresa.getEmail());
			statement.setInt(6, empresa.getCodigo());
			 
			return statement.executeUpdate() > 0;
		}
		
		public boolean excluir(int codigo) throws SQLException{
			String sql = "DELETE EMPRESA WHERE EMP_COD = ?";
			 
			PreparedStatement statement = conex.prepareStatement(sql);
			statement.setInt(1, codigo);
			 
			return statement.executeUpdate() > 0;
		}

		public List<Empresa> lista() throws SQLException {
			List<Empresa> lEmpresa = new ArrayList<>();

			String sql = "SELECT * FROM EMPRESA"
					+ " INNER JOIN ENDERECO ON EMPRESA.EMP_ENDERECO_COD = ENDERECO.END_COD"
			        + " INNER JOIN CIDADE ON ENDERECO.END_CIDADE_COD = CIDADE.CIDADE_COD"
					+ " INNER JOIN ESTADO ON CIDADE.CIDADE_UF_COD = ESTADO.ESTADO_COD"
					+ " INNER JOIN PAIS ON ESTADO.ESTADO_PAIS_COD = PAIS.PAIS_COD";;
			try (PreparedStatement stmt = conex.prepareStatement(sql)) {
				stmt.execute();
				try (ResultSet rs = stmt.getResultSet()) {
					while (rs.next()) {
						int codigo = rs.getInt("EMP_COD");
						String nome = rs.getString("EMP_NOME");
						int codigoEndereco = rs.getInt("END_COD");
						String ruaEndereco = rs.getString("END_RUA");
						int codigoCidade = rs.getInt("CIDADE_COD");
						String nomeCidade = rs.getString("CIDADE_NOME");
						int codigoEstado = rs.getInt("ESTADO_COD");
						String nomeEstado = rs.getString("ESTADO_NOME");
						String ufEstado = rs.getString("ESTADO_UF");
						int codigoPais = rs.getInt("PAIS_COD");
						String nomePais = rs.getString("PAIS_NOME");
						String siglaPais= rs.getString("PAIS_SIGLA");
						String cnpj = rs.getString("EMP_CNPJ_CPF");
						String telefone= rs.getString("EMP_TELEFONE");
						String email = rs.getString("EMP_EMAIL");
						Empresa empresa = new Empresa(codigo, nome, new Endereco (codigoEndereco, ruaEndereco, new Cidade (codigoCidade, nomeCidade, new Estado(codigoEstado, nomeEstado,ufEstado, new Pais(codigoPais, nomePais, siglaPais)))), cnpj, telefone, email);
						lEmpresa.add(empresa);
					}
				}
			}

			return lEmpresa;

		}
	}


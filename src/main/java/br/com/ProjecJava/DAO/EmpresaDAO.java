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

import br.com.ProjecJava.model.Empresa;

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
		
		public boolean alterar(int codigo, String nome) throws SQLException{
			String sql = "UPDATE EMPRESA SET EMP_NOME = ?,  WHERE EMP_CODIGO = ?";
			 
			PreparedStatement statement = conex.prepareStatement(sql);
			statement.setString(1, nome);
			statement.setInt(2, codigo);
			 
			return statement.executeUpdate() > 0;
		}
		
		public boolean excluir(int codigo) throws SQLException{
			String sql = "DELETE EMPRESA WHERE EMP_CODIGO = ?";
			 
			PreparedStatement statement = conex.prepareStatement(sql);
			statement.setInt(1, codigo);
			 
			return statement.executeUpdate() > 0;
		}

		public List<Empresa> lista() throws SQLException {
			List<Empresa> lEmpresa = new ArrayList<>();

			String sql = "select * from EMPRESA";
			try (PreparedStatement stmt = conex.prepareStatement(sql)) {
				stmt.execute();
				try (ResultSet rs = stmt.getResultSet()) {
					while (rs.next()) {
						int codigo = rs.getInt("EMP_CODIGO");
						String nome = rs.getString("EMP_NOME");
						String endereco = rs.getString("EMP_ENDERECO_COD");
						String cnpj = rs.getString("EMP_CNPJ_CPF");
						String telefone= rs.getString("EMP_TELEFONE");
						String email = rs.getString("EMP_EMAIL");
						Empresa empresa = new Empresa(codigo, nome, null, telefone, email);
						lEmpresa.add(empresa);
					}
				}
			}

			return lEmpresa;

		}
	}


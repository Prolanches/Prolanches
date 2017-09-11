package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.ProjecJava.model.Contas_Pagar;
import br.com.ProjecJava.model.Fornecedor;
import br.com.ProjecJava.model.Marca;
import br.com.ProjecJava.model.Suprimento;
import br.com.ProjecJava.model.Tipo_Unidade;

public class Contas_PagarDAO {

	private final Connection conex;
	
	public Contas_PagarDAO(Connection con) {
		this.conex = con;
	}
	
	public boolean inserir(Contas_Pagar contasPagar) throws SQLException {
		String sql = " INSERT INTO CONTAS_PAGAR (CONT_PAG_COD,CONT_PAG_CUSTO,CONT_PAG_SUPRI_COD,CONT_PAG_DATA,CONT_PAG_SUPRI_COD) "
				+ " VALUES(SEQ_CONTAS_PAGAR.NEXTVAL,?,?,?,?)";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setDouble(1, contasPagar.getCusto());
		statement.setInt(2, contasPagar.getSuprimento().getCodigo());
		statement.setDate(3, (java.sql.Date)(contasPagar.getData()));
		statement.setInt(4, contasPagar.getFornecedor().getCodigo() );
		
		return statement.executeUpdate() > 0;
	}
	public List<Contas_Pagar> listarContasPagar() throws SQLException {
		List<Contas_Pagar> lConPagar = new ArrayList<>();
		
		String sql = " SELECT * FROM CONTAS_PAGAR "
				+ " INNER JOIN SUPRIMENTO ON CONTAS_PAGAR.CONT_PAG_SUPRI_COD = SUPRIMENTO.SUPRI_COD "
				+ " INNER JOIN MARCA ON SUPRIMENTO.SUPRI_MARCA_COD = MARCA.MARCA_COD "
				+ " INNER JOIN TIPO_UNIDADE ON SUPRIMENTO.SUPRI_TIPO_UND_COD = TIPO_UNIDADE.TIPO_UND_COD "
				+ " INNER JOIN FORNECEDOR ON CONTAS_PAGAR.CONT_PAG_FORNE_COG = FORNECEDOR.FOR_COD ";
		try(PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					String tipoUnd = rs.getString("TIPO_UND_NOME");
					double tipoPeso = rs.getDouble("TIPO_UND_UNIDADE");
					Tipo_Unidade tipoUni = new Tipo_Unidade(0, tipoUnd, tipoPeso);
					String marcaNome = rs.getString("MARCA_NOME");
					Marca marca = new Marca(0, marcaNome);
					String supriNome = rs.getString("SUPRI_NOME");
					int supriQTD = rs.getInt("SUPRI_QUANTIDADE");
					double supriCusto = rs.getDouble("SUPRI_CUSTO");
					Suprimento supri = new Suprimento(0, supriNome, tipoUni, supriQTD, supriCusto, marca);
					String nomeFor = rs.getString("FOR_NOME");
					String cnpj = rs.getString("FOR_CNPJ");
					String telefone = rs.getString("FOR_TELEFONE");
					String email = rs.getString("FOR_EMAIL");
					Fornecedor fornecedor = new Fornecedor(0, nomeFor, cnpj, null, telefone, email);
					double contPag = rs.getDouble("CONT_PAG_CUSTO");
					Date data = rs.getDate("CONT_PAG_DATA");
					Contas_Pagar contasPag = new Contas_Pagar(0, contPag, supri, data, fornecedor);
					lConPagar.add(contasPag);
				}
			}
		}
		return lConPagar;
		
	}
}

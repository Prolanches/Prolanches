package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.model.Tipo_Unidade;

public class Tipo_UnidadeDAO {

	private final Connection conex;
	
	public Tipo_UnidadeDAO(Connection con) {
		this.conex = con;
	}
	public List<Tipo_Unidade> listarTiposUnidades() throws SQLException {
		List<Tipo_Unidade> lTipoUnidade = new ArrayList<>();
		
		String sql = "SELECT * FROM TIPO_UNIDADE";
		try (PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try(ResultSet rs = stmt.getResultSet()) {
				while(rs.next()) {
					int codigo = rs.getInt("TIPO_UND_COD");
					String nome = rs.getString("TIPO_UND_NOME");
					int tipoU = rs.getInt("TIPO_UND_UNIDADE");
					Tipo_Unidade tipoUni = new Tipo_Unidade(codigo, nome, tipoU);
					lTipoUnidade.add(tipoUni);
				}
			}
		}
		return lTipoUnidade;
	}
}

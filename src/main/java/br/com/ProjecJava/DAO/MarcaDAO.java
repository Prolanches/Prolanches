package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ProjecJava.model.Marca;

public class MarcaDAO {

	private final Connection conex;
	
	public MarcaDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir(Marca marca) throws SQLException {
		String sql = "INSERT INTO MARCA(MARCA_COD,MARCA_NOME)VALUES(SEQ_MARCA.nextval,?)";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setString(1, marca.getNome());
		
		return statement.executeUpdate() > 0;
	}
	public boolean excluir(int codigo) throws SQLException {
		String sql = "DELETE MARCA WHERE MARCA_COD = ?";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, codigo);
		
		return statement.executeUpdate() > 0;
	}
	public List<Marca> listarMarca() throws SQLException {
		List<Marca> lMarca = new ArrayList<>();
		
		String sql = "SELECT * FROM MARCA";
		try(PreparedStatement stmt = conex.prepareStatement(sql)) {
			stmt.execute();
			try(ResultSet rs = stmt.getResultSet()){
				while(rs.next()) {
					int codigo = rs.getInt("MARCA_COD");
					String nome = rs.getString("MARCA_NOME");
					Marca marca = new Marca(codigo, nome);
					lMarca.add(marca);
				}
			}
		}
		return lMarca;
	}
}

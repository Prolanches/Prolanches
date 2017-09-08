package br.com.ProjecJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.ProjecJava.model.Produto_Suprimento;

public class Produto_SuprimentoDAO {

	private final Connection conex;
	
	public Produto_SuprimentoDAO(Connection con) {
		this.conex = con;
	}
	public boolean inserir (Produto_Suprimento produSupri) throws SQLException {
		String sql = " INSERT INTO PRODUTO_SUPRIMENTO(PS_COD,PS_SUPRIMENTO_COD,PS_PRODUTO_COD,PS_QUANTIDADE,PS_CUSTO) VALUES (SEQ_PRODUTO_SUPRIMENTO.NEXTVAL,?,?,?,?)";
		PreparedStatement statement = conex.prepareStatement(sql);
		statement.setInt(1, produSupri.getSuprimento().getCodigo());
		statement.setInt(2, produSupri.getProduto().getCodigo());
		statement.setDouble(3, produSupri.getQuantidade());
		return statement.executeUpdate() >0 ;
	}
}

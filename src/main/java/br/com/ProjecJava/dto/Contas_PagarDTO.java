package br.com.ProjecJava.dto;

import br.com.ProjecJava.model.Contas_Pagar;
import br.com.ProjecJava.utils.DateUtils;

public class Contas_PagarDTO {

	private int codigo;
	private double custo;
	private int forneSupri;
	private String data;
	
	public Contas_PagarDTO() {
	}

	public Contas_PagarDTO(int codigo, double custo, int forSup, String data) {
		this.codigo = codigo;
		this.custo = custo;
		this.forneSupri = forSup;
		this.data = data;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getForneSupri() {
		return forneSupri;
	}

	public void setForneSupri(int forneSupri) {
		this.forneSupri = forneSupri;
	}
	public Contas_Pagar toContas_Pagar() {
		return new Contas_Pagar(this.codigo, this.custo,null, DateUtils.parseData(this.data, DateUtils.PATTERN_DATA_PADRAO));
		
	}
}
package br.com.ProjecJava.dto;

public class Tipo_OperacaoDTO {

	private Integer codigoTipoOP;
	private String nomeTipoOP;
	
	public Tipo_OperacaoDTO() {
	}

	public Tipo_OperacaoDTO(Integer codigoTipoOP, String nomeTipoOP) {
		super();
		this.codigoTipoOP = codigoTipoOP;
		this.nomeTipoOP = nomeTipoOP;
	}

	public Integer getCodigoTipoOP() {
		return codigoTipoOP;
	}

	public void setCodigoTipoOP(Integer codigoTipoOP) {
		this.codigoTipoOP = codigoTipoOP;
	}

	public String getNomeTipoOP() {
		return nomeTipoOP;
	}

	public void setNomeTipoOP(String nomeTipoOP) {
		this.nomeTipoOP = nomeTipoOP;
	}

}

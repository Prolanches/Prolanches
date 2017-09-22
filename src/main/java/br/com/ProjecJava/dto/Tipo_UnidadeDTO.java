package br.com.ProjecJava.dto;

public class Tipo_UnidadeDTO {

		private Integer codigoTipo_Unidade;
		private String nomeTipo_Unidade;
		private double unidadeTipo_Unidade;
		
		public Tipo_UnidadeDTO() {
		}

		public Tipo_UnidadeDTO(Integer codigoTipo_Unidade, String nomeTipo_Unidade, double unidadeTipo_Unidade) {
			super();
			this.codigoTipo_Unidade = codigoTipo_Unidade;
			this.nomeTipo_Unidade = nomeTipo_Unidade;
			this.unidadeTipo_Unidade = unidadeTipo_Unidade;
		}

		public Integer getCodigoTipo_Unidade() {
			return codigoTipo_Unidade;
		}

		public void setCodigoTipo_Unidade(Integer codigoTipo_Unidade) {
			this.codigoTipo_Unidade = codigoTipo_Unidade;
		}

		public String getNomeTipo_Unidade() {
			return nomeTipo_Unidade;
		}

		public void setNomeTipo_Unidade(String nomeTipo_Unidade) {
			this.nomeTipo_Unidade = nomeTipo_Unidade;
		}

		public double getUnidadeTipo_Unidade() {
			return unidadeTipo_Unidade;
		}

		public void setUnidadeTipo_Unidade(double unidadeTipo_Unidade) {
			this.unidadeTipo_Unidade = unidadeTipo_Unidade;
		}
	}

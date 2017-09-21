package br.com.ProjecJava.dto;

public class FuncaoDTO {

		private Integer codigoFuncao;
		private String nomeFuncao;
		
		public FuncaoDTO() {
		}

		public FuncaoDTO(Integer codigoFuncao, String nomeFuncao) {
			super();
			this.codigoFuncao = codigoFuncao;
			this.nomeFuncao = nomeFuncao;
		}

		public Integer getCodigoFuncao() {
			return codigoFuncao;
		}

		public void setCodigoFuncao(Integer codigoFuncao) {
			this.codigoFuncao = codigoFuncao;
		}

		public String getNomeFuncao() {
			return nomeFuncao;
		}

		public void setNomeFuncao(String nomeFuncao) {
			this.nomeFuncao = nomeFuncao;
		}

}

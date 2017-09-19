package br.com.ProjecJava.dto;

public class EstadoDTO {



	private Integer codigoUF;
	private String nomeUF;
	private String siglaUF;
	private Integer codigoPais;
	private String nomePais;
	private String siglaPais;

		public EstadoDTO() {
		}

		public EstadoDTO(Integer codigoUF, String nomeUF, String siglaUF, Integer codigoPais, String nomePais,
				String siglaPais) {
			this.codigoUF = codigoUF;
			this.nomeUF = nomeUF;
			this.siglaUF = siglaUF;
			this.codigoPais = codigoPais;
			this.nomePais = nomePais;
			this.siglaPais = siglaPais;
		}

		public Integer getCodigoUF() {
			return codigoUF;
		}

		public void setCodigoUF(Integer codigoUF) {
			this.codigoUF = codigoUF;
		}

		public String getNomeUF() {
			return nomeUF;
		}

		public void setNomeUF(String nomeUF) {
			this.nomeUF = nomeUF;
		}

		public String getSiglaUF() {
			return siglaUF;
		}

		public void setSiglaUF(String siglaUF) {
			this.siglaUF = siglaUF;
		}

		public Integer getCodigoPais() {
			return codigoPais;
		}

		public void setCodigoPais(Integer codigoPais) {
			this.codigoPais = codigoPais;
		}

		public String getNomePais() {
			return nomePais;
		}

		public void setNomePais(String nomePais) {
			this.nomePais = nomePais;
		}

		public String getSiglaPais() {
			return siglaPais;
		}

		public void setSiglaPais(String siglaPais) {
			this.siglaPais = siglaPais;
		}
	
}
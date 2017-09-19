package br.com.ProjecJava.dto;

public class EstadoDTO {


	private Integer codigo;
	private String nome;
	private String uf;
	private String pais;
	private Integer codigoUF;
	private String nomeUF;
	private String siglaUF;
	private Integer codigoPais;
	private String nomePais;
	private String siglaPais;
		
		public EstadoDTO() {
		}

		public EstadoDTO(Integer codigo, String nome, String uf, String pais, Integer codigoUF, String nomeUF,
				String siglaUF, Integer codigoPais, String nomePais, String siglaPais) {
			super();
			this.codigo = codigo;
			this.nome = nome;
			this.uf = uf;
			this.pais = pais;
			this.codigoUF = codigoUF;
			this.nomeUF = nomeUF;
			this.siglaUF = siglaUF;
			this.codigoPais = codigoPais;
			this.nomePais = nomePais;
			this.siglaPais = siglaPais;
		}

		public Integer getCodigo() {
			return codigo;
		}

		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getUf() {
			return uf;
		}

		public void setUf(String uf) {
			this.uf = uf;
		}

		public String getPais() {
			return pais;
		}

		public void setPais(String pais) {
			this.pais = pais;
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
		

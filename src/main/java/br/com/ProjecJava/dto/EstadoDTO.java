package br.com.ProjecJava.dto;

public class EstadoDTO {


	private Integer codigo;
	private String nome;
	private String uf;
	private String pais;
	private int codigoUF;
	private String nomeUF;
	private String siglaUF;
	private int codigoPais;
	private String nomePais;
	private String siglaPais;
		
		public EstadoDTO() {
		}



	public EstadoDTO(int codigo, String estado, String pais, String sigla) {
		this.codigo = codigo;
		this.nome = estado;
		this.uf = sigla;
		this.pais = pais;
	}

		public EstadoDTO(int codigoUF, String nomeUF, String siglaUF, int codigoPais, String nomePais,
				String siglaPais) {
			super();
			this.codigoUF = codigoUF;
			this.nomeUF = nomeUF;
			this.siglaUF = siglaUF;
			this.codigoPais = codigoPais;
			this.nomePais = nomePais;
			this.siglaPais = siglaPais;
		}

		public int getCodigoUF() {
			return codigoUF;
		}

		public void setCodigoUF(int codigoUF) {
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

		public int getCodigoPais() {
			return codigoPais;
		}

		public void setCodigoPais(int codigoPais) {
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


	public int getCodigo() {
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
}

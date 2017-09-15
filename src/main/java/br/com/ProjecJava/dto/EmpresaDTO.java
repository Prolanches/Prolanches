package br.com.ProjecJava.dto;



public class EmpresaDTO {

		private Integer codigo;
		private String nome;
		private int  codigoEndereco;
		private String rua;
		private int codigoCidade;
		private String nomeCidade;
		private int codigoUF;
		private String nomeUF;
		private String siglaUF;
		private int codigoPais;
		private String nomePais;
		private String siglaPais;
		private String cnpj;
		private String telefone;
		private String email;
		
		public EmpresaDTO() {
		}

		public EmpresaDTO(Integer codigo, String nome, int codigoEndereco, String rua, int codigoCidade, String nomeCidade,
				int codigoUF, String nomeUF, String siglaUF, int codigoPais, String nomePais, String siglaPais,
				String cnpj, String telefone, String email) {
			super();
			this.codigo = codigo;
			this.nome = nome;
			this.codigoEndereco = codigoEndereco;
			this.rua = rua;
			this.codigoCidade = codigoCidade;
			this.nomeCidade = nomeCidade;
			this.codigoUF = codigoUF;
			this.nomeUF = nomeUF;
			this.siglaUF = siglaUF;
			this.codigoPais = codigoPais;
			this.nomePais = nomePais;
			this.siglaPais = siglaPais;
			this.cnpj = cnpj;
			this.telefone = telefone;
			this.email = email;
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

		public int getCodigoEndereco() {
			return codigoEndereco;
		}

		public void setCodigoEndereco(int codigoEndereco) {
			this.codigoEndereco = codigoEndereco;
		}

		public String getRua() {
			return rua;
		}

		public void setRua(String rua) {
			this.rua = rua;
		}

		public int getCodigoCidade() {
			return codigoCidade;
		}

		public void setCodigoCidade(int codigoCidade) {
			this.codigoCidade = codigoCidade;
		}

		public String getNomeCidade() {
			return nomeCidade;
		}

		public void setNomeCidade(String nomeCidade) {
			this.nomeCidade = nomeCidade;
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

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
}


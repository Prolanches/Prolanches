package br.com.ProjecJava.dto;

import br.com.ProjecJava.model.Endereco;

public class EmpresaDTO {

		private int codigo;
		private String nome;
		private String endereco;
		private String cnpj;
		private String telefone;
		private String email;
		
		public EmpresaDTO() {
		}
		
		public EmpresaDTO(int codigo, String nome, String endereco, String cnpj, String telefone, String email) {
			this.codigo = codigo;
			this.nome = nome;
			this.endereco = endereco;
			this.cnpj = cnpj;
			this.telefone = telefone;
			this.email = email;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
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


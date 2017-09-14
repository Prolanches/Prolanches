package br.com.ProjecJava.dto;

public class Tipo_UnidadeDTO {

		private int codigo;
		private String nome;
		private double unidade;
		
		public Tipo_UnidadeDTO() {
		}
		public Tipo_UnidadeDTO(int codigo, String nome, double unidade) {
			this.codigo = codigo;
			this.nome = nome;
			this.unidade = unidade;
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

		public double getUnidade() {
			return unidade;
		}

		public void setUnidade(double unidade) {
			this.unidade = unidade;
		}
		
	}

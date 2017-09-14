package br.com.ProjecJava.dto;

public class PerfilDTO {

		private int codigo;
		private String nivel;
		
		public PerfilDTO() {
		}

		public PerfilDTO(int codigo, String nivel) {

			this.codigo = codigo;
			this.nivel = nivel;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNivel() {
			return nivel;
		}

		public void setNivel(String nivel) {
			this.nivel = nivel;
		}
	}
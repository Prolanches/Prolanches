package br.com.ProjecJava.dto;

public class PerfilDTO {

		private Integer codigoPerfil;
		private String nivelPerfil;
		
		public PerfilDTO() {
		}

		public PerfilDTO(Integer codigoPerfil, String nivelPerfil) {
	
			this.codigoPerfil = codigoPerfil;
			this.nivelPerfil = nivelPerfil;
		}

		public Integer getCodigoPerfil() {
			return codigoPerfil;
		}

		public void setCodigoPerfil(Integer codigoPerfil) {
			this.codigoPerfil = codigoPerfil;
		}

		public String getNivelPerfil() {
			return nivelPerfil;
		}

		public void setNivelPerfil(String nivelPerfil) {
			this.nivelPerfil = nivelPerfil;
		}
}
	
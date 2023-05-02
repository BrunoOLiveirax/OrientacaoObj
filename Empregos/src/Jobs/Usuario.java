package Jobs;

import java.util.Date;

public class Usuario {
		private String nome;
		private Double cpf;
		private String email;
		private String genero;
		private Date dataNascimento;
		private int telefone;
		
		void cadastraEmpresa() {	
		}
		void excluirEmpresa() {	
		}
		void buscarEmpresa() {	
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Double getCpf() {
			return cpf;
		}
		public void setCpf(Double cpf) {
			this.cpf = cpf;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public Date getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
}

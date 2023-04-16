package com.ufape.locadora.DTO;

import java.time.LocalDate;

public class FuncionarioDTO {
	 	private Long id;
	    private String nome;
	    private String cpf;
	    private LocalDate dataNascimento;
	    private String endereco;
	    private String telefone;
	    private String email;
	    
	    public FuncionarioDTO() {
	    }
	    
		public FuncionarioDTO(Long id, String nome, String cpf, LocalDate dataNascimento, String endereco,
				String telefone, String email) {
			super();
			this.id = id;
			this.nome = nome;
			this.cpf = cpf;
			this.dataNascimento = dataNascimento;
			this.endereco = endereco;
			this.telefone = telefone;
			this.email = email;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public LocalDate getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(LocalDate dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
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

 
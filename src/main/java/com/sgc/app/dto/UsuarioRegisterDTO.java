package com.sgc.app.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// DTO Request para registrar usuario
public class UsuarioRegisterDTO {

	@NotBlank
	private String nomeUsuario;

	@NotBlank
	@Email
	private String emailUsuario;

	@NotBlank
	private String senha;

	public UsuarioRegisterDTO() {
	}

	public UsuarioRegisterDTO(String nomeUsuario, String emailUsuario, String senha) {
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senha = senha;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}

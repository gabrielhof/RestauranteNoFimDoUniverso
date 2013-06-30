package br.feevale.rfu.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@SuppressWarnings("serial")
public class Usuario extends Bean {

	private Integer idUsuario;
	private Integer tipo;
	private String nome;
	private String login;
	private String senha;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public Integer getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public void setIdUsuario( Integer idUsuario ) {
		this.idUsuario = idUsuario;
	}

	public void setTipo( Integer tipo ) {
		this.tipo = tipo;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public void setLogin( String login ) {
		this.login = login;
	}

	public void setSenha( String senha ) {
		this.senha = senha;
	}
}

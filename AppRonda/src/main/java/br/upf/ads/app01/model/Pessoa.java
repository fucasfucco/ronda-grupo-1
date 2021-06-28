package br.upf.ads.app01.model;

import java.io.Serializable;
import java.util.Base64;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Pessoa implements Serializable {  // 2) implementar Serializable
	// 1) atributos encapsulados = private 
	@Id
	private Integer id;
	private String nome;
	private String loginApp;
	private String senha;
	
	
	public Pessoa(Integer id, String nome, String loginApp, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.loginApp = loginApp;
		this.senha = senha;
	}

	// 3) Construtor sem argumentos
	public Pessoa() {
		super();
	}
	
	public Pessoa(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public Pessoa(Integer id) {
		super();
		this.id = id;
	}


	// 4) Possuir métodos get e set públicos para atributos
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	// 6) Substituições equals, hashCode e toString	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	public String getLoginApp() {
		return loginApp;
	}

	public void setLoginApp(String loginApp) {
		this.loginApp = loginApp;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}

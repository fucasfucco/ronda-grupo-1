package model;

import java.io.Serializable;

public class Pessoa implements Serializable {  // 2) implementar Serializable
	// 1) atributos encapsulados = private 
	private Integer id;
	private String nome;
	private Integer idade;
	
	// Outros métodos para operações envolvendo pessoa
	public String getDiasVividos() {
		return "Sr(a). "+nome+" você viveu aproximadamente "+(idade*365)+" dias.";
	}
	
	public String getFaixaEtaria() {
		if (idade <= 15)
			return "Jovens - Indivíduos de até 15 anos";
		else if (idade >= 16 && idade <= 64)
		    return "Adultos - Indivíduos com idade entre 16 até 64 anos";
		else
		   return "Idosos - Indivíduos de 65 anos em diante";
	}
	
	// 3) Construtor sem argumentos
	public Pessoa() {
		super();
	}
	
	public Pessoa(Integer id, String nome, Integer idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa(Integer id) {
		super();
		this.id = id;
	}

	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
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
	
}

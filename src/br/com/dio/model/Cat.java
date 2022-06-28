package br.com.dio.model;

import java.util.Objects;

public class Cat {
	private String nome;
	private String cor;
	private String idade;

	public Cat(String nome, String cor, String idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Cat [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

	/*
	 * public Cat (Sting nome, Strig cor, Interger idade) { this.nome = nome;
	 * this.cor = cor; this.idade = idade; }
	 */

}

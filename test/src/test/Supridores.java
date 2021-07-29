package test;

import java.util.function.Supplier;

public class Supridores {
	public static void main (String[] args) {
	Supplier<Pessoa> suppliers = Pessoa::new;
	System.out.println(suppliers.get());

 }
}

class Pessoa {
	private String nome;
	private Integer idade;
	
	public Pessoa() {
		nome = "lucas";
		idade = 21;
	}
	
	@Override
	public String toString() {
		return String.format("nome, %s, idade %d", nome, idade);
	}
}

// Supridores retorna algo gen�rico
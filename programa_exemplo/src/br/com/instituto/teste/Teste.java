package br.com.instituto.teste;

import br.com.instituto.confeitaria.Bolo;

public class Teste {

	public static void main(String[] args) {
		
		//Instanciando Bolo
		Bolo bolo;
		
		//Construindo o objeto bolo
		bolo = new Bolo();
		
		//Manipulando a classe atráves do objeto construido.
		bolo.setNome("João");
		
		//Recuperando dados atráves do método GET
		String nome = bolo.getNome();
		
		System.out.println("O nome do bolo é : " + nome);

	}

}

package br.com.instituto.teste;

import br.com.instituto.confeitaria.Bolo;

public class Teste {

	public static void main(String[] args) {
		
		//Instanciando Bolo
		Bolo bolo;
		
		//Construindo o objeto bolo
		bolo = new Bolo();
		
		//Manipulando a classe através do objeto construido.
		bolo.setNome("ALexandre");
		
		//Recuperando dados através do método GET
		String nome = bolo.getNome();
		
		System.out.println("O nome do bole é : " + nome);
		
	}

}

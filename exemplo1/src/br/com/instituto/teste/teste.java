package br.com.instituto.teste;

import br.porto.instituto.confeitaria.Bolo;

public class teste {

	public static void main(String[] args) {
		// Instanciando Bolo
		Bolo bolo;
		
		//Construindo o objeto Bolo
		bolo = new Bolo();
		
		//Manipulando a classe através do objeto construido 
		bolo.setNome("Jorge");
		
		//Recuperando dados através do método GET
		String nome = bolo.getNome();
		
		System.out.println("O nome do bolo é : " + nome);
	}

}

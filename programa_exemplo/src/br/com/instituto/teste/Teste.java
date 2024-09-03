package br.com.instituto.teste;

import br.com.instituto.confeitaria.Bolo;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciando Bolo
		Bolo bolo;
		
		//Construindo o objeto bolo
		bolo = new Bolo();
		
		//manipulando a classe atraves do objeto contruindo
		bolo.setNome("Ricardo");
		
		//Recuperando dados attravez do metodo GET
		String nome = bolo.getNome();
		
		System.out.println("O nome do bolo é : " + nome);
 
	}

}

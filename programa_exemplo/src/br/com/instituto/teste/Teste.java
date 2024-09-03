package br.com.instituto.teste;

import br.com.instituto.confeitataria.Bolo;

public class Teste {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
        //Instancianda Bolo
		Bolo bolo;
    	//construindo o objeto bolo
		bolo = new Bolo();
		//Manipulando a classe atraves do objeto construido
		bolo.setNome("Alexandre");
		//Recuperando dados atraves do método GET
		String nome = bolo.getNome();
		System.out.println("Onome do bolo é : " + nome);
	}

}

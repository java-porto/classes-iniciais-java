package br.com.instituto.exemplo;

public class ProgramaExemplo {

	public static void main(String[] args) {
		
		String  nome = "Jonathan"; //Tipo, identificador = atribuição;
		
		final String pessoaFisica = "PJ"; //Para constante colocar a palavra 'final' antes da variável
		
		//Inteiros
		
		byte nr1 = 100;
		
		short nr2 = 32767;
		
		int nr3 = 2147483647;
		
		long nr4 = 2^63-1;
		
		float nr5 = 3.40292347e-38F;
		
		System.out.println("Seu nome é " + nome);
		
		System.out.println(pessoaFisica);
		
	}
	
}
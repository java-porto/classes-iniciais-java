package br.com.instituto.exemplo;

public class ProgramaExemplo {

	public static void main(String[] args) {
		
		String nome = "Alexandre";
		String Nome = "Alexandre";
		
		String _nome = "Alexandre";
		
		final String PESSOA_JURIDICA = "PJ";
		
		//Inteiros
		byte  nr1  = 127;
		short nr2 = 32767; 
		int   nr3 = 2147483647;
		long  nr4 = 2^63-1;
		
		float nr5 = 3.40292347e-3F;
		
		char letra = 'a';
		char letraEmHexa = '\u0022';
		
		System.out.println("Letra normal: " + letra);

		System.out.println("Letra em Hexa : " + letraEmHexa);

	}

}

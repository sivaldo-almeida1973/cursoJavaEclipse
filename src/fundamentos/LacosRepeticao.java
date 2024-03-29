package fundamentos;

public class LacosRepeticao {

	public static void main(String[] args) {
		
		
		System.out.println("Estruturas de repetições");
		System.out.println("");
		System.out.println("Exemplos 5 - Uso do 'for' ");
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
			
		}
		

		System.out.println("Estruturas de repetições");
		System.out.println("");
		System.out.println("Exemplos 6 - Tabuada - Uso do 'for' ");
		
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <= 10; valor++) {
				System.out.println(tabuada + " X " + valor + " = " + (tabuada * valor) );
			}		
		}
		

		System.out.println("Estruturas de repetições");
		System.out.println("");
		System.out.println("Exemplos 7 - Uso da estrutura 'while' ");
		
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador ++;//evita o loop infinito
			
		}
		

		System.out.println("Estruturas de repetições");
		System.out.println("");
		System.out.println("Exemplos 7 - Uso da estrutura ' do while' ");
		
		char novoJogo = 'n';
		
		do {
			System.out.println("Deseja jogar novamente(s/n)?");
			novoJogo = 'n';
		} while (novoJogo == 's');
			System.out.println("Game Over!");
			
		
	}

}

package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		//String nome = "sivaldo";
		String nome;
		int idade = 50;
		char sexo = 'M';
		double temp = 27.9;
		boolean arCondic= false;
		nome = "sivaldo";
		
		System.out.println("Uso de variaveis na linguagem java");
		System.out.println("Exemplos");
		
		System.out.println("Nome:" + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: "+ sexo);
		System.out.println("Temperatura: "+ temp);
		System.out.println("ArCondicionado: "+ arCondic);
		System.out.println("-----------------------------------");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores aritiméticos e atribuições");
		System.out.println("Exemplos");
		System.out.println("i = " + i);
		System.out.println("i = "+ i + " + 5 | i =  "+ (i+5));
		System.out.println("i = "+ i + " - 5 | i =  "+ (i-5));
		System.out.println("i = "+ i + " * 5 | i =  "+ (i*5));
		System.out.println("i = "+ i + " / 5 | i =  "+ (i/5));
		System.out.println("i = "+ i + " % 5 | i =  "+ (i%5));
		
		System.out.println("-----------------------------------");
		System.out.println("i += 5        | i = " + (i += 5));
		System.out.println("i -= 5        | i = " + (i -= 5));
		System.out.println("i *= 5        | i = " + (i *= 5));
		System.out.println("i /= 5        | i = " + (i /= 5));
		System.out.println("i %= 5        | i = " + (i %= 5));

		System.out.println("-----------------------------------");
		System.out.println("i ++          | i = " + i);
		System.out.println("i --         | i = " + i);
		
	}

}

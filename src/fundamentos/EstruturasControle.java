package fundamentos;

public class EstruturasControle {

	public static void main(String[] args) {
		// 
		System.out.println("Estruturas de controle condicional");
		System.out.println("");
		System.out.println("Exemplo 1 - Uso do IF");
		
		int idade = 16;
		char sexo = 'M';
		
		
		if(sexo == 'M') {
			System.out.println("Alistamento militar obrigatório");
		}
		
		System.out.println("----------------------------");
		System.out.println("Exemplo 2 - Uso do IF - Else");
		if (idade > 18) {
			System.out.println("Maior da idade ");
		} else {
			System.out.println("Menor idade");
		}
		
		
		System.out.println("----------------------------");
		System.out.println("Exemplo 2 - Uso do IF - Else if - else");
		if (idade < 16) {
			System.out.println("Proibido votar ");
		} else if (idade > 18 && idade <= 70) {
			System.out.println("Voto obrigatorio");
		} else {
			System.out.println("Voto facultativo");
		}
		
		
		System.out.println("----------------------------");
		System.out.println("Exemplo 4 - uso do switch case");
		System.out.println("1. cadastro de clientes");
		System.out.println("2. cadastro de Usuários");
		System.out.println("3. Relatórios");
		
		int opcao = 4;
		switch (opcao) {
		case 1:
			System.out.println("Clientes");
			break;
		case 2:
			System.out.println("Usuários");
			break;
		case 3:
			System.out.println("Relatórios");
			break;
		default:
			System.out.println("Opção inválida");
			break;
			
		}
		
		
		
		
		
	
	
		
	}

}

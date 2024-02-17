package construtor;

import java.util.Random;

public class Carro {
	//atributos
	int ano;
	String cor;
	
	//construtor
	public Carro() {
		//gerar num aleatorio do chassi
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: "+ chassi);
		
	}
	//construtor com definicao de atributos
	public Carro(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
		
	}
	
	//metodos
	void ligar() {
		System.out.println("Engine ON.........");
		
	}
	
	void desligar() {
		System.out.println("Engine OFF.........");
		
	}
	
	
	void acelerar() {
		System.out.println("vrummmmmmmmmmm...");
		
	}
	
	
	

}

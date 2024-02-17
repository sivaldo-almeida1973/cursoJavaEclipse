package construtor;

public class Aviao extends Carro{
	double envergadura;
	
	//metodo 
	void aterrizar() {
		System.out.println("---------------_______________");
	}
	
	//sobescrever o metodo acelerar da classe Carro(polimorfismo)
	void acelerar() {
		System.out.println("___________---------------------");
	}
	
	

}

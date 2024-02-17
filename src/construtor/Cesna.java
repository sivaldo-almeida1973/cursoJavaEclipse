package construtor;

public class Cesna {

	public static void main(String[] args) {
		Aviao cesna = new Aviao();
		cesna.ano = 2024;
		cesna.cor = "Prata";
		cesna.envergadura = 11;
		System.out.println("Aviao: Cesna");
		System.out.println("Ano: "+ cesna.ano);
		System.out.println("Cor: "+ cesna.cor);
		System.out.println("Envergadura: "+ cesna.envergadura + "m");
		cesna.ligar();
		cesna.acelerar();
		cesna.aterrizar();
		cesna.desligar();

	}

}

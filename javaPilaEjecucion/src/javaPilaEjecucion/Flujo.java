package javaPilaEjecucion;

public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("fin main");
	}
	
	public static void metodo1() {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("fin metodo1");
	}
	
	public static void metodo2() {
		System.out.println("Inicio metodo2");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("fin metodo2");
	}
}
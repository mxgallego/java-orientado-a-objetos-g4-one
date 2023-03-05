package javaPilaEjecucion;

public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("fin main");
	}
	
	public static void metodo1() throws Miexception {
		System.out.println("Inicio metodo1");
		try {
			metodo2();
		} catch (Miexception me) {
			me.printStackTrace();
		}
		System.out.println("fin metodo1");
	}
	
	public static void metodo2() throws Miexception {
		System.out.println("Inicio metodo2");
		//throw new ArithmeticException();		
		throw new Miexception("Mi exception fue lanzada ");
		
	}
}

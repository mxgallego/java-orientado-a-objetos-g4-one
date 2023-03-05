package javaPilaEjecucion;

public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		try {
			metodo1();
		} catch (Miexception | ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fin main");
	}
	
	public static void metodo1() throws Miexception {
		System.out.println("Inicio metodo1");
		try {
			metodo2();
			System.out.println("bien");
		} catch (Miexception | ArithmeticException | NullPointerException me) {
			me.printStackTrace();
		}
		System.out.println("fin metodo1");
	}
	
	public static void metodo2() throws Miexception {
		System.out.println("Inicio metodo2");
		//throw new ArithmeticException();		
		int a = 50/0;
		Cuenta c = null;
		c.deposita();
		throw new Miexception("Mi exception fue lanzada ");
		
	}
}

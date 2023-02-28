package proyectobytebank;

public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(); 
		primeraCuenta.setSaldo(200);
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.setSaldo(200);
		
		System.out.println("Saldo primera cuenta: "+primeraCuenta.getSaldo());
		System.out.println("Saldo segunda cuenta: "+segundaCuenta.getSaldo());
		
		segundaCuenta.setSaldo(400);;
		System.out.println("Saldo primera cuenta: "+primeraCuenta.getSaldo());

		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta==segundaCuenta) {
			System.out.println("son el mismo objeto");
		} else {
			System.out.println("Son diferentes");
		}
	}
}

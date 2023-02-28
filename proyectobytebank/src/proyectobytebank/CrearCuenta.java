package proyectobytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		
		 Cuenta primeraCuenta = new Cuenta();
		 primeraCuenta.setSaldo(1000); 
		 
		 System.out.println(primeraCuenta.getSaldo());
		 
		 Cuenta segundaCuenta = new Cuenta();
		 segundaCuenta.setSaldo(500);
		 System.out.println(segundaCuenta.getSaldo());
		 System.out.println(segundaCuenta.getAgencia());
	}
}

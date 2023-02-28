package proyectobytebank;

public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.docuemnto = "45444332";
		diego.telefono = "999992222";
		
		
		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.agencia = 1;
		cuentaDiego.titular = diego;
		
		System.out.println(cuentaDiego.titular.docuemnto);
		System.out.println(cuentaDiego.titular);
		System.out.println(diego);
		
	}
}

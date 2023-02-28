package proyectobytebank;

public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNombre("Diego");
		diego.setDocuemnto("3ff");
		diego.setTelefono("2355");
		
		
		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.setAgencia(1);
		cuentaDiego.setTitular(diego);
		
		
		System.out.println(cuentaDiego.getTitular());
		System.out.println(diego);
		
	}
}

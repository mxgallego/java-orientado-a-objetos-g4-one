package proyectobytebank;

public class PruebaEncapsulamienTO {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Diego");
		cliente.setDocuemnto("ggggg");
		
		
		cuenta.setTitular(cliente);
		
		Cliente tiitular = cuenta.getTitular();
		
		System.out.println(cliente);
		System.out.println(cliente.getNombre());
		System.out.println(tiitular);
	}
}

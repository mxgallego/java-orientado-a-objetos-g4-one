package proyectobytebank;

public class PruebasMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.setSaldo(300);
		miCuenta.depositar(200);
		System.out.println(miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaJimena = new Cuenta();
		cuentaJimena.depositar(1000);
		boolean puedotran = cuentaJimena.transferir(400, miCuenta);
		
		
		if (puedotran) {
			System.out.println("transferencia exitosa");
		}
		
		System.out.println(cuentaJimena.getSaldo());
		System.out.println(miCuenta.getSaldo());
		
		
	}
}

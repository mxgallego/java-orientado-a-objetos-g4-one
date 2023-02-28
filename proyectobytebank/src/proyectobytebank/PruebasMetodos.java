package proyectobytebank;

public class PruebasMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 300;
		miCuenta.depositar(200);
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);
		
		Cuenta cuentaJimena = new Cuenta();
		cuentaJimena.depositar(1000);
		boolean puedotran = cuentaJimena.transferir(400, miCuenta);
		
		
		if (puedotran) {
			System.out.println("transferencia exitosa");
		}
		
		System.out.println(cuentaJimena.saldo);
		System.out.println(miCuenta.saldo);
		
		
	}
}

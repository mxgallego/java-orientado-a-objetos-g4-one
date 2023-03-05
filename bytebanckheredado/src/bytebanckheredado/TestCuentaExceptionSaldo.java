package bytebanckheredado;

public class TestCuentaExceptionSaldo {
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123, 456);
		cuenta.depositar(600);
		try {
			cuenta.saca(200);
		} catch (saldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

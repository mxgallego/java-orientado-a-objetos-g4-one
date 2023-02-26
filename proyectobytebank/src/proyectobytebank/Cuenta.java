package proyectobytebank;

public class Cuenta {
	
	public double saldo;
	public int agencia;
	public int numero;
	public  String titular;
	
	public void depositar(double valor){
		saldo = saldo + valor;
	}
	
}

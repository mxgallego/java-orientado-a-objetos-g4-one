package proyectobytebank;

public class Cuenta {
	
	public double saldo;
	public int agencia;
	public int numero;
	public  String titular;
	
	public void depositar(double valor){
		//esta cuenta 
		
		this.saldo = this.saldo + valor;
	}
	
	public boolean retirar(double valor) {
		
		if (this.saldo>=0) {
			this.saldo = this.saldo - valor;
			return true;
		}else {
			return false;
		}		
		
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo  - valor;
			cuenta.depositar(valor);
			return true;
		} 
		return false;
		
	}
	
}

package proyectobytebank;

public class Cuenta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private  Cliente titular = new Cliente();
	
	
	public void depositar(double valor){
		//esta cuenta 
		
		this.saldo = this.saldo + valor;
	}
	
	public boolean retirar(double valor) {
		
		if (this.saldo>=valor) {
			this.saldo -= valor;
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
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int nuevaAgencia) {
		if (agencia>0) {
			this.agencia = nuevaAgencia;
		}
		System.out.println("no esta permitido valores negativos");
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}

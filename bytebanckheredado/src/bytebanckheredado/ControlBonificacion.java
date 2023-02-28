package bytebanckheredado;

public class ControlBonificacion {
	private double suma;
	
	public ControlBonificacion(){
		
	}
	
	public double registraraSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo suma: "+this.suma);
		return this.suma;
	}
	
	public double registraraSalario(Gerente gerente) {
		this.suma = gerente.getBonificacion() + this.suma;
		System.out.println("Calculo suma: "+this.suma);
		return this.suma;
	}
	
	public double registraraSalario(Contador contador) {
		this.suma = contador.getBonificacion() + this.suma;
		System.out.println("Calculo suma: "+this.suma);
		return this.suma;
	}
}

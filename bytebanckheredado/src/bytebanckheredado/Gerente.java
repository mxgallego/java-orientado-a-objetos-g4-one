package bytebanckheredado;

public class Gerente extends Funcionario {
	
	
	public String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnLine";
	}

	public String getClave() {
		return clave;
	}

	public double getBonficacion() {
		return super.getSalario() + super.getBonificacion();
	}
	
}

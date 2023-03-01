package bytebanckheredado;

public class Administrador extends Funcionario implements Autenticable {

	private AutentecionUtil util;
	
	public Administrador() {
		this.util = new AutentecionUtil();
	}
	
	public double getBonificacion() {
		
		return this.getSalario();
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
		
	}

}

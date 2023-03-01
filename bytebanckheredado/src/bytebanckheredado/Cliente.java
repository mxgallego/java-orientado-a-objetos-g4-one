package bytebanckheredado;

public class Cliente implements Autenticable {
	private String nombre;
	private String docuemnto;
	private String telefono;
	private String clave; 
	
	private AutentecionUtil util; 
	
	public Cliente() {
		this.util = new AutentecionUtil();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocuemnto() {
		return docuemnto;
	}
	public void setDocuemnto(String docuemnto) {
		this.docuemnto = docuemnto;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public void setClave(String clave) {
		this.setClave(clave);
		
	}
	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
	
	
}

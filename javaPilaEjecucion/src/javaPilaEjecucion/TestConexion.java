package javaPilaEjecucion;

public class TestConexion {
	public static void main(String[] args) throws Exception {
		
		try(Conexion con = new Conexion()){
			con.leerdatos();
		} catch (IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		/*
		Conexion con = new Conexion();
		try {
			con.leerdatos();
			con.cerrar();
		} catch (IllegalStateException ex) {
			System.out.println("Recibiendo exception");
			ex.printStackTrace();
			con.cerrar();
		}finally {
			System.out.println("Cerrando conexion");
			if (con !=null) {
				con.cerrar();
			}
			
		}*/
		
	}
	
}

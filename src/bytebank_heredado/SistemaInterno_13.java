package bytebank_heredado;

public class SistemaInterno_13 {
	
	private String clave = "123";
	
	public boolean autenticar(Autenticable_14 gerente) {
		boolean puedeInciarSesion = gerente.iniciarSesion(clave);
		if(puedeInciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error en Login");
			return false;
		}
	}
}

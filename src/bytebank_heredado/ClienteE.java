package bytebank_heredado;
public class ClienteE implements Autenticable_14 {
	private String nombre;
	private String documento;
	private String telefono;
	
	private AutenticacionUtil_15 util;
	
	public ClienteE() {
		this.util = new AutenticacionUtil_15();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
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

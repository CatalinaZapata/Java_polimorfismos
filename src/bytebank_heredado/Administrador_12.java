package bytebank_heredado;

public class Administrador_12 extends Funcionario_1 implements Autenticable_14 {
	
	private AutenticacionUtil_15 util;
	
	public Administrador_12() {
		this.util = new AutenticacionUtil_15();
	}
	
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

}

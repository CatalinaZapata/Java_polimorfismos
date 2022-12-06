package bytebank_heredado;

public class Gerente_4 extends Funcionario_1 {
	public String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "123";
	}
	
	//Sobre-escritura de método
	public double getBonificacion() {
		return super.getSalario() + super.getBonificacion();
	}
	
	
	
	
	
	
	
}

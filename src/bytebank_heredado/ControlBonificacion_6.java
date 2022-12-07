package bytebank_heredado;

public class ControlBonificacion_6 {
	private double suma;
	public double registrarSalario(Funcionario_1 funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("calculo actual: " + this.suma);
		return this.suma;
	}
	
	
	
	
	
	
}

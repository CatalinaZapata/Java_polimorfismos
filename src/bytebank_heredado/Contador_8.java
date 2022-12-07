package bytebank_heredado;

public class Contador_8 extends Funcionario_1 {
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde contador");
		return 200;
	}
}

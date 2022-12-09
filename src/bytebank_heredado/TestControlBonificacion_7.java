package bytebank_heredado;

public class TestControlBonificacion_7 {
	public static void main(String[] args) {
		Funcionario_1 diego = new Contador_8();
		diego.setSalario(2000);
		
		Gerente_4 jimena = new Gerente_4();
		jimena.setSalario(10000);
		
		Contador_8 alexis = new Contador_8();
		alexis.setSalario(5000);
		
		ControlBonificacion_6 controlBonificacion = new ControlBonificacion_6();
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexis);
	}
}

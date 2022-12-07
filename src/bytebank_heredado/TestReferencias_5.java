package bytebank_heredado;

public class TestReferencias_5 {
	public static void main(String[] args) {
		Funcionario_1 funcionario = new Gerente_4();
		funcionario.setNombre("Diego");
		
		Gerente_4 gerente = new Gerente_4();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		funcionario.setSalario(10000);
	}
}

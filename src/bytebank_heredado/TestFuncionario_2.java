package bytebank_heredado;

public class TestFuncionario_2 {
	public static void main(String[] args) {
		Funcionario_1 diego = new Funcionario_1();
		diego.setNombre("Diego");
		diego.setDocumento("101");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}

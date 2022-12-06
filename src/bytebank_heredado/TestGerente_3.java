package bytebank_heredado;

public class TestGerente_3 {
	public static void main(String[] args) {
		Gerente_4 gerente = new Gerente_4();
		gerente.setSalario(6000);
		gerente.setClave("123");
		gerente.setTipo(1);
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("123"));
	}
}

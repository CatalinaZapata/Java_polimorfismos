package bytebank_heredado;

public class TestSistemaInterno_15 {
	public static void main(String[] args) {
		SistemaInterno_13 sistema = new SistemaInterno_13();
		Gerente_4 gerente = new Gerente_4();
		Administrador_12 administrador = new Administrador_12();
		
		sistema.autenticar(gerente);
		sistema.autenticar(administrador);
	}
}

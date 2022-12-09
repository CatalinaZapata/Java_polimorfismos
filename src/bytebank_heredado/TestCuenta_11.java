package bytebank_heredado;

public class TestCuenta_11 {
	public static void main(String[] args) {
		CuentaCorriente_9 cc = new CuentaCorriente_9(1, 1);
		CuentaAhorro_10 ca = new CuentaAhorro_10(2, 3);
		cc.depositar(2000);
		cc.transferir(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
	
	
	
	
	
	
}

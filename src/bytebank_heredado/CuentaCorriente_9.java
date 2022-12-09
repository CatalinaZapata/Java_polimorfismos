package bytebank_heredado;

public class CuentaCorriente_9 extends CuentaA {
	
	public CuentaCorriente_9(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double comision = 0.2;
		return super.saca(valor + comision);
	}
	
}

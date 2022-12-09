package bytebank_heredado;

public class CuentaAhorro_10 extends CuentaA {
	public CuentaAhorro_10(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		
	}

}

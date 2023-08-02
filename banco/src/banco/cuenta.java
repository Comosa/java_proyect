package banco;

public class cuenta {
		double saldo;
		int agencia , numero;
		String titular;		//depositar
		public void depositar(double valor) {
			this.saldo=this.saldo+valor;
		}
		//retirar
		public boolean retirar(double valor) {
			if ( this.saldo>=valor) {
				this.saldo=this.saldo-valor;
				return true;
				}else {
					return false;
				}
		}
		//transferir
		
		public boolean transeferir(double valor, cuenta cuenta) {
			if (this.saldo>=valor) {
				this.saldo=this.saldo-valor;
				cuenta.depositar(valor);
				return true;
			}else {
				return false;
			}
		}
		
}

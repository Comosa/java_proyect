package banco;

public class metodos {
	public static void main(String[] args) {
		//
		cuenta miCuenta= new cuenta();
		miCuenta.saldo=300;
		//depositar;
		miCuenta.depositar(200);
		System.out.println(miCuenta.saldo);
		//retirar
		miCuenta.retirar(600);
		System.out.println(miCuenta.saldo);
		//transerir
		cuenta cuentaAntonio= new cuenta();
		cuentaAntonio.depositar(1000);
		cuentaAntonio.transeferir(300, miCuenta);
		
	}
}

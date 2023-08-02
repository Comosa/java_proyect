package banco;

public class crearCuenta {
	public static void main(String[] args) {
		cuenta primeraCuenta = new cuenta();
		primeraCuenta.saldo=3000;
		System.out.println("primera cuenta "+primeraCuenta.saldo);
		
		cuenta segundaCuenta = new cuenta();
		segundaCuenta.saldo=20000;
		System.out.println("segunda cuenta "+segundaCuenta.saldo);
	}
}

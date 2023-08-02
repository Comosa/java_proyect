package primer_programa;
import java.util.Scanner;
public class Hola_Mundo {
	public static void main(String args[]) {
		
		Scanner entrada= new Scanner(System.in);
		int i;
		System.out.printf("Dame un numero: ");
		i=entrada.nextInt();
		System.out.printf("El numero es:  "+""+i);
	}
}

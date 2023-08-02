package calcuadora;
import javax.swing.JOptionPane;
public class mostrarResultado {
	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("dime un numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("dime un numero"));
		calculadora op= new calculadora();
		/*System.out.println("la suma es "+ op.Sumar(n1, n2));
		System.out.println("la rsta es " + op.reata(n1, n2));
		System.out.println("la multiplicacion es " + op.multiplicacion(n1, n2));*/
		System.out.println("la divicion es "+ op.divicion(n1, n2));
	}
}

package fizzbuzz;

import javax.swing.JOptionPane;

public class proyect {

public static void main(String[] args) {
	int rando=Integer.parseInt(JOptionPane.showInputDialog("dime un numero"));
	
	for (int i=1; i<=rando; i++) {
		  if(i%3==0 && i%5==0){
			System.out.println("fizbuz");
		}else if (i%3==0) {
			System.out.println("fizz");
		}else if (i%5==0){
			System.out.println("buzz");
		}else {
			System.out.println(i);
		}
		
	}
}
	
	
	
	
}

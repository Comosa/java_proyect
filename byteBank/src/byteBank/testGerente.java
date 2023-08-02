package byteBank;

public class testGerente {
public static void main(String[] args) {
	Gerente luis= new Gerente();
	luis.setNombre("luis");
	luis.setDocumento("98765");
	luis.setSalario(3200);
	
	System.out.println(luis.getSalario());
	System.out.println(luis.getBonificacion());
}
}

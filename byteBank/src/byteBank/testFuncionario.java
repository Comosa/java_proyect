package byteBank;

public class testFuncionario {
public static void main(String[] args) {
	funcionario toño = new funcionario();
	
	toño.setDocumento("toño");
	toño.setDocumento("12345");
	toño.setSalario(1000);
System.out.println(toño.getSalario());
System.out.println(toño.getBonificacion());
}
}

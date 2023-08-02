package triangulo;

public class testTriangulo {
public static void main(String[] args) {
	Triangulo triangulo = new Triangulo();
	
	triangulo.setAltura(20);
	triangulo.setBase(10);
	triangulo.setNombre("triangulo");
	
	System.out.println("la altura es "+ triangulo.getAltura());
	System.out.println("la base es "+triangulo.getBase());
	System.out.println("el nombre es "+triangulo.getNombre());
	System.out.println("El area del triangulo es "+ triangulo.Area());
	System.out.println("El perimetro es "+triangulo.Perimetro());
}
}

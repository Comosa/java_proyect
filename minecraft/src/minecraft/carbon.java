package minecraft;

public class carbon extends Cubo{
	private String color;

	public carbon(String nombre, String tipo, int altura, String color) {
		super(nombre, tipo, altura);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void mostrar() {
		System.out.println("El nombre es "+getNombre());
		System.out.println("Es de tipo de "+getTipo());
		System.out.println("Tiene una ltura de "+getAltura());
		System.out.println("Tiene un color de "+getColor());
	}
	
	
}

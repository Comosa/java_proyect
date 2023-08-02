package minecraft;

public class Cubo {
	private String nombre;
	private String tipo;
	private int altura;
	
	
	public Cubo(String nombre, String tipo, int altura) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.altura = altura;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	
	
	
	
	
	
}

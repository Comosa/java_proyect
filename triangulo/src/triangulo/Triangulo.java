package triangulo;
//atributos

public class Triangulo {
	
private int altura;
private int base;
private String nombre;

//metodos

public int getAltura() {
	return altura;
}
public void setAltura(int altura) {
	this.altura = altura;
}
public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}


//parametros

public double Area(){
	return this.base*this.altura/2;
}


public double Perimetro() {
	return this.base*3;
}





}












package Veiculo;

public class Veiculo {
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	
	public Veiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}


	public String getMatricula() {
		return matricula;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * 
	 * @author antonio
	 * 
	 * @
	 */
	
	public String mostrar() {
		return "matricula "+matricula+"\n marca"+marca+"\n modelo"+modelo; 
	}
	
	
	
}

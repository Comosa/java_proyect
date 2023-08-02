package Veiculo;

public class veiculoDeportivo extends Veiculo{
protected int cilindros;

public veiculoDeportivo(String matricula, String marca, String modelo, int cilindros) {
	super(matricula, marca, modelo);
	this.cilindros = cilindros;
}

public int getCilindros() {
	return cilindros;
}

/*public void setCilindros(int cilindros) {
	this.cilindros = cilindros;
}*/
@Override
public String mostrar() {
	return "matricula "+matricula+"\n marca"+marca+"\n modelo"+modelo+"\n cilcindros"+cilindros; 
}


}

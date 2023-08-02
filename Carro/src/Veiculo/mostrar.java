package Veiculo;

public class mostrar {
public static void main(String[] args) {
	Veiculo carro[] = new Veiculo[2];
	
	carro[0]=new Veiculo("2YHEU3", "BMW", "m3 gtr");
	carro[1]=new veiculoDeportivo("y3U34R","MAZDA","miata",6);
	
	for (Veiculo veiculos: carro) {
		System.out.println(veiculos.mostrar());
		System.out.println("");
	}
}
}

package fag.objetos;

public class Sala {

	private int bloco;
	private int numero;
	private boolean ocupada;
	
	public Sala(int bloco, int numero, boolean ocupada) {
		this.bloco = bloco;
		this.numero = numero;
		this.ocupada = ocupada;
	}

	public Sala() {
		ocupada = false;
	}

	public int getBloco() {
		return bloco;
	}

	public void setBloco(int bloco) {
		this.bloco = bloco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public void mostrarDados(int i) {
		System.out.printf("%d) %d - bloco %d - %b \n", i, numero, bloco,ocupada);
	}
	
	
	
	
	
	
	
	
	
	
	
}

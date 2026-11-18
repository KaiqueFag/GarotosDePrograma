package Objetos;

public class Perifericos {
private int id;
private String tipo;
private String marca;
private boolean esgotado;


public Perifericos() {
	esgotado = false;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getTipo() {
	return tipo;
}


public void setTipo(String tipo) {
	this.tipo = tipo;
}


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


public boolean isEsgotado() {
	return esgotado;
}


public void setEsgotado(boolean esgotado) {
	this.esgotado = esgotado;
}


public void mostrarDados(int i) {
	System.out.printf("ID: %d\n", this.id+1);
	System.out.printf("Tipo: %d\n", this.tipo);
	System.out.printf("Marca: %s\n", this.marca);
	System.out.printf("Esgotado?: %b\n", this.esgotado);
	
	
	
}





}
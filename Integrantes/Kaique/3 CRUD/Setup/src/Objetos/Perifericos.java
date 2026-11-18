package Objetos;

public class Perifericos {
private int id;
private String tipo;
private String marca;
private int quantidade;

public int getQuantidade() {
	return quantidade;
}


public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
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


public void mostrarDados(int i) {
	System.out.printf("ID: %d\n", this.id);
	System.out.printf("Tipo: %s\n", this.tipo);
	System.out.printf("Marca: %s\n", this.marca);
	if (this.quantidade<=0) {
		System.out.printf("Quantidade: *Esgotado*\n\n\n");
		return;
		
	}
	System.out.printf("Quantidade: %d\n\n\n", this.quantidade);
	
	
}





}
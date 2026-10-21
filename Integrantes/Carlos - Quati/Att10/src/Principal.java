import java.util.Scanner;

import objetos.Aluno;
import objetos.Carro;
import objetos.Pessoa;
import objetos.Produto;
import objetos.ContaBancaria;

public class Principal {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
			attCinco();
	}
	
	public static void attUm() {
		Pessoa pessoa = new Pessoa();
		System.out.println("Digite seu nome:");
		pessoa.setNome (scan.nextLine());
		System.out.println("Insira sua idade:");
		pessoa.setIdade (scan.nextInt());
		
		pessoa.apresentar();
	}
	
	public static void attDois() {
		
		Carro carro = new Carro();
		
		System.out.println("Informe a Marca do carro:");
		carro.setMarca (scan.nextLine());
		System.out.println("Informe o Modelo do carro:");
		carro.setModelo (scan.nextLine());
		System.out.println("Informe o Ano do carro:");
		carro.setAno (scan.nextInt());

		carro.exibirDados();
		}
	
	public static void attTres() {
		Aluno aluno = new Aluno();
		
		System.out.println("Insira seu nome: ");
		aluno.setNome (scan.nextLine());
		System.out.println("Insira sua idade: ");
		aluno.setIdade (scan.nextInt());
		System.out.println("Insira sua Nota: ");
		aluno.setNota (scan.nextDouble());
		
	aluno.verificarSituacao();	
	}
	
	
	public static void attQuatro() {
		Produto produto = new Produto();
		System.out.println("Insira o nome do produto: ");
		produto.setNome(scan.nextLine());
		System.out.println("Informe o preço produto: ");
		produto.setPreco(scan.nextDouble());
		System.out.println("Insira a quantidade: ");
		produto.setQuantidade(scan.nextInt());
		
	produto.calcularTotal();		
	}

	public static void attCinco(){
		ContaBancaria user = new ContaBancaria();
		System.out.println("Insira o nome do titular: ");
		user.setTitular(scan.nextLine());
		int opcao;
		do {
		System.out.println("");
		System.out.println("Selecione a opção que deseja acessar");
		System.out.println("------------------------------------");
		System.out.println("1- Depositar");
		System.out.println("2- Sacar");
		System.out.println("3- Exibir saldo");
		System.out.println("4- Sair");
		System.out.println("------------------------------------");
		System.out.println("");
		opcao = scan.nextInt();
		scan.nextLine();
		if (opcao==1) {
			System.out.println("Insira o valor (com virgula) que deseja depositar: ");
			double valor = scan.nextDouble();
			scan.nextLine();
			user.depositar(valor);
		} else if (opcao==2){
			System.out.println("Insira o valor (com virgula) que deseja Sacar: ");
			double valor = scan.nextDouble();
			user.sacar(valor);
		} else if (opcao==3){
			user.exibirSaldo();
		} else if (opcao==4){
			System.out.println("Encerrando sistema! Ate logo ");
		} else {
			System.out.println("Opção invalida! Tente novamente");
		}
		
		} while (opcao!=4);
	}
}
	
	


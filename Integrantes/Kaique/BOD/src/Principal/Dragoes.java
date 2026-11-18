package Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Objetos.Objetos;

public class Dragoes {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Objetos> classes = new ArrayList<>();
	static ArrayList<Objetos> afiada = new ArrayList<>();
	static ArrayList<Objetos> brasa = new ArrayList<>();
	static ArrayList<Objetos> marinha = new ArrayList<>();
	static ArrayList<Objetos> misterio = new ArrayList<>();
	static ArrayList<Objetos> rastreadora = new ArrayList<>();
	static ArrayList<Objetos> relampago = new ArrayList<>();
	static ArrayList<Objetos> rocha = new ArrayList<>();
	
	public static void main(String[] args) {
		menuPrincipal();
	}

	private static void menuPrincipal() {
		int op = 0;
		do {
		System.out.println("===========BOOK OF DRAGONS===========");
		System.out.println("-----------Seja bem vindo------------\n");
		System.out.println("1) Registrar novo dragão ");
		System.out.println("2) Atualizar o Guia");
		System.out.println("3) Listar os dragões");
		System.out.println("4) Apagar Registro");
		System.out.println("0) Sair\n\n");
		System.out.println("Escolha uma das opções:\n");
		op = scan.nextInt();
		scan.nextLine();
		opMenu(op);
		}while(op!=0);
		
		System.out.println("Obrigado por ajudar BERK, ate mais!");
		return;
		
	}

	private static void opMenu(int op) {
		if(op==1) {
			registrar();
			return;
		} 
		if(op==2) {
			atualizar();
			return;
		}
		if(op==3) {
			listar();
			return;
		}
		if(op==4) {
			apagar();
			return;
		}
		
	}

	private static void apagar() {
		// TODO Auto-generated method stub
		
	}

	private static void listar() {
		// TODO Auto-generated method stub
		
	}

	private static void atualizar() {
		// TODO Auto-generated method stub
		
	}

	private static void registrar() {
		Objetos drag = new Objetos();
		int op = 0;
		System.out.println("Identifique a Classe por favor:\n");
		System.out.println("1- Afiada");
		System.out.println("2- Brasa");
		System.out.println("3- Marinha");
		System.out.println("4- Mistério");
		System.out.println("5- Rastreadora");
		System.out.println("6- Relâmpago");
		System.out.println("7- Rocha");
		op = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Insira o nome do dração:");
		drag.setRaca(scan.nextLine());
		System.out.println("Insira o tamanho dragão:");
		drag.setTamanho(scan.nextLine());
		System.out.println("Insira uma observação sobre o dragão:");
		drag.setObs(scan.nextLine());
		
		if(op==1) {
			afiada.add(drag);
			return;
		} 
		if(op==2) {
			brasa.add(drag);
			return;
		}
		if(op==3) {
			marinha.add(drag);
			return;
		}
		if(op==4) {
			misterio.add(drag);
			return;
		}
		if(op==5) {
			rastreadora.add(drag);
			return;
		}
		if(op==6) {
			relampago.add(drag);
			return;
		}
		if(op==7) {
			rocha.add(drag);
			return;
		}
			
	}
}


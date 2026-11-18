package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fag.objetos.Sala;

public class Principal {

	static Scanner scan = new Scanner(System.in);
	static List<Sala> salas = new ArrayList<Sala>();

	public static void main(String[] args) {
		mostrarMenu();
	}

	private static void mostrarMenu() {
		int escolha = 0;
		do {
			System.out.println("====================MENU====================");
			System.out.println("1) Cadastrar sala");
			System.out.println("2) Listar salas");
			System.out.println("3) Editar sala");
			System.out.println("4) Excluir sala");
			System.out.println("0) Sair");
			escolha = scan.nextInt();
			scan.nextLine();
			validarEscolha(escolha);
		} while (escolha != 0);
		System.out.println("Obrigado por utilizar o sistema!");
	}

	private static void validarEscolha(int escolha) {
		if(escolha == 1) {
			cadastrarSala();
			return;
		}
		if(escolha == 2) {
			listarSalas();
			return;
		}
		if(escolha == 3) {
			editarSala();
			return;
		}
		if(escolha == 4) {
			excluirSala();
			return;
		}
		if(escolha == 0) {
			return;
		}
		System.out.println("Informe uma opção válida");
	}

	private static void excluirSala() {
		listarSalas();
		System.out.println("Selecione uma sala para editar: ");
		int escolha = scan.nextInt() - 1;
		if(escolha > salas.size() || escolha < 0) {
			System.out.println("Informe uma sala válida!");
			return;
		}
		salas.remove(escolha);
		System.out.println("Sala excluida com sucesso!");
	}

	private static void editarSala() {
		listarSalas();
		System.out.println("Selecione uma sala para editar: ");
		int escolha = scan.nextInt() - 1;
		if(escolha < 0 || escolha > salas.size()) {
			System.out.println("Escolha uma sala existente!");
			return;
		}
		Sala sala = salas.get(escolha);
		System.out.println("Informe o numero da sala: ");
		sala.setNumero(scan.nextInt());
		scan.nextLine();
		System.out.println("Informe o bloco da sala: ");
		sala.setBloco(scan.nextInt());
		scan.nextLine();
		System.out.println("Sala alterada com sucesso!");
		
	}

	private static void listarSalas() {
		System.out.println("====================Lista Salas====================");
		for (int i = 0; i < salas.size(); i++) {
			salas.get(i).mostrarDados(i+1);
		}
		
	}

	private static void cadastrarSala() {
		Sala sala = new Sala();
		System.out.println("Informe o numero da sala: ");
		sala.setNumero(scan.nextInt());
		scan.nextLine();
		System.out.println("Informe o bloco da sala: ");
		sala.setBloco(scan.nextInt());
		scan.nextLine();
		salas.add(sala);
		System.out.println("Sala cadastrada com sucesso!");
		
	}

}

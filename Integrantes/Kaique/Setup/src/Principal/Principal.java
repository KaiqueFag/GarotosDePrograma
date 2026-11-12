package Principal;
import java.util.Scanner;
import java.util.ArrayList;
import Objetos.Perifericos;

public class Principal {
	static Scanner scan = new Scanner (System.in);
	static ArrayList<Perifericos> itens = new ArrayList<>();

	public static void main(String[] args) {
		menuEscolha();

	}

	private static void menuEscolha() {
		int op = 0;
		do {
		System.out.println("==========Kabuum Fag System ==========\n");
		System.out.println("1) Cadastrar");
		System.out.println("2) Listar");
		System.out.println("3) Editar");
		System.out.println("4) Excluir");
		System.out.println("0) Sair\n\n");
		System.out.println("Escolha uma das opções:");
		op = scan.nextInt();
		scan.nextLine();
		opMenu(op);
		} while (op!=0);
		System.out.println("Saindo do sistema");	
		System.out.println("Ate mais but!");
	}
	private static void opMenu(int op) {
		if (op==1) {
			cadastrar();
			return;
		}
		if (op==2) {
			listar();
			return;
		}
		if (op==3) {
			editar();
			return;
		}
		if (op==4) {
			excluir();
			return;
		}
		if (op==0) {
			return;
		}
		
		
		
	}

	private static void listar() {
			System.out.println("=============Itens Listados=============");
			for (int i=0; i<itens.size();i++) {
				itens.get(i).mostrarDados(int i);
			
		}
		
		
	}

	private static void editar() {
		listar();
		System.out.println("Insira o ID do item que deseja editar:");
		int escolha = scan.nextInt();
		scan.nextLine();
		if (escolha<0 || escolha<itens.size()) {
			System.out.println("ID não identificado, tente novamente!");
			return;
		}
		Perifericos per = itens.get(escolha);
		System.out.println("Insira o tipo atualizado do item:");
		per.setTipo(scan.nextLine());
		System.out.println("Insira a marca atualizada do item:");
		per.setMarca(scan.nextLine());
		itens.add(per);
		System.out.println("Item Atualizado!");
			
	}

	private static void cadastrar() {
		Perifericos per = new Perifericos();
		System.out.println("Insira o tipo do item:");
		per.setTipo(scan.nextLine());
		System.out.println("Insira a marca do item:");
		per.setMarca(scan.nextLine());
		itens.add(per);
		System.out.println("Item cadastrado!");
	}

	private static void excluir() {
		listar();
		System.out.println("Insira o ID do item que deseja editar:");
		int escolha = scan.nextInt();
		scan.nextLine();
		if (escolha<0 || escolha<itens.size()) {
			System.out.println("ID não identificado, tente novamente!");
			return;
		}
		itens.remove(escolha);
		System.out.println("item excluido com sucesso!");
		return;
		}
		
	}
	
	
	
	
	



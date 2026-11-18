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
		System.out.println("2) Retirar");
		System.out.println("3) Listar");
		System.out.println("4) Editar");
		System.out.println("5) Excluir");
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
			retirar();
			return;	
		}
		if (op==3) {
			listar();
			return;
		}
		if (op==4) {
			editar();
			return;
		}
		if (op==5) {
			excluir();
			return;
		}
		if (op==0) {
			return;
		}
		
		
		
	}

	private static void retirar() {
		listar();
		System.out.println("\nInsira o ID do item que deseja retirar");
		int escolha = scan.nextInt()-1;
		scan.nextLine();
		for (int i=0; i<itens.size(); i++) {
		if (escolha<0 || escolha>itens.size()-1) {
			System.out.println("Insira um ID válido! Tente novamente.");
			return;
		}
		}
		Perifericos per = itens.get(escolha);
		System.out.println("Qual a quantidade que deseja retirar?");
		int quan = scan.nextInt();
		scan.nextLine();
		if (quan<0 || quan> per.getQuantidade()) {
			System.out.println("Valor indisponível! Tente novamente.");
			return;
		}
		per.setQuantidade(per.getQuantidade()-quan);
		System.out.println("Retirada realizada com sucesso!");
		
	}

	private static void listar() {
			System.out.println("=============Itens Listados=============");
			for (int i=0; i<itens.size();i++) {
				itens.get(i).mostrarDados(i);
				
			
		}
		
		
	}

	private static void editar() {
		listar();
		System.out.println("Insira o ID do item que deseja editar:");
		int escolha = scan.nextInt()-1;
		scan.nextLine();
		
		if (escolha<0 || escolha>=itens.size()) {
			System.out.println("ID não identificado, tente novamente!");
			return;
		}
		
		Perifericos per = itens.get(escolha);
		System.out.println("Insira o tipo atualizado do item:");
		per.setTipo(scan.nextLine());
		System.out.println("Insira a marca atualizada do item:");
		per.setMarca(scan.nextLine());
		System.out.println("Insira a quantidade aualizada dos itens:");
		per.setQuantidade(scan.nextInt());
		System.out.println("\nItem Atualizado!");
			
	}

	private static void cadastrar() {
		Perifericos per = new Perifericos();
		System.out.println("Insira o tipo do item:");
		per.setTipo(scan.nextLine());
		System.out.println("Insira a marca do item:");
		per.setMarca(scan.nextLine());
		System.out.println("Insira a quantidade de itens:");
		per.setQuantidade(scan.nextInt());
		scan.nextLine();
		itens.add(per);
		per.setId(itens.size());
		System.out.println("Item cadastrado!");
	}

	private static void excluir() {
		listar();
		System.out.println("Insira o ID do item que deseja editar:");
		int escolha = scan.nextInt();
		scan.nextLine();
		if (escolha<0 || escolha<itens.size()-1) {
			System.out.println("ID não identificado, tente novamente!");
			return;
		}
		itens.remove(escolha);
		System.out.println("item excluido com sucesso!");
		return;
		}
		
	}
	
	
	
	
	



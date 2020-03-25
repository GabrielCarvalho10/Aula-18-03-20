package br.fai;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		Scanner scanner = new Scanner(System.in); 
		Cavalo cavalo = new Cavalo(0, null);
		Girafa girafa = new Girafa(0, null);
		
		
		
		int opcao = 0;
		
		do {
			System.out.println("1. Cadastrar cavalo");
			System.out.println("2. Cadastrar girafa");
			System.out.println("3. Listar cavalos");
			System.out.println("4. Listar girafa");
			System.out.println("5. Listar todos animais");
			System.out.println("6. Remover um animal por id");
			System.out.println("7. Exibir a quantidade de animais cadastrados por tipo");
			System.out.println("8. Sair");
			System.out.print("Entre com a OPCAO: ");
			opcao = scanner.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.print("ID cavalo: ");
				int idc = scanner.nextInt();
				cavalo.setId(idc);
				System.out.print("Nome do cavalo: ");
				scanner.nextLine();
				String nomec = scanner.nextLine();
				cavalo.setNome(nomec);			
				cavalo.cadastrarAnimal();	
				break;
			case 2:
				System.out.print("ID girafa: ");
				int idg = scanner.nextInt();
				girafa.setId(idg);
				System.out.print("Nome da girafa: ");
				scanner.nextLine();
				String nomeg = scanner.nextLine();
				girafa.setNome(nomeg);			
				girafa.cadastrarAnimal();
				break;
			case 3:
				cavalo.listarAnimal();	
				break;
			case 4:
				girafa.listarAnimal();
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			}
		}while(opcao != 8);
		
	}
	

}

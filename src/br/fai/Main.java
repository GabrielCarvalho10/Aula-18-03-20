package br.fai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		Scanner scanner = new Scanner(System.in); 
		
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
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
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

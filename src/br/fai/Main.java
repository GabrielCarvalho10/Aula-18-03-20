package br.fai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}
	int idContro = 1;
	
	Scanner scanner = new Scanner(System.in); 
	
	List<Animal> listaDeAnimais = new ArrayList<Animal>();
	List<Cavalo> listaDeCavalo = new ArrayList<Cavalo>();
	List<Girafa> listaDeGirafa = new ArrayList<Girafa>();
	
	Map<Integer, Animal> mapaAnimal = new HashMap<Integer, Animal>();


	private void start() {		
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
				cadastrarCavalo();
				break;
			case 2:
				cadastrarGirafa();
				break;
			case 3:
				listarCavalo();
				break;
			case 4:
				listarGirafa();
				break;
			case 5:
				listarTodoAnimal();
				break;
			case 6:
				removerAnimal();
				break;
			case 7:
				exibirAnimais();
				break;
			case 8:
				break;
			}
		}while(opcao != 8);
		
	}
	////CAVALO
	public void cadastrarCavalo(){
		
		int id = idControlador();
		String nome;

		System.out.println("Cadastro de cavalo");
		System.out.print("Nome do cavalo: ");
		nome = scanner.next();

		try {

			Cavalo novoCavalo = new Cavalo(id, nome);
			listaDeCavalo.add(novoCavalo);
			listaDeAnimais.add(novoCavalo);
			mapaAnimal.put(id, novoCavalo);

			System.out.println("Cavalo cadastrado.\n");

		} catch (Exception e) {
			System.out.println("Erro ao cadastrar");
		}
				
	}
	
	public void listarCavalo() {
		
		for(Cavalo c:listaDeCavalo) {
			System.out.println("Dados do cavalo: " + c.getId() + " | " + c.getNome());
		}
		
	}
	///GIRAFA
	public void cadastrarGirafa(){
		int id = idControlador();
		String nome;
		
		System.out.println("Cadastro da girafa");
		System.out.print("Nome da Girafa: ");
		nome = scanner.next();
		
		try {
			Girafa novaGirafa = new Girafa(id, nome);
			listaDeGirafa.add(novaGirafa);
			listaDeAnimais.add(novaGirafa);
			System.out.println("Girafa foi cadastrado com sucesso. \n");
		} catch (Exception e) {
			System.out.println("Ocorreu um problema ao cadastrar a Girafa.");
		}
				
	}
	
	public void listarGirafa() {	
		for(Girafa g:listaDeGirafa) {
			System.out.println("Dados da Girafa: " + g.getId() + " | " + g.getNome());
		}
		
	}
	///TODO ANIMAL
	public void listarTodoAnimal() {
		
		for(Animal animal: listaDeAnimais) {
				
				if(animal instanceof Cavalo) {
					
					Cavalo cavalo = (Cavalo) animal;
					System.out.println("Cavalo | " + cavalo.getId() + " | " + cavalo.getNome());
					
				}
				
				if(animal instanceof Girafa) {
					
					Girafa girafa = (Girafa) animal;
					System.out.println("Girafa | " + girafa.getId() + " | " + girafa.getNome());
					
				}
				
			}	
	}
	
	public void removerAnimal(){
		int id;
		System.out.println("Entre com ID do Animal para remover: ");
		id = scanner.nextInt();
	
		try {
			
			for(int i = 0; i< listaDeCavalo.size(); i++) {
				
				Cavalo cavalo = listaDeCavalo.get(i);
				if(cavalo.getId() == id) {
					listaDeCavalo.remove(i);
				}
				
			}
			
			for(int i = 0; i< listaDeGirafa.size(); i++) {
				
				Girafa girafa = listaDeGirafa.get(i);
				if(girafa.getId() == id) {
					listaDeGirafa.remove(i);
				}
				
			}
			
			for(int i = 0; i< listaDeAnimais.size(); i++) {
				
				Animal animal = listaDeAnimais.get(i);
				
				if(animal instanceof Cavalo) {
					
					Cavalo cavalo = (Cavalo) animal;
					if(cavalo.getId() == id) {
						listaDeAnimais.remove(i);
					}
					
				}
				
				if(animal instanceof Girafa) {
					
					Girafa girafa = (Girafa) animal;
					if(girafa.getId() == id) {
						listaDeAnimais.remove(i);
					}
					
				}
				
			}
			
			mapaAnimal.remove(id);

			System.out.println("Animal removido com sucesso.");
			
		} catch (Exception e) {
			System.out.println("Animal não foi removido, ouve algum erro: " + e);
		}
	
	}
	

	public void  exibirAnimais() {
		
		System.out.println("Detalhes dos animais");
		System.out.println("Quantidade de cavalos: " + listaDeCavalo.size());
	
		for (Cavalo cavalo : listaDeCavalo) {
			System.out.println("\tCavalo: " + cavalo.getId() + " | " + cavalo.getNome());
		}
	
	
		System.out.println("Números de girafas: " + listaDeCavalo.size());
		for (Girafa girafa : listaDeGirafa) {
		
			System.out.println("\tDados da girafa: " + girafa.getId() + " | " + girafa.getNome());
	
		}
	
		System.out.println("Total de animais: " + listaDeAnimais.size());
	}
	
	public int idControlador() {
		return this.idContro++;
	}
	
}

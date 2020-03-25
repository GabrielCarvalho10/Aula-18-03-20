package br.fai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class  Animal {
	
	public int id;
	public String nome;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	List<Animal> listaDeAnimais = new ArrayList<Animal>();
	List<Cavalo> listaDeCavalo = new ArrayList<Cavalo>();
	List<Girafa> listaDeGirafa = new ArrayList<Girafa>();
	
	Map<Integer, Animal> mapAnimal = new HashMap<Integer, Animal>();

	public void cadastrarAnimal(){
		
	}
	
	public void listarAnimal() {
			
	}
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
	public void removerAnimal(int id){
			
			try {
				
				for(int i = 0; i< listaDeCavalo.size(); i++) {
					
					Cavalo cavalo = listaDeCavalo.get(i);
					if(cavalo.getId() == this.id) {
						listaDeCavalo.remove(i);
					}
					
				}
				
				for(int i = 0; i< listaDeGirafa.size(); i++) {
					
					Girafa girafa = listaDeGirafa.get(i);
					if(girafa.getId() == this.id) {
						listaDeGirafa.remove(i);
					}
					
				}
				
				for(int i = 0; i< listaDeAnimais.size(); i++) {
					
					Animal animal = listaDeAnimais.get(i);
					
					if(animal instanceof Cavalo) {
						
						Cavalo cavalo = (Cavalo) animal;
						if(cavalo.getId() == this.id) {
							listaDeAnimais.remove(i);
						}
						
					}
					
					if(animal instanceof Girafa) {
						
						Girafa girafa = (Girafa) animal;
						if(girafa.getId() == this.id) {
							listaDeAnimais.remove(i);
						}
						
					}
					
				}
				
				mapAnimal.remove(id);

				System.out.println("Animal removido com sucesso.");
				
			} catch (Exception e) {
				System.out.println("Ocorreu um problema na tentativa de remover o animal: " + e);
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
}

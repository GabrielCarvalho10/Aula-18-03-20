package br.fai;

import java.util.ArrayList;
import java.util.List;

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

	public void cadastrarAnimal(){
		
	}
	
	List<Animal> listaDeAnimais = new ArrayList<Animal>();

	public void listarAnimal() {
		
		
	}
}

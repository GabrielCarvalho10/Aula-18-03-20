package br.fai;

import java.util.ArrayList;
import java.util.List;

public class Girafa extends Animal{
	
	public Girafa(int id,String nome) {
		this.setId(id);
		this.setNome(nome);
	}

	@Override
	public void cadastrarAnimal(){
		
		try {
			Girafa novaGirafa = new Girafa(id, nome);
			listaDeGirafa.add(novaGirafa);
			listaDeAnimais.add(novaGirafa);
			System.out.println("Girafa foi cadastrado com sucesso. \n");
		} catch (Exception e) {
			System.out.println("Ocorreu um problema ao cadastrar a Girafa.");
		}
				
	}
	
	@Override
	public void listarAnimal() {
		
		for(Girafa g:listaDeGirafa) {
			System.out.println("Dados da Girafa: " + g.getId() + " | " + g.getNome());
		}
		
	}
}

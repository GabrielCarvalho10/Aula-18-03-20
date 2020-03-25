package br.fai;

public class Cavalo extends Animal{
	
	public Cavalo(int id,String nome) {
			this.setId(id);
			this.setNome(nome);
	}
	
	@Override
	public void cadastrarAnimal(){
		
		try {
			Cavalo novoCavalo = new Cavalo(id, nome);
			listaDeCavalo.add(novoCavalo);
			listaDeAnimais.add(novoCavalo);
			System.out.println("Cavalo foi cadastrado com sucesso. \n");
		} catch (Exception e) {
			System.out.println("Ocorreu um problema ao cadastrar o cavalo.");
		}
				
	}
	
	@Override
	public void listarAnimal() {
		
		for(Cavalo c:listaDeCavalo) {
			System.out.println("Dados do cavalo: " + c.getId() + " | " + c.getNome());
		}
		
	}
}

package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		/*int a = 2;
		int b = 3;
		
		System.out.println("Hello World" + " " + (a+b));*/
		
		Gato g = new Gato("Gatinho", "Amarelo", 35);
		System.out.println(g);
		Livros l = new Livros("Livro A", "20");
		System.out.println(l);
	}

}

class Livros {
	
	private String nome;
	private String npag;
	
	public Livros(String nome, String npag) {
		
		this.nome = nome;
		this.npag = npag;
	}
	
	
}

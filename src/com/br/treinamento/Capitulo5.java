package com.br.treinamento;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.br.treinamento.entidades.Usuario;

public class Capitulo5 {
	
	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		//COMPARATORS
		
		// FORMA 1
		Comparator<Usuario> comparator = new Comparator<Usuario>() {
			public int compare(Usuario u1, Usuario u2) {
				return u1.getNome().compareTo(u2.getNome());
			}
		};
		Collections.sort(usuarios, comparator);
		
		//FORMA 2
		Comparator<Usuario> comparador = (u1, u2) -> u1.getNome().compareTo(u2.getNome());
		Collections.sort(usuarios, comparador);
		
		//FORMA 3
		Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		
		//LIST.SORT
		usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		
		//Métodos estaticos em interface comparator
		//FORMA 1
		Comparator<Usuario> comparator1 = Comparator.comparing(u -> u.getNome());
		usuarios.sort(comparator1);
		
		//FORMA 2
		usuarios.sort(comparing(u -> u.getNome()));
		
		
		//Indexando pela ordem natural
		List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");
		
		palavras.sort(Comparator.naturalOrder()); //reverseOrder()
		
		//Conhecendo melhor o Comparator.comparing
		Function<Usuario, String> extrairNome = u -> u.getNome();
		
		Comparator<Usuario> comparadorDeNomes = Comparator.comparing(extrairNome);
		
		usuarios.sort(comparadorDeNomes);
		
		//Autoboxing nos lambdas
		usuarios.sort(Comparator.comparingInt(u -> u.getPontos()));
	}

}

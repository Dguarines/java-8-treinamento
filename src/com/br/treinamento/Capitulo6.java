package com.br.treinamento;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import com.br.treinamento.entidades.Usuario;

public class Capitulo6 {
	
	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		Consumer<Usuario> tornaModerador = Usuario::tornarModerador;
		usuarios.forEach(tornaModerador);
		
		
		Function<Usuario, String> byName = Usuario::getNome;
		usuarios.sort(comparing(byName));
		
	}

}

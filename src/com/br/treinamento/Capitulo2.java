package com.br.treinamento;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.br.treinamento.entidades.Usuario;

public class Capitulo2 {
	
	public static void main (String ... args) {
		
		Usuario usuario1 = new Usuario("Deivison Guarines", 150);
		Usuario usuario2 = new Usuario("Allan Radji", 120);
		Usuario usuario3 = new Usuario("Tyago Tayrony", 190);
		
		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);
		
		for(Usuario u: usuarios) {
			System.out.println(u.getNome());
		}
		
		Consumer<Usuario> mostrador = new Consumer<Usuario>() {
			public void accept(Usuario usuario) {
				System.out.println(usuario.getNome());
			}
		};
		
		usuarios.forEach(mostrador);
		
		Consumer<Usuario> mostrador2 = (Usuario u) -> {System.out.println(u.getNome());}; // ou  u -> System.out.println(u.getNome());
		
		usuarios.forEach(u -> u.tornarModerador());
	}

}

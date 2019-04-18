package com.br.treinamento.validador;

@FunctionalInterface
public interface Validador<T> {
	boolean valida(T t);
}

package br.com.everis.tecnologia;

import br.com.everis.alex.ModuloAlex;

import br.com.everis.outro.ModuloOutro;

public class Principal {
	
	
	public static void main(String[] args) {

		 new ModuloAlex();
		
		System.out.println("#Inicio=Sistema#");
		
		System.out.println(new ModuloAlex().executa());
		
		System.out.println(new ModuloOutro().executa());
		
		System.out.println("#Fim====Sistema#");

	}

}

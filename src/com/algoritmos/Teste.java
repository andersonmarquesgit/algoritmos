package com.algoritmos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String numero = in.nextLine();
		List<String> resultado = new ArrayList<String>();
		gerarCombinacao(resultado, numero, numero.length(), "");
		System.out.println("Combinações possíveis: " + resultado.size());
		
//		int combinacao = 0;
//		for (String novoNumero : resultado) {
//			combinacao++;
//			System.out.println("Combinação " + combinacao + " : " + novoNumero);
//		}
	}
	
	public static void gerarCombinacao(List<String> resultado, String numero, int tamanho, String numeroAtual) { 
          String numeroCorrente = numeroAtual; 
        	  
          for (int i = 0; i < numero.length(); i++) { 
        	  numeroCorrente += numero.charAt(i);
              if (numeroCorrente.length() >= tamanho) { 
            	  //Remove os ZEROS da esquerda
            	  numeroCorrente = Integer.valueOf(numeroCorrente).toString();
            	  if (numeroCorrente.length() == numero.length()) {
            		  resultado.add(numeroCorrente); 
            	  }
                  numeroCorrente = numeroAtual; 
              } else { 
        		  gerarCombinacao(resultado, numero, tamanho, numeroCorrente); 
        		  numeroCorrente = numeroAtual; 
              } 
          } 
      } 
}

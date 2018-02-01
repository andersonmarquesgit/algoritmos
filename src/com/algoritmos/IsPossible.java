package com.algoritmos;

import java.io.IOException;
import java.util.Scanner;

/**
 * IsPossible contem um algoritmo que calcula se e possivel ou nao tranformar um par de numeros em outro utilizando 
 * basicamento operacao de soma incremental.
 * Por exemplo (1, 4) -> (1+4, 4) -> (5, 4) -> (5, 5+4) -> (5, 9) e por aí vai. Utiliza entrada e saida padrao.
 * A primeira linha contem o primeiro numero: a;
 * A segunda linha contem o segundo numero: b;
 * A terceira linha contem o primeiro numero desejado: c;
 * A quarta linha contem o segundo numero desejado: d;
 * 
 * Exemplo 1: (1, 4) -> (1+4, 4) -> (5, 4) -> (5, 5+4) -> (5, 9)
 * ****Entrada****
 * 1
 * 4
 * 5
 * 9
 * ****Saida****
 * YES
 * 
 * Exemplo 2: (1, 4) -> (1+4, 4) -> (5, 4) -> (5, 5+4) -> (5, 9) -> (5, 5+9) -> (5, 14), Ou seja, não e possivel 
 * alcancar a combinacao (5, 10) a partir do par (1, 4)
 * ****Entrada****
 * 1
 * 4
 * 5
 * 10
 * ****Saida****
 * NO
 * 
 * @author anderson.marques
 *
 */
public class IsPossible {
	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String res;
        int a;
        a = Integer.parseInt(in.nextLine().trim());

        int b;
        b = Integer.parseInt(in.nextLine().trim());

        int c;
        c = Integer.parseInt(in.nextLine().trim());

        int d;
        d = Integer.parseInt(in.nextLine().trim());

        res = isPossible(a, b, c, d);
        System.out.println(res);
    }

	private static String isPossible(int a, int b, int c, int d) {
		int operation = a + b;
		int newA = a;
		int newB = b;
		
		if(newA != c) {
			newA = operation;
			if(newA > c) {
				return "No";
			}
			return isPossible(newA, b, c, d);
		}
		
		if(newB != d) {
			newB = operation;
			if(newB > d) {
				return "No";
			}
			return isPossible(a, newB, c, d);
		}
		
		if((newA == c) && (newB == d)) {
			return "Yes";
		}
		
		return "No";
	}
}

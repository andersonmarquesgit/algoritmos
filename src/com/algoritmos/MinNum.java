package com.algoritmos;

import java.io.IOException;
import java.util.Scanner;

/**
 * MinNum contem um algoritmo que calcula a quantidade minima de dias necessarios para Kelly alcancar Asha na resolução 
 * de problemas. Utiliza entrada e saida padrao.
 * A primeira linha contem a quantidade de problemas realizados por Asha no dia: A;
 * A segunda linha contem a quantidade de problemas realizados por Kelly no dia: K;
 * A terceira linha contem a quantidade de problemas que Asha está a frente de Kelly no dia: P;
 * 
 * Exemplo 1: Asha resolveu 3 (A) problemas e está com 1 (P) a frente da Kelly, ou seja 4 problemas no dia, mas Kelly resolveu
 * 5 (K), ou seja, ela só precisa de 1 dia para passar Asha.
 * ****Entrada****
 * 3
 * 5
 * 1
 * ****Saida****
 * 1
 * 
 * Exemplo 2:Asha resolveu 4 (A) problemas e está com 1 (P) a frente da Kelly, ou seja 5 problemas no dia, mas Kelly resolveu
 * 5 (K), ou seja, ela precisa de 2 dias para passar Asha.
 * ****Entrada****
 * 4
 * 5
 * 1
 * ****Saida****
 * 2
 * 
 * @author anderson.marques
 *
 */
public class MinNum {

	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int res;
        int A;
        A = Integer.parseInt(in.nextLine().trim());

        int K;
        K = Integer.parseInt(in.nextLine().trim());

        int P;
        P = Integer.parseInt(in.nextLine().trim());

        res = minNum(A, K, P);
        System.out.println(res);
    }

	private static int minNum(int a, int k, int p) {
		int res = 1;
		int problemsAsha = a + p;
		int problemsKelly = k;
		
		while ((problemsKelly * res) <= problemsAsha) {
			res++;
		}
		return res;
	}
}

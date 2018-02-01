package com.algoritmos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
* OddNumbers contem um algoritmo que te retorna os numeros impares entre dois numeros. Utiliza entrada e saida padrao.
* A primeira linha contem o numero inicial da esquerda: _l;
* A segunda linha contem o numero final da direita: _r;
* 
* Exemplo 1:
* ****Entrada****
* 1
* 10
* ****Saida****
* 1
* 3
* 5
* 7
* 9
* 
* @author anderson.marques
*
*/
public class OddNumbers {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int[] res;
		int _l;
		_l = Integer.parseInt(in.nextLine().trim());

		int _r;
		_r = Integer.parseInt(in.nextLine().trim());

		res = oddNumbers(_l, _r);
		for (int res_i = 0; res_i < res.length; res_i++) {
			System.out.println(String.valueOf(res[res_i]));
		}
	}
	
	public static int[] oddNumbers(int l, int r) {
		List<Integer> resCol = new ArrayList<>();
		for (int i = l; i <= r; i++) {
			if(i%2 != 0) {
				resCol.add(i);
			}
		}
		
		int[] res = new int[resCol.size()];
		Iterator<Integer> iterator = resCol.iterator();
	    for (int i = 0; i < res.length; i++)
	    {
	    	res[i] = iterator.next().intValue();
	    }
	    return res;
    }
}

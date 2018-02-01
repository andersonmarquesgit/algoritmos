package com.algoritmos;

import java.io.IOException;
import java.util.Scanner;

/**
 * FindNumber contem um algoritmo que busca um numero qualquer dentro de array, e te retorna 'YES' ou 'NO" caso ele esteja 
 * contido no array. Utiliza entrada e saida padrao.
 * A primeira linha contem o tamanho do array: _arr_size;
 * Nas proximas linhas sao os valores desse array: _arr;
 * E a utlima linha contem o numero a ser procurado no array: _k;
 * 
 * Exemplo 1:
 * ****Entrada****
 * 3
 * 1
 * 2
 * 3
 * 2
 * ****Saida****
 * YES
 * 
 * Exemplo 2:
 * ****Entrada****
 * 3
 * 1
 * 2
 * 3
 * 9
 * ****Saida****
 * NO
 * 
 * @author anderson.marques
 *
 */
public class FindNumber {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        String res;
        
        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }
        
        int _k;
        _k = Integer.parseInt(in.nextLine().trim());
        
        res = findNumber(_arr, _k);
        System.out.println(res);
    }
	
	public static String findNumber(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if(k == arr[i]) {
				return "YES";
			}
		}
		return "NO";
    }

}

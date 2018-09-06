package com.algoritmos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.scene.input.KeyEvent;

public class MyCalculator {

	public static void main(String []args) {
		Scanner in = new Scanner(System.in).useDelimiter( "(\\b|\\B)" );

		int res;
		String input;
		List<Integer> n = new ArrayList<>();
		List<Integer> p = new ArrayList<>();
			
		while(in.hasNext()) {
			input = in.nextLine();
			if(input.equals("")) {
                break;
            }
			
			n.add(Character.getNumericValue(input.charAt(0)));
			p.add(Character.getNumericValue(input.charAt(2)));
		}
		
		for (int i = 0; i < n.size(); i++) {
			try {
				res = power(n.get(i), p.get(i));
				System.out.println(res);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
    }

	public static int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}

		return (p == 0) ? 1 : n * power(n, p - 1);
	}
}

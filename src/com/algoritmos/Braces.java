package com.algoritmos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Braces {
	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String[] res;
        int values_size = 0;
        values_size = Integer.parseInt(in.nextLine().trim());

        String[] values = new String[values_size];
        for(int i = 0; i < values_size; i++) {
            String values_item;
            try {
                values_item = in.nextLine();
            } catch (Exception e) {
                values_item = null;
            }
            values[i] = values_item;
        }

        res = braces(values);
        for(int res_i = 0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

	}

	private static String[] braces(String[] values) {
		int contParentesesL = 0;
		int contChavesL = 0;
		int contColcheteL = 0;
		int contParentesesR = 0;
		int contChavesR = 0;
		int contColcheteR = 0;
		String[] res = new String[values.length];
		
		for (int i = 0; i < values.length; i++) {
			String values_item = values[i];
			for (int j = 0; j < values_item.length(); j++) {
				switch (values_item.charAt(j)) {
				case '(':
					contParentesesL++;
					break;
				case ')':
					contParentesesR++;
					break;
				case '{':
					contChavesL++;
					break;
				case '}':
					contChavesR++;
					break;
				case '[':
					contColcheteL++;
					break;
				case ']':
					contColcheteR++;
					break;
				default:
					break;
				}
			}
			
			if(values_item.length() >= 6) {
				if((contParentesesL == contParentesesR)
						&& (contChavesL == contChavesR)
						&& (contColcheteL == contColcheteR)
						&& (contParentesesL != 0)
						&& (contParentesesR != 0)
						&& (contChavesL != 0)
						&& (contChavesR != 0)
						&& (contColcheteL != 0)
						&& (contColcheteR != 0)) {
					res[i] = "YES";
				}else {
					res[i] = "NO";
				}
			}else {
			}
			
			
			contParentesesL = 0;
			contChavesL = 0;
			contColcheteL = 0;
			contParentesesR = 0;
			contChavesR = 0;
			contColcheteR = 0;
		}
		
		return res;
	}
}

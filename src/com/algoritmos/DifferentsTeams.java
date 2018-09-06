package com.algoritmos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//TODO: FALTA CONCLUIR IMPLEMENTAÇÃO
public class DifferentsTeams {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int res;
		String skills;
		try {
			skills = in.nextLine();
		} catch (Exception e) {
			skills = null;
		}

		res = differentTeams(skills);
		System.out.println(res);
	}

	private static int differentTeams(String skills) {
		char[] skillsDefault = {'p', 'm', 'a', 'b', 'z'};
		char[] skillsValidas = new char[5];
		String sv = "";
		HashMap<Integer, char[]> teams = new HashMap<Integer, char[]>();
		int key = 0;
		int cont = 0;
		
		if(skills.length() < 5) {
			return 0;
		}
		
		while(skills.length()/skillsDefault.length != key) {
			sv = "";
			for (int i = cont; i < skills.length(); i++) {
				for (int j = 0; j < skillsDefault.length; j++) {
					if((skills.toLowerCase().charAt(i) == skillsDefault[j]) 
							&& !sv.contains(String.valueOf(skills.toLowerCase().charAt(i)))) {
						sv = sv + String.valueOf(skills.toLowerCase().charAt(i));
						cont++;
					}
				}
			}
			
			if((sv.length() == 5)) {
				teams.put(key, sv.toCharArray());
			}else {
				cont = cont - sv.length();
			}
			
			key++;
		}
		
		for (int i = 0; i < teams.size(); i++) {
			for (int j = 0; j < teams.get(i).length; j++) {
				System.out.print(teams.get(i)[j]);
			}
			
		}
		
		System.out.println();
		return teams.size();
	}
}

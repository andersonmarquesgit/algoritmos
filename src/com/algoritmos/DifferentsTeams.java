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
		int qtdTeams = 0;
		HashMap<Integer, char[]> teams = new HashMap<Integer, char[]>();
		int key = 0;
		
		if(skills.length() < 5) {
			return qtdTeams;
		}
		
		while(skills.length()/skillsDefault.length != teams.size()) {
			for (int i = 0; i < skills.length(); i++) {
				for (int j = 0; j < skillsDefault.length; j++) {
					if((skills.toLowerCase().charAt(i) == skillsDefault[j]) 
							&& !sv.contains(String.valueOf(skills.toLowerCase().charAt(i)))) {
						sv = sv + String.valueOf(skills.toLowerCase().charAt(i));
						skillsValidas[j] = skills.toLowerCase().charAt(i);
					}
				}
			}
			
			if(sv.length() == 5) {
				teams.put(key, sv.toCharArray());
				key++;
			}else {
				return qtdTeams;
			}
		}
		
		qtdTeams = teams.size();
		
		return qtdTeams;
	}
}

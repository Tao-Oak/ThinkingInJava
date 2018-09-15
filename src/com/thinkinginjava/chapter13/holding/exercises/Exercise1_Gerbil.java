//
// Created by Joshua.Cao, 2018/09/12
//
package com.thinkinginjava.chapter13.holding.exercises;

import java.util.ArrayList;
import java.util.Random;

public class Exercise1_Gerbil {
	private int gerbilNumber;
	public Exercise1_Gerbil(int hopDistance) {
		gerbilNumber = hopDistance;
	}
	
	public int hop() {
		return gerbilNumber;
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Exercise1_Gerbil> list = new ArrayList<>();
		for (int i = 0; i < random.nextInt(30); i++) {
			list.add(new Exercise1_Gerbil(random.nextInt(50)));
		}
		
		for (Exercise1_Gerbil gerbil: list) {
			System.out.println("hop distance: " + gerbil.hop());
		}
	}
}

//
// Created by Joshua.Cao, 2018/09/12
//
package com.thinkinginjava.chapter13.holding.examples;

import java.util.ArrayList;

public class ApplesAndOrangeWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		
		for (int i = 0; i < apples.size(); i++) {
			apples.get(i).id();
		}
	}
}

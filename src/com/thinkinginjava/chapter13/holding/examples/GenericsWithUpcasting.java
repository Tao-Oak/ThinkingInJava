//
// Created by Joshua.Cao, 2018/09/12
//
package com.thinkinginjava.chapter13.holding.examples;

import java.util.ArrayList;

class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}

public class GenericsWithUpcasting {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		
		for (Apple apple: apples) {
			System.out.println(apple);
		}
	}
}

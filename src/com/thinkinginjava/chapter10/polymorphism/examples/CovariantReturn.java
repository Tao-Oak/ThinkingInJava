//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter10.polymorphism.examples;

class Grain {
	@Override
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain{
	@Override
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	public Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill{
	@Override
	public Wheat process() {
		return new Wheat();
	}
}

public class CovariantReturn {
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
	}
}

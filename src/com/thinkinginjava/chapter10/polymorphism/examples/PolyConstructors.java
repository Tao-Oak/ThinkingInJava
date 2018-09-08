//
//Created by CaoTao, 2018/09/05
//
package com.thinkinginjava.chapter10.polymorphism.examples;

class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}
	
	Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	private String name;
	
	RoundGlyph(int r) {
		radius = r;
		name = "RoundGlyph";
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	
	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius + ", name = " + name);
	}
}

public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}

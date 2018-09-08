//
// Created by CaoTao, 2018/09/04
//
package com.thinkinginjava.chapter10.polymorphism.examples.music;

public class Music {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] e) {
		for (Instrument i: e)
			tune(i);
	}
	
	public static void toString(Instrument[] e) {
		for (Instrument i: e)
			System.out.println(i.what());
	}
	
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
		
		System.out.println();
		
		Instrument[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		tuneAll(orchestra);
		
		System.out.println();
		
		toString(orchestra);
	}
}

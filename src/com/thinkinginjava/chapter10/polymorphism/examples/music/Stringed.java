//
//Created by CaoTao, 2018/09/04
//
package com.thinkinginjava.chapter10.polymorphism.examples.music;

import static net.mindview.util.Print.print;

public class Stringed extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}
	
	@Override
	String what() {
		return "Stringed";
	}
	
	@Override
	void adjust() {
		print("Adjusting Stringed");
	}
}


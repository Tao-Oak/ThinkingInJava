//
// Created by CaoTao, 2018/09/04
//
package com.thinkinginjava.chapter10.polymorphism.examples.music;

import static net.mindview.util.Print.print;

public class Wind extends Instrument {

	@Override
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
	
	@Override
	String what() {
		return "Wind";
	}
	
	@Override
	void adjust() {
		print("Adjusting Wind");
	}
}

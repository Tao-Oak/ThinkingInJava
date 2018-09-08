//
// Created by CaoTao, 2018/09/04
//
package com.thinkinginjava.chapter10.polymorphism.examples.music;

import static net.mindview.util.Print.print;

public class Percussion extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}
	
	@Override
	String what() {
		return "Percussion";
	}
	
	@Override
	void adjust() {
		print("Adjusting Percussion");
	}
}

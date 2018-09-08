//
// Created by CaoTao, 2018/09/04
//
package com.thinkinginjava.chapter10.polymorphism.examples.music;

import static net.mindview.util.Print.*;

public class Instrument {
	public void play(Note n) {
		print("Instrucment.play()");
	}
	
	String what() {
		return "Instrument";
	}
	
	void adjust() {
		print("Adjusting Instrucment");
	}
}

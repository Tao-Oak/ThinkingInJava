//
//Created by CaoTao, 2018/09/04
//
package com.thinkinginjava.chapter10.polymorphism.examples.music;

import static net.mindview.util.Print.print;

public class Brass extends Wind {
	@Override
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
	
	@Override
	void adjust() {
		print("Adjusting Brass");
	}
}



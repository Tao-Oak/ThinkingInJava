//
//Created by CaoTao, 2018/09/04
//
package com.thinkinginjava.chapter10.polymorphism.examples.music;

public class Woodwind extends Wind {
	@Override
	public void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}
	
	@Override
	String what() {
		return "Woodwind";
	}
}




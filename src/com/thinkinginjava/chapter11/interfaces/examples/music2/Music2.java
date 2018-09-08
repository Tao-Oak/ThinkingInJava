//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples.music2;

import com.thinkinginjava.chapter10.polymorphism.examples.music.Note;

interface Instrument {
	Object VALUE = new Object();
	
	void play(Note n);
	void adjust();
}

class Wind implements Instrument {
	public static final Object WIND_VALUE = new Object();
	@Override
	public void play(Note n) {
	}
	
	@Override
	public void adjust() {
	}
}

class WoodWind extends Wind {
	
}

public class Music2 {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		if (Instrument.VALUE == Wind.VALUE) {
			System.out.println("Hello World");
		}
		
		if (WoodWind.WIND_VALUE == Wind.WIND_VALUE) {
			
		}
	}
}

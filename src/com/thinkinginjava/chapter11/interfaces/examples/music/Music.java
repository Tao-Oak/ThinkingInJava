//
//Created by CaoTao, 2018/09/07
//
package com.thinkinginjava.chapter11.interfaces.examples.music;

import static net.mindview.util.Print.print;
import com.thinkinginjava.chapter10.polymorphism.examples.music.Note;

abstract class Instrument {
	@SuppressWarnings("unused")
	private int i;
	public abstract void play(Note n);
	public String what() {
		return "Instrument";
	}
	public abstract void adjust();
}

class Wind extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
	
	@Override
	public String what() {
		return "Wind";
	}
	
	@Override
	public void adjust() {}
}

class Percussion extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}
	
	@Override
	public String what() {
		return "Percussion";
	}
	
	@Override
	public void adjust() {
		print("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}
	
	@Override
	public String what() {
		return "Stringed";
	}
	
	@Override
	public void adjust() {
		print("Adjusting Stringed");
	}
}

class Brass extends Wind {
	@Override
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
	
	@Override
	public void adjust() {
		print("Adjusting Brass");
	}
}

class Woodwind extends Wind {
	@Override
	public void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}
	
	@Override
	public String what() {
		return "Woodwind";
	}
}

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

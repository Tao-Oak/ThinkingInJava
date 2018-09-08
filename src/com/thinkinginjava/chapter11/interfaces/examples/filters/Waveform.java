//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples.filters;

public class Waveform {
	public static long counter;
	private final long id = counter++;
	
	@Override
	public String toString() {
		return "Waveform " + id;
	}
}

//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples.filters;

public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}
	
	public Waveform process(Waveform input) {
		return input;
	}
}

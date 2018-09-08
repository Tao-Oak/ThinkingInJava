//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples.filters;

public class LowPass extends Filter {
	double cutoff;
	
	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}
	
	public Waveform process(Waveform input) {
		return input;
	}
}

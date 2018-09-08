//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples.filters;

public class BandPass extends Filter {
	double lowCutoff, highCutoff;
	
	public BandPass(double lowCut, double highCut) {
		this.lowCutoff = lowCut;
		this.highCutoff = highCut;
	}
	
	public Waveform process(Waveform input) {
		return input;
	}
}
//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples.interfaceprocessor;

import com.thinkinginjava.chapter11.interfaces.examples.filters.BandPass;
import com.thinkinginjava.chapter11.interfaces.examples.filters.Filter;
import com.thinkinginjava.chapter11.interfaces.examples.filters.HighPass;
import com.thinkinginjava.chapter11.interfaces.examples.filters.LowPass;
import com.thinkinginjava.chapter11.interfaces.examples.filters.Waveform;

class FilterAdapter implements Processor {
	Filter filter;
	
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	
	@Override
	public String name() {
		return filter.name();
	}
	
	@Override
	public Waveform process(Object o) {
		return filter.process((Waveform)o);
	}
}

public class FilterProcessor {
	public static void main(String[] args) {
		Waveform waveform = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), waveform);
		Apply.process(new FilterAdapter(new HighPass(1.0)), waveform);
		Apply.process(new FilterAdapter(new BandPass(1.0, 2.0)), waveform);
	}
}

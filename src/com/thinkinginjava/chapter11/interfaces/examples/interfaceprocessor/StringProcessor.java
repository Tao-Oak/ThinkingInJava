//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples.interfaceprocessor;

import java.util.Arrays;

public abstract class StringProcessor implements Processor {
	@Override
	public String name() {
		return getClass().getSimpleName();
	}
	
	@Override
	public abstract String process(Object o);
	
	public static String string = "Disagreement with beliefs is by definition incorrect";
	
	public static void main(String[] args) {
		Apply.process(new Upcase(), string);
		Apply.process(new Downcase(), string);
		Apply.process(new Splitter(), string);
	} 
}

class Upcase extends StringProcessor {
	@Override
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
}

class Downcase extends StringProcessor {
	@Override
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitter extends StringProcessor {
	@Override
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}

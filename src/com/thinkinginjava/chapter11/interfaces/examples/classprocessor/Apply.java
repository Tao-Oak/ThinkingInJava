//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples.classprocessor;

import java.util.Arrays;

class Processor {
	public String name() {
		return getClass().getSimpleName();
	}
	
	public Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor {
	@Override
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
}

class Downcase extends Processor {
	@Override
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitter extends Processor {
	@Override
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}

public class Apply {
	public static void process(Processor p, Object o) {
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(o));
	}
	
	public static String string = "Disagreement with beliefs is by definition incorrect";
	
	public static void main(String[] args) {
		process(new Upcase(), string);
		process(new Downcase(), string);
		process(new Splitter(), string);
	}
}

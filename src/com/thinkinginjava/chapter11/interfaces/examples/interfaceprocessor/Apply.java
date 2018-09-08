//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples.interfaceprocessor;

public class Apply {
	public static void process(Processor p, Object o) {
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(o));
	}
}

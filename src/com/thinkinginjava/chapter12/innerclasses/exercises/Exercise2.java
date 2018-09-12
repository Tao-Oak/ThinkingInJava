//
//Created by CaoTao, 2018/09/08
//
package com.thinkinginjava.chapter12.innerclasses.exercises;

import com.thinkinginjava.chapter12.innerclasses.examples.Selector;
import com.thinkinginjava.chapter12.innerclasses.examples.Sequence;

public class Exercise2 {
	private String desc;
	public Exercise2(String s) {
		desc = s;
	}
	
	@Override
	public String toString() {
		return desc;
	}
	
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		
		for(int i = 1; i < 11; i++) {
			if ( i == 1) {
				sequence.add(new Exercise2(i + "st"));
			} else if (i == 2) {
				sequence.add(new Exercise2(i + "nd"));
			} else if (i == 3) {
				sequence.add(new Exercise2(i + "rd"));
			} else {
				sequence.add(new Exercise2(i + "th"));
			}
		}
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		System.out.println();
	}
}

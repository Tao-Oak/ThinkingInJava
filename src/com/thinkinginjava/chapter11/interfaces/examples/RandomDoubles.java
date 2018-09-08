//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples;

import java.util.Random;

public class RandomDoubles {
	private static Random rand = new Random(47);
	
	public double next() {
		return rand.nextDouble();
	}
}

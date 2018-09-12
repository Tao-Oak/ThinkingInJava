//
//Created by CaoTao, 2018/09/10
//
package com.thinkinginjava.chapter12.innerclasses.examples;

public interface ClassInInterface {
	void howdy();
	
	class Test implements ClassInInterface {
		@Override
		public void howdy() {
			System.out.println("Howdy");
		}
		
		public static void main(String[] args) {
			new Test().howdy();
		}
	}
}

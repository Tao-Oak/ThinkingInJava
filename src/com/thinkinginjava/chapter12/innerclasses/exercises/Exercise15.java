//
//Created by CaoTao, 2018/09/10
//
package com.thinkinginjava.chapter12.innerclasses.exercises;


class NonDefaultConstructor {
	public NonDefaultConstructor(String name) {
		
	}
}

class DefaultConstructor {
	public NonDefaultConstructor returnSomething() {
		return new NonDefaultConstructor("Joshua") {
			{
				System.out.println("Anonymous class");
			}
		};
	}
}

public class Exercise15 {
	public static void main(String[] args) {
		new DefaultConstructor().returnSomething();
	}
}

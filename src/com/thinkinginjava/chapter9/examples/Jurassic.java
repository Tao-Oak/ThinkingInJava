//
// Created by CaoTao, 2018/09/02
//
package com.thinkinginjava.chapter9.examples;

class SmallBrain {}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {}
}

// The Type SubDinosaur cannot sunclass the final class Dinosaur
/*
class SubDinosaur extends Dinosaur {
	
}
*/

public class Jurassic {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}
}

//
// Created by CaoTao, 2018/09/04
//
package com.thinkinginjava.chapter10.polymorphism.examples.shape;

public class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Square.draw()");
	}
	
	@Override
	public void erase() {
		System.out.println("Square.erase()");
	}
}

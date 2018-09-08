//
// Created by CaoTao, 2018/09/04
//
package com.thinkinginjava.chapter10.polymorphism.examples.shape;

public class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}
	
	@Override
	public void erase() {
		System.out.println("Triangle.erase()");
	}
}

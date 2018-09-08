//
// Created by CaoTao, 2018/09/04
//
package com.thinkinginjava.chapter10.polymorphism.examples.shape;

public class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}
	
	@Override
	public void erase() {
		System.out.println("Circle.erase()");
	}
}

//
//Created by CaoTao, 2018/09/09
//
package com.thinkinginjava.chapter12.innerclasses.exercises.exercise6.classes;

import com.thinkinginjava.chapter12.innerclasses.exercises.exercise6.interfaces.Animal;

public class AnimalHolder {
	protected class Pig implements Animal {
		public Pig() {
		}
		@Override
		public void eat() {
			System.out.println("Pig.eat()");
		}
		@Override
		public void howl() {
			System.out.println("Pig.howl()");
		}
	}
}

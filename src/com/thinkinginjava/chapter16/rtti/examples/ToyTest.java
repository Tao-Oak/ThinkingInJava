//
// Created by Joshua.cao, 2018/09/26
//
package com.thinkinginjava.chapter16.rtti.examples;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
	public Toy() {}
	public Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	public FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void printInfo (Class<?> clazz) {
		System.out.println("Class name: " + clazz.getName() + 
				" is interface? [" + clazz.isInterface() + "]");
		System.out.println("Simple name: " + clazz.getSimpleName());
		System.out.println("Canonical name: " + clazz.getCanonicalName());
		System.out.println();
	}
	
	public static void main(String[] args) {
		Class<?> clazz = null;
		try {
			clazz = Class.forName("com.thinkinginjava.chapter16.rtti.examples.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("Cannot find FancyToy");
			System.exit(1);
		}
		printInfo(clazz);
		for (Class<?> face: clazz.getInterfaces()) {
			printInfo(face);
		}
		Class<?> up = clazz.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch(InstantiationException e) {
			System.out.println("Cannot initialize");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}

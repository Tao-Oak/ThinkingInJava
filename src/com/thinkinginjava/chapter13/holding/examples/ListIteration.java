//
// Created by Joshua.Cao, 2018/09/14
//
package com.thinkinginjava.chapter13.holding.examples;

import java.util.List;
import java.util.ListIterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class ListIteration {
	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(8);
		ListIterator<Pet> itor = pets.listIterator();
		while (itor.hasNext()) {
			System.out.println(itor.next() + ", " + itor.nextIndex() + ", " + itor.previousIndex());
		}
		System.out.println();
		while(itor.hasPrevious()) {
			System.out.println(itor.previous().id());
		}
		System.out.println();
		System.out.println(pets);
		itor = pets.listIterator(3);
		while (itor.hasNext()) {
			itor.next();
			itor.set(Pets.randomPet());
		}
		System.out.println(pets);
	}
}

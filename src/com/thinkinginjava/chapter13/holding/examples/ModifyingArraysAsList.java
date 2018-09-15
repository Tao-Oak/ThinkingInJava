//
// Created by Joshua.Cao, 2018/09/15
//
package com.thinkinginjava.chapter13.holding.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ModifyingArraysAsList {
	public static void main(String[] args) {
		Random random = new Random(47);
		Integer[] ia = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list1 = new ArrayList<>(Arrays.asList(ia));
		System.out.println("Before shuffling: " + list1);
		Collections.shuffle(list1, random);
		System.out.println("After shuffling: " + list1);
		System.out.println("array: : " + Arrays.toString(ia));
		
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(ia);
		System.out.println("Before shuffling: " + list2);
		Collections.shuffle(list2, random);
		System.out.println("After shuffling: " + list2);
		System.out.println("array: : " + Arrays.toString(ia));
	}
}

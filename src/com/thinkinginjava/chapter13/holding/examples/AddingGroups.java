//
// Created by Joshua.Cao, 2018/09/12
//
package com.thinkinginjava.chapter13.holding.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		Integer[] moreInts = { 6, 7, 8, 9, 10 };
		collection.addAll(Arrays.asList(moreInts));
		
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 99);
		// Unsupport operation
		// !list.add(100);
	}
}

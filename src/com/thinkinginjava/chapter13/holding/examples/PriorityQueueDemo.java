//
// Created by Joshua.Cao, 2018/09/14
//
package com.thinkinginjava.chapter13.holding.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

public class PriorityQueueDemo {
	public static <T> void printQueue(Queue<T> queue) {
		while (queue.peek() != null) {
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			priorityQueue.offer(rand.nextInt(i + 10));
		}
		printQueue(priorityQueue);
		
		List<Integer> integers = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
		priorityQueue = new PriorityQueue<>(integers);
		printQueue(priorityQueue);
		
		priorityQueue = new PriorityQueue<>(integers.size(), Collections.reverseOrder());
		priorityQueue.addAll(integers);
		printQueue(priorityQueue);
		
		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings = Arrays.asList(fact.split(" "));
		PriorityQueue<String> strPriorityQueue = new PriorityQueue<>(strings);
		printQueue(strPriorityQueue);
		
		strPriorityQueue = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
		strPriorityQueue.addAll(strings);
		printQueue(strPriorityQueue);
		
		Set<Character> charSet = new HashSet<>();
		for (char c: fact.toCharArray()) {
			charSet.add(c);
		}
		PriorityQueue<Character> charPriorityQueue = new PriorityQueue<>(charSet);
		printQueue(charPriorityQueue);
	}
}

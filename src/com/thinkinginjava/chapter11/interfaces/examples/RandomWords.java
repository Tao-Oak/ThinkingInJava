//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable {
	private static Random random = new Random(47);
	private static final char[] captials = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	
	private int count;
	
	public RandomWords(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0) return -1;
		
		cb.append(captials[random.nextInt(captials.length)]);
		for (int i = 0; i < 4; i++) {
			cb.append(vowels[random.nextInt(vowels.length)]);
			cb.append(lowers[random.nextInt(lowers.length)]);
		}
		cb.append(" ");
		
		return 10;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(new RandomWords(10));
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
	}
}

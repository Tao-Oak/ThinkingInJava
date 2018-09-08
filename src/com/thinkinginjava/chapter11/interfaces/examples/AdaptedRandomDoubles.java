//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomDoubles extends RandomDoubles implements Readable {
	private int count;
	
	public AdaptedRandomDoubles(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0) return -1;
		String s = Double.toString(next()) + " ";
		cb.append(s);
		return s.length();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(new AdaptedRandomDoubles(7));
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
	}
}

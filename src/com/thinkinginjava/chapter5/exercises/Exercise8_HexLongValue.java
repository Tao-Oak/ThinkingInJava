//
// Created by CaoTao, 2018/08/20
//
package com.thinkinginjava.chapter5.exercises;

public class Exercise8_HexLongValue {
  public static void main(String[] args) {
    // hex representation
    long n1 = 0x100;
    System.out.println("n1: " + Long.toBinaryString(n1));
    // maximum long value
    long n2 = 0x7fffffffffffffffL;
    System.out.println("n2: " + n2);
    long n3 = 0x8fffffffffffffffL;
    System.out.println("n3: " + n3);

    // Octal representation
    long n4 = 010;
    System.out.println("n4: " + n4);
    // maximum long value: 64 = 21 * 3 + 1
    long n5 = 0777777777777777777777L;
    System.out.println("n5: " + n5);
  }
}
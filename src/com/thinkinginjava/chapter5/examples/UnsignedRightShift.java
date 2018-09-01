//
// Created by CaoTao, 2018/08/20
//
package com.thinkinginjava.chapter5.examples;

// page 113
public class UnsignedRightShift {
  public static void main(String[] args) {
    int i = -1;
    System.out.println("i: " + i + ", binary: " + Integer.toBinaryString(i));
    i >>>= 10;
    System.out.println("i: " + i + ", binary: " + Integer.toBinaryString(i));

    long l = -1;
    System.out.println("l: " + l + ", binary: " + Long.toBinaryString(l));
    l >>>= 10;
    System.out.println("l: " + l + ", binary: " + Long.toBinaryString(l));

    short s = -1;
    System.out.println("s: " + s + ", binary: " + Integer.toBinaryString(s));
    s >>>= 10;
    System.out.println("s: " + s + ", binary: " + Integer.toBinaryString(s));

    byte b = -1;
    System.out.println("b: " + b + ", binary: " + Integer.toBinaryString(b));
    b >>= 10;
    System.out.println("b: " + b + ", binary: " + Integer.toBinaryString(b));
    b >>>= 25;
    System.out.println("b: " + b + ", binary: " + Integer.toBinaryString(b));

    b = -1;
    System.out.println("b: " + Integer.toBinaryString(b));
    System.out.println("b: " + (b>>>10) + ", binary: " + Integer.toBinaryString(b>>>10));

    int i2 = 8;
    i2 >>= 64;
    System.out.println("i2:" + i2);
    i2 >>= 65;
    System.out.println("i2:" + i2);
  }
}
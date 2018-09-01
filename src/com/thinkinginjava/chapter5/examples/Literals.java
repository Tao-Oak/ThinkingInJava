//
// Created by CaoTao, 2018/08/19
//
package com.thinkinginjava.chapter5.examples;

import static net.mindview.util.Print.*;

public class Literals {
  public static void main(String[] args) {
    int i1 = 0x2f;
    print("i1: " + Integer.toBinaryString(i1));
    int i2 = 0X2F;
    print("i2: " + Integer.toBinaryString(i2));
    // Octal, leading zero
    int i3 = 0177;
    print("i3: " + Integer.toBinaryString(i3));

    char c = 0xffff;
    print("c: " + Integer.toBinaryString(c));

    // maximum byte hex value
    byte b1 = 0x7f;
    print("b1: " + Integer.toBinaryString(b1));
    // // error: incompatible types: possible lossy conversion from int to byte
    // byte b2 = 0x80;
    // print("b2: " + Integer.toBinaryString(b2));
    byte b3 = (byte)0x80;
    print("b3: " + b3);

    // maximum short hex value
    short s = 0x7fff;
    print("s: " + Integer.toBinaryString(s));

    @SuppressWarnings("unused")
    long n1 = 200L;
    @SuppressWarnings("unused")
    long n2 = 200l;
    @SuppressWarnings("unused")
    long n3 = 200;

    @SuppressWarnings("unused")
    float f1 = 1;
    @SuppressWarnings("unused")
    float f2 = 1F;
    @SuppressWarnings("unused")
    float f3 = 1f;

    @SuppressWarnings("unused")
    double d1 = 1d;
    @SuppressWarnings("unused")
    double d2 = 1D;
  }
}
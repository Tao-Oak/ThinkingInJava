//
// Created by CaoTao, 2018/08/20
//
package com.thinkinginjava.chapter5.examples;

// page 114
import java.util.*;
import static net.mindview.util.Print.*;

public class BitManipulation {
  static void printBinaryInt(String s, int i) {
    String str = "\t\t\t\t\t" + s + ", int: " + i + ", binary:\n";
    print(str + Integer.toBinaryString(i));
  }

  static void printBinaryLong(String s, long l) {
    String str = "\t\t\t\t\t" + s + ", long: " + l + ", binary:\n";
    print(str + Long.toBinaryString(l));
  }

  static void printNewLine() {
    System.out.println();
    System.out.println("--- ---");
  }

  public static void main(String[] args) {
    Random rand = new Random(47);
    int i = rand.nextInt(), j = rand.nextInt();
    printBinaryInt("-1", -1);
    printBinaryInt("+1", +1);
    printNewLine();

    int maxpos = 2147483647;
    printBinaryInt("maxpos", maxpos);
    int maxneg = -2147483648;
    printBinaryInt("maxneg", maxneg);
    printNewLine();

    printBinaryInt("i", i);
    printBinaryInt("~i", ~i);
    printBinaryInt("-i", -i);
    printBinaryInt("j", j);
    printBinaryInt("i & j", i & j);
    printBinaryInt("i | j", i | j);
    printBinaryInt("i ^ j", i ^ j);
    printBinaryInt("i << 5", i << 5);
    printBinaryInt("i >> 5", i >> 5);
    printBinaryInt("(~i) >> 5", (~i) >> 5);
    printBinaryInt("(-i) >> 5", (-i) >> 5);
    printBinaryInt("i >>> 5", i >>> 5);
    printBinaryInt("(~i) >>> 5", (~i) >>> 5);
    printNewLine();

    long l = rand.nextLong(), m = rand.nextLong();
    printBinaryLong("-1L", -1L);
    printBinaryLong("+1L", +1L);
    printNewLine();

    long ll = 9223372036854775807L;
    printBinaryLong("maxpos", ll);
    long lln = -9223372036854775808L;
    printBinaryLong("maxneg", lln);
    printNewLine();

    printBinaryLong("l", l);
    printBinaryLong("~l", ~l);
    printBinaryLong("-l", -l);
    printBinaryLong("m", m);
    printBinaryLong("l & m", l & m);
    printBinaryLong("l | m", l | m);
    printBinaryLong("l ^ m", l ^ m);
    printBinaryLong("l << 5", l << 5);
    printBinaryLong("l >> 5", l >> 5);
    printBinaryLong("(~l) >> 5", (~l) >> 5);
    printBinaryLong("l >>> 5", l >>> 5);
    printBinaryLong("(~l) >>> 5", (~l) >>> 5);
  }
}
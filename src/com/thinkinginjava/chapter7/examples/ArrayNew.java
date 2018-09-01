//
// Created by CaoTao, 2018/08/27
//
package com.thinkinginjava.chapter7.examples;

import java.util.Random;
import java.util.Arrays;
import static net.mindview.util.Print.*;

// Page 195
public class ArrayNew {
  public static void main(String[] args) {
    int[] a;
    char[] c;
    Random rand = new Random();
    a = new int[rand.nextInt(20)];
    c = new char[rand.nextInt(15)];
    print("length of a = " + a.length);
    print(Arrays.toString(a));
    print("length of c = " + c.length);
    print(Arrays.toString(c));

    Integer[] integerArray = new Integer[rand.nextInt(10)];
    print("length of integerArray = " + integerArray.length);
    print(Arrays.toString(integerArray));
    for (int i = 0; i < integerArray.length; i++) {
      integerArray[i] = rand.nextInt(100);
    }
    print(Arrays.toString(integerArray));

    Integer[] integer1 = {
      new Integer(rand.nextInt(1000)),
      new Integer(rand.nextInt(1000)),
      300
    };
    print(Arrays.toString(integer1));
    Integer[] integer2 = new Integer[] {
      new Integer(rand.nextInt(1000)),
      new Integer(rand.nextInt(1000)),
      100
    };
    print(Arrays.toString(integer2));
  }
}
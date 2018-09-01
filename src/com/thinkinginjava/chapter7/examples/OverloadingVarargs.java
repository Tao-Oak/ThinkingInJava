//
// Created by CaoTao, 2018/08/27
//
package com.thinkinginjava.chapter7.examples;

public class OverloadingVarargs {
  static void f (Character... args) {
    System.out.print("first");
    for (Character c: args) {
      System.out.print(" " + c);
    }
    System.out.println();
  }

  static void f (Integer... args) {
    System.out.print("second");
    for (Integer i: args) {
      System.out.print(" " + i);
    }
    System.out.println();
  }

  static void f (Long... args) {
    System.out.println("third");
  }

  static void f2 (float i, Character... args) {
    System.out.println("first");
  }

  static void f2 (Character... args) {
    System.out.println("second");
  }

  static void f3 (float i, Character... args) {
    System.out.println("first");
  }

  static void f3 (char c, Character... args) {
    System.out.println("second");
  }

  public static void main (String... args) {
    f('a', 'b', 'c');
    f(1);
    f(2, 1);
    f(0);
    f(0L);
    // error: reference to f is ambiguous
    // f();

    System.out.println();
    f2(1, 'a');
    // reference to f2 is ambiguous
    // both method f2(float,Character...) in OverloadingVarargs and method f2(Character...) in OverloadingVarargs match
    // f2('a', 'b');

    System.out.println();
    f3(1, 'a');
    f3('a', 'b');

    System.out.println();
    for (String arg: args) {
      System.out.print(arg + " ");
    }
    System.out.println();
  }
}
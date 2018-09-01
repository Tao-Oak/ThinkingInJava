//
// Created by CaoTao, 2018/08/26
//
package com.thinkinginjava.chapter7.examples;

import static net.mindview.util.Print.*;

public class Flower {
  int petalCount = 0;
  String s = "initial value";

  Flower (int petals) {
    petalCount = petals;
    print("Constructor w/ int arg only, petalCount = " + petalCount);
  }

  Flower (String ss) {
    print("Constructor w/ String arg only, s = " + ss);
    s = ss;
  }

  Flower (String s, int petals) {
    this(petals);
    // this(s); // Can't call two!
    this.s = s;
    print("String & int args");
  }

  Flower () {
    this("hi", 47);
    print("Default constructors (no args)");
  }

  void printPetalCount () {
    // this(11);
    print("petalCount = " + petalCount + " s = " + s);
  }

  public static void main(String[] args) {
    Flower flower = new Flower();
    flower.printPetalCount();
  }
}
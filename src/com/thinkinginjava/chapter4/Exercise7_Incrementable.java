//
// Created by CaoTao, 20180818
//
package com.thinkinginjava.chapter4;

// Page 76-77: The static keyword

class StaticTest {
  static int i = 47;
}

class Incrementable {
  static void increment () {
    StaticTest.i++;
  }
}

public class Exercise7_Incrementable {
  public static void main(String[] args) {
    Incrementable sf = new Incrementable();
    sf.increment();

    Incrementable.increment();
    System.out.println("StaticTest.i = " + StaticTest.i);
  }
}
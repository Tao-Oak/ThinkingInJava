//
// Created by CaoTao, 2018/08/31
//
package com.thinkinginjava.chapter9.exercises;

class E5_A {
  E5_A() {
    System.out.println("E5_A constructor");
  }
}

class B {
  B() {
    System.out.println("B constructor");
  }
}

class C extends E5_A {
  @SuppressWarnings("unused")
  private B b = new B();
}

public class Exercise5_ {
  public static void main(String[] args) {
    new C();
  }
}
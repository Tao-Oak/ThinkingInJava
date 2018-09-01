//
// Created by CaoTao, 2018/08/27
//
package com.thinkinginjava.chapter7.examples;

import static net.mindview.util.Print.*;

class Cup {
  Cup (int marker) {
    print("Cup(" + marker + ")");
  }

  void f (int marker) {
    print("f(" + marker + ")");
  }
}

class Cups {
  static Cup cup1 = new Cup(1);
  static Cup cup2;
  static Cup cup4;
  static {
    cup2 = new Cup(2);
  }
  static Cup cup3 = new Cup(3);
  static {
    cup4 = new Cup(4);
  }

  Cups () {
    print("Cups()");
  }
}

public class ExplicitStatic {
  public static void main(String[] args) {
    print("Inside main()");
    Cups.cup1.f(99);
  }
  static Cups cups1 = new Cups();
  static Cups cups2 = new Cups();
}
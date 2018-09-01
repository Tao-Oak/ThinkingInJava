//
// Created by CaoTao, 2018/08/31
//
package com.thinkinginjava.chapter9.examples;

// Page 255
class Homer {
  char doh (char c) {
    System.out.println("doh(char c)");
    return 'd';
  }

  float doh (float f) {
    System.out.println("doh(float f)");
    return 1.0f;
  }
}

class Milhouse {}

class Bart extends Homer {
  void doh (Milhouse m) {
    System.out.println("doh(Milhouse m)");
  }
}

public class NameHiding {
  public static void main(String[] args) {
    Bart b = new Bart();
    b.doh(1);
    b.doh('x');
    b.doh(1.0f);
    b.doh(new Milhouse());
  }
}
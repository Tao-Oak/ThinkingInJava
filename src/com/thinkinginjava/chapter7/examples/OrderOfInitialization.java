//
// Created by CaoTao, 2018/08/27
//
package com.thinkinginjava.chapter7.examples;

import static net.mindview.util.Print.*;

class Window {
  Window (int marker) {
    print("Window(" + marker + ")");
  }
}

class House {
  Window w1 = new Window(1);
  House () {
    print("House()");
    w3 = new Window(33);
  }

  House (String name) {
    print("House(" + name + ")");
  }
  Window w2 = new Window(2);
  void f() {
    print("f()");
  }
  Window w3 = new Window(3);
  Window w4;
}

public class OrderOfInitialization {
  public static void main(String[] args) {
    House h = new House();
    h.f();
    print("--- ---");
    House h2 = new House("Bob's house");
    if (h2.w4 == null) {
      print("w4 is uninitialized");
    }
  }
}
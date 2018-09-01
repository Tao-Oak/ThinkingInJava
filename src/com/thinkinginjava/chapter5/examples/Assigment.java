//
// Created by CaoTao, 20180818
//
package com.thinkinginjava.chapter5.examples;

import static net.mindview.util.Print.*;

class Tank {
  int level;
}

// Type aliasing
public class Assigment {
  public static void main (String[] args) {
    Tank t1 = new Tank();
    Tank t2 = new Tank();
    t1.level = 9;
    t2.level = 47;
    print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
    t1 = t2;
    print("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
    t1.level = 27;
    print("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
  }
}
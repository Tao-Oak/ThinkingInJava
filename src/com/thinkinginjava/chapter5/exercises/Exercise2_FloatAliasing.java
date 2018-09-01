//
// Created by CaoTao, 20180819
//
package com.thinkinginjava.chapter5.exercises;

import static net.mindview.util.Print.*;

class FloatContainer {
  float value;
}

public class Exercise2_FloatAliasing {
  public static void main(String[] args) {
    FloatContainer f1 = new FloatContainer();
    FloatContainer f2 = new FloatContainer();
    f1.value = 0.1f;
    f2.value = 0.2f;
    print("1: f1.value: " + f1.value + ", f2.value: " + f2.value);
    f1 = f2;
    print("2: f1.value: " + f1.value + ", f2.value: " + f2.value);
    f1.value = 0.3f;
    print("3: f1.value: " + f1.value + ", f2.value: " + f2.value);
  }
}
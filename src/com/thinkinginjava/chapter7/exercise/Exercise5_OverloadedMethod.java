//
// Created by CaoTao, 2018/08/25
//
package com.thinkinginjava.chapter7.exercise;

class Dog {
  void bark () {
    System.out.println("default bark");
  }

  void bark (boolean value) {
    System.out.println("boolean bark");
  }

  void bark (byte value) {
    System.out.println("byte bark");
  }

  void bark (char value) {
    System.out.println("char bark");
  }

  void bark (short value) {
    System.out.println("short bark");
  }

  void bark (int value) {
    System.out.println("int bark");
  }

  void bark (long value) {
    System.out.println("long bark");
  }

  void bark (float value) {
    System.out.println("float bark");
  }

  void bark (double value) {
    System.out.println("double bark");
  }
}

public class Exercise5_OverloadedMethod {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.bark();
    dog.bark(false);
    dog.bark((byte)1);
    dog.bark('c');
    dog.bark((short)1);
    dog.bark(1);
    dog.bark(1L);
    dog.bark(1f);
    dog.bark(1d);
  }
}
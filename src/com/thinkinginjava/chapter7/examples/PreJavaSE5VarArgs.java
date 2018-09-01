//
// Created by CaoTao, 2018/08/27
//
package com.thinkinginjava.chapter7.examples;

class A3 {}
public class PreJavaSE5VarArgs {
  static void printArray(Object[] args) {
    for (Object obj: args) {
      System.out.print(obj + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    printArray(new Object[] {
      new Integer(47), new Float(3.14), new Double(11.11)
    });
    printArray(new Object[] { "one", "two", "three" });
    printArray(new Object[] { new A3(), new A3(), new A3() });
  }
}
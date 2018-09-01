//
// Created by CaoTao, 2018/08/27
//
package com.thinkinginjava.chapter7.examples;

public class MethodInit {
  // Cannot reference a field before it it defined
  // int k = g(i);
  int i = f();
  int j = g(i);

  int f() { return 11; }
  int g(int n) { return n * 10; }

  public static void main(String[] args) {
    MethodInit obj =  new MethodInit();
    System.out.println("obj.i: " + obj.i);
    System.out.println("obj.j: " + obj.j);
  }
}
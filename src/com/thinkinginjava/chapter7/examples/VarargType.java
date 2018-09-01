//
// Created by CaoTao, 2018/08/27
//
package com.thinkinginjava.chapter7.examples;

class A2 {}
public class VarargType {
  static void f (Character... args) {
    System.out.print(args.getClass());
    System.out.println(" length " + args.length);
  }

  static void g (int... args) {
    System.out.print(args.getClass());
    System.out.println(" length " + args.length);
  }

  static void h (Object... args) {
    System.out.print(args.getClass());
    System.out.println(" length " + args.length);
    for (Object obj: args) {
      System.out.print(obj + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    f('a');
    f();
    h(
      new Character[]{'a', 'b', 'c'},
      new Character[]{'a', 'b', 'c'},
      new A2[] { new A2() }
    );
    g(1);
    g();
    System.out.println("int[]: " + new int[0].getClass());
    System.out.println(new A2[] { new A2() });
    System.out.println(new A2());
  }
}
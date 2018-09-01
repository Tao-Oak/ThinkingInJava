//
// Created by CaoTao, 2018/08/23
//
package com.thinkinginjava.chapter7.examples;

import static net.mindview.util.Print.*;

// Page 161
public class PrimitiveOverloading {
  void f1(char x) { printnb("f1(char x) "); }
  void f1(byte x) { printnb("f1(byte x) "); }
  void f1(short x) { printnb("f1(short x) "); }
  void f1(int x) { printnb("f1(int x) "); }
  void f1(long x) { printnb("f1(long x) "); }
  void f1(float x) { printnb("f1(float x) "); }
  void f1(double x) { printnb("f1(double x) "); }

  void f2(byte x) { printnb("f2(byte x) "); }
  void f2(short x) { printnb("f2(short x) "); }
  void f2(int x) { printnb("f2(int x) "); }
  void f2(long x) { printnb("f2(long x) "); }
  void f2(float x) { printnb("f2(float x) "); }
  void f2(double x) { printnb("f2(double x) "); }

  void f3(short x) { printnb("f3(short x) "); }
  void f3(int x) { printnb("f3(int x) "); }
  void f3(long x) { printnb("f3(long x) "); }
  void f3(float x) { printnb("f3(float x) "); }
  void f3(double x) { printnb("f3(double x) "); }

  void f4(int x) { printnb("f4(int x) "); }
  void f4(long x) { printnb("f4(long x) "); }
  void f4(float x) { printnb("f4(float x) "); }
  void f4(double x) { printnb("f4(double x) "); }

  void f5(long x) { printnb("f5(long x) "); }
  void f5(float x) { printnb("f5(float x) "); }
  void f5(double x) { printnb("f5(double x) "); }

  void f6(float x) { printnb("f6(float x) "); }
  void f6(double x) { printnb("f6(double x) "); }

  void f7(double x) { printnb("f7(double x) "); }

  // int -> long -> float -> double
  void testConstantValue() {
    printnb("5: ");
    f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);
    print();
  }

  // char -> int -> long -> float -> double
  void testChar() {
    char x = 'x';
    printnb("char: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    print();
  }

  // byte -> short -> int -> long -> float -> double
  void testByte() {
    byte x = 0;
    printnb("byte: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    print();
  }

  // short -> int -> long -> float -> double
  void testShort() {
    short x = 0;
    printnb("short: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    print();
  }

  // int -> long -> float -> double
  void testInt() {
    int x = 0;
    printnb("int: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    print();
  }

  // long -> float -> double
  void testLong(long x) {
    printnb("long: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    print();
  }

  // float -> double
  void testFloat() {
    float x = 0;
    printnb("float: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    print();
  }

  void testDouble() {
    double x = 0;
    printnb("double: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    print();
  }

  public static void main(String[] args) {
      PrimitiveOverloading obj = new PrimitiveOverloading();
      obj.testConstantValue();
      obj.testChar();
      obj.testByte();
      obj.testShort();
      obj.testInt();
      obj.testLong(0);
      obj.testLong(Long.MAX_VALUE);
      obj.testFloat();
      obj.testDouble();

      if (Float.MAX_VALUE > Long.MAX_VALUE) {
        System.out.println("Float.MAX_VALUE > Long.MAX_VALUE");
      }
  }
}
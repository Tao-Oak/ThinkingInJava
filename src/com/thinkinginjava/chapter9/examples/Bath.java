//
// Created by CaoTao, 2018/08/30
//
package com.thinkinginjava.chapter9.examples;

// Page 239

class Soap {
  private String s;
  Soap() {
    System.out.println("Soap()");
    s = "Constructed";
  }

  @Override
  public String toString() {
    return s;
  }
}

public class Bath {
  private String s1 = "Happy", s2 = "Happy", s3, s4;
  private Soap castille;
  private int i;
  private float toy;

  public Bath() {
    System.out.println("Inside Bath()");
    s3 = "joy";
    toy = 3.14f;
    castille = new Soap();
  }

  {
    i = 47;
  }

  @Override
  public String toString() {
    if (s4 == null) s4 = "joy";
    return "s1 = " + s1 + " " +
      "s2 = " + s2 + " " +
      "s3 = " + s3 + " " +
      "s4 = " + s4 + " " +
      "i = " + i + " " + "toy = " + toy + " " +
      "castille = " + castille;
  }

  public static void main(String[] args) {
    Bath b = new Bath();
    System.out.println(b);
  }
}
//
// Created by CaoTao, 2018/08/30
//
package com.thinkinginjava.chapter9.examples;

// Page 244
class Art {
  Art() {
    System.out.println("Art constructor");
  }
}

class Drawing extends Art {
  Drawing() {
    System.out.println("Drawing constructor");
  }
}

public class Cartoon extends Drawing {
  // public Cartoon() {
  //   System.out.println("Cartoon constructor");
  // }

  public static void main(String[] args) {
    new Cartoon();
  }
}
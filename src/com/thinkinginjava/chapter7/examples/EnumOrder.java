//
// Created by CaoTao, 2018/08/28
//
package com.thinkinginjava.chapter7.examples;

enum Spiciness {
  NOT, MILD, MEDIUM, HOT, FLAMING
}

public class EnumOrder {
  public static void main(String[] args) {
    for (Spiciness spic: Spiciness.values()) {
      System.out.println(spic + ", ordinal " + spic.ordinal());
    }
  }
}
//
// Created by CaoTao, 2018/08/30
//
package com.thinkinginjava.chapter9.exercises;

class Cleanser {
  private String s = "Cleanser";

  public void append(String a) {
    s += " " + a;
  }

  public void dilute() {
    append("dilute()");
  }

  public void apply() {
    append("apply()");
  }

  public void scrub() {
    append("scrub()");
  }

  @Override
  public String toString() {
    return s;
  }

  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute();
    x.apply();
    x.scrub();
    System.out.println(x);
  }
}

class Detergent extends Cleanser {
  @Override
  public void scrub() {
    append("Detergent.scrub()");
    super.scrub();
  }

  public void foam() {
    append("foam()");
  }

  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    System.out.println(x);
    System.out.println("Testing base class");
    Cleanser.main(args);
  }
}

public class Exercise2_InheritDetergent extends Detergent {
  @Override
  public void scrub() {
    append("Exercise2_InheritDetergent.scrub()");
    super.scrub();
  }

  public void sterilize() {
    append("sterilize(");
  }

  public static void main(String[] args) {
    Exercise2_InheritDetergent x = new Exercise2_InheritDetergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    x.sterilize();
    System.out.println(x);
    System.out.println("Testing Detergent class");
    Detergent.main(args);
  }
}
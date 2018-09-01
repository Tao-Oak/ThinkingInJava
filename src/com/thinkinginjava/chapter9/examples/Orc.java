//
// Created by CaoTao, 2018/08/31
//
package com.thinkinginjava.chapter9.examples;

// Page 259
class Villain {
  private String name;
  protected void set(String nm) {
    name = nm;
  }

  public Villain(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "I'm a Villian and my name is " + name;
  }
}

public class Orc extends Villain {
  private int orcNumber;

  public Orc(String name, int orcCount) {
    super(name);
    this.orcNumber = orcCount;
  }

  public void change(String name, int orcNumber) {
    set(name);
    this.orcNumber = orcNumber;
  }

  public String toString() {
    return "Orc " + orcNumber + ": " + super.toString();
  }

  public static void main(String[] args) {
    Orc orc = new Orc("Limburger", 12);
    System.out.println(orc);
    orc.change("Bob", 19);
    System.out.println(orc);
  }
}
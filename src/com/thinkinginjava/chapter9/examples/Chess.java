//
// Created by CaoTao, 2018/08/31
//
package com.thinkinginjava.chapter9.examples;

// Page 245

class Game {
  Game(int i) {
    System.out.println("Game constructor");
  }
}

class BoardGame extends Game {
  public String name = "BoardGame";
  BoardGame(int i) {
    super(i);
    System.out.println("BoardGame constructor " + name);
  }
}

public class Chess extends BoardGame {
  public String name = "Chess";
  Chess() {
    super(11);
    System.out.println("Chess constructor " + name + " " + super.name);
  }

  public static void main(String[] args) {
    new Chess();
  }
}
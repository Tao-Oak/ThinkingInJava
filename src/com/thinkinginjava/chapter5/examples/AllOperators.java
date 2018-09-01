//
// Created by CaoTao, 2018/08/22
//
package com.thinkinginjava.chapter5.examples;

public class AllOperators {
  void f(boolean b) {}

  void boolTest (boolean x, boolean y) {
    // Arithmetic operators
    //! x = x * y;
    //! x = x / y;
    //! x = x % y;
    //! x = x + y;
    //! x = x - y;
    //! x = +y;
    //! x = -y;
    // error: bad operand type boolean for unary operator '++'
    //! x++;
    //! x--;

    // Relational and logical
    //! if (x > y);
    //! if (x >= y);
    //! if (x < y);
    //! if (x <= y);
    f(x == y);
    f(x != y);
    f(!y);
    x = x && y;
    x = x || y;

    //Bitwise operators
    //! x = ~y;
    x = x & y;
    x = x | y;
    x = x ^ y;
    //! x = x << 1;
    //! x = x >> 1;
    //! x = x >>> 1;

    // Compound assignment
    //! x += y;
    //! x -= y;
    //! x *= y;
    //! x /= y;
    //! x %= y;
    //! x <<= y;
    //! x >>= y;
    //! x >>>= y;
    x &= y;
    x |= y;
    x ^= y;

    // Casting
    // error: incompatible types: boolean cannot be converted to xxx
    //! char c = (char)x;
    //! byte b = (byte)x;
    //! short s = (short)x;
    //! int i = (int) x;
    //! long l = (long)x;
    //! float f = (float)x;
    //! double d = (double)x;
  }

  void charTest (char x, char y) {
    // Arithmetical operators
    x = (char)(x * y);
    x = (char)(x / y);
    x = (char)(x % y);
    x = (char)(x + y);
    x = (char)(x - y);
    x++;
    x--;
    x = (char)+y;
    x = (char)-y;

    // Relational and logical
    f(x > y);
    f(x >= y);
    f(x < y);
    f(x <= y);
    f(x != y);
    f(x == y);
    //! f(!x);
    //! f(x && y);
    //! f(x || y);

    // Bitwise operators
    x = (char)~y;
    x = (char)(x & y);
    x = (char)(x | y);
    x = (char)(x ^ y);
    x = (char)(x << 1);
    x = (char)(x >> 1);
    x = (char)(x >>> 1);

    // Compound assigment
    x += y;
    x -= y;
    x *= y;
    x /= y;
    x <<= 1;
    x >>= 1;
    x >>>= 1;
    x &= y;
    x ^= y;
    x |= y;

    // Casting
    // error: incompatible types: char cannot be converted to boolean
    //! boolean bl = (boolean)x;
    byte b = (byte)x;
    short s = (short)x;
    int i = (int)x;
    long l = (long)x;
    float f = (float)x;
    double d = (double)x;
  }

  void intTest (int x, int y) {
    // Arithmetic operators
    x = x * y;
    x = x / y;
    x = x % y;
    x = x + y;
    x = x - y;
    x++;
    x--;
    x = +y;
    x = -y;

    // Relational and logical
    f(x > y);
    f(x >= y);
    f(x < y);
    f(x <= y);
    f(x == y);
    f(x != y);
    //! f(!x);
    //! f(x && y);
    //! f(x || y);

    // Bitwise operators
    x = ~y;
    x = x & y;
    x = x | y;
    x = x ^ y;
    x = x << y;
    x = x >> y;
    x = x >>> y;

    // Compound assignment
    x += y;
    x -= y;
    x *= y;
    x /= y;
    x %= y;
    x <<= 1;
    x >>= 1;
    x >>>= 1;
    x &= y;
    x |= y;
    x ^= y;

    // Casting
    //! boolean bl = (boolean)x;
    char c = (char)x;
    byte b = (byte)x;
    short s = (short)x;
    long l = (long)x;
    float f = (float)x;
    double d = (double) x;
  }

  public static void main(String[] args) {
    AllOperators obj = new AllOperators();
    obj.boolTest(false, true);
    obj.charTest('x', 'y');
    obj.intTest(1, 2);
  }
}
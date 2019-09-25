package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorial {

  public static BigInteger fact(Integer n) {
    return (n <= 1 ? BigInteger.ONE : fact(n - 1).multiply(BigInteger.valueOf(n)));
  }


}

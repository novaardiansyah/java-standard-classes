package standard.classes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    BigInteger bigInteger1 = new BigInteger("1234567890123456789012345678901234567890");
    BigInteger bigInteger2 = new BigInteger("1234567890123456789012345678901234567890");
    BigInteger result = bigInteger1.add(bigInteger2);

    System.out.println("bigInteger = " + bigInteger1);
    System.out.println("Result = " + result);

    BigDecimal bigDecimal1 = new BigDecimal("12345678901.23456789012345678901234567890");
    BigDecimal bigDecimal2 = new BigDecimal("123456789.0123456789012345678901234567890");
    BigDecimal result2 = bigDecimal1.add(bigDecimal2);

    System.out.println("bigDecimal = " + bigDecimal1);
    System.out.println("Result = " + result2);
  }
}

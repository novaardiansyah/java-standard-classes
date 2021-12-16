package standard.classes;

public class NumberApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    // ? convert from one data type number to another
    Integer intValue = 1000;
    Long longValue = intValue.longValue();
    Double doubleValue = longValue.doubleValue();
    Float floatValue = doubleValue.floatValue();
    Short shortValue = floatValue.shortValue();
    Byte byteValue = shortValue.byteValue();

    System.out.println(byteValue);

    // ? convert from string to number
    String strValue = "1000";
    Integer intValue1 = Integer.valueOf(strValue);
    System.out.println(intValue1);
  }
}

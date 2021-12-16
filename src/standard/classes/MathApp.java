package standard.classes;

public class MathApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    int max = Math.max(1000, 2000);
    System.out.println("max = " + max);

    int min = Math.min(1000, 2000);
    System.out.println("min = " + min);

    Double decimals = 21.3;
    System.out.println("Ceil = " + Math.ceil(decimals));
    System.out.println("Floor = " + Math.floor(decimals));

  }
}

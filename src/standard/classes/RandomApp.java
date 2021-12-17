package standard.classes;

import java.util.Random;

public class RandomApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    Random random = new Random();
    for (var i = 0; i < 10; i++) {
      System.out.println(random.nextInt(1000));
    }
  }
}

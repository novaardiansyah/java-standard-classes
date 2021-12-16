package standard.classes;

import java.util.UUID;

public class UuidApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    for (var i = 0; i < 10; i++) {
      System.out.println(UUID.randomUUID().toString());
    }
  }
}

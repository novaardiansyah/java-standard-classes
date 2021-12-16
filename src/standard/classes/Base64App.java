package standard.classes;

import java.util.Base64;

public class Base64App {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    String fullName = "John Doe (Acme Inc.)";
    String encoded = Base64.getEncoder().encodeToString(fullName.getBytes());
    String decoded = new String(Base64.getDecoder().decode(encoded));

    System.out.println(encoded);
    System.out.println(decoded);
  }
}

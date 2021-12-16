package standard.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    String fullName = "John Doe Khan";

    StringTokenizer tokenizer = new StringTokenizer(fullName, " ");

    while (tokenizer.hasMoreTokens()) {
      String result = tokenizer.nextToken();
      System.out.println(result);
    }
  }
}

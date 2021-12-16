package standard.classes;

// Importing required classes
import java.util.StringJoiner;

public class StringJoinerApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    String[] words = { "Hello", "World" };
    StringJoiner joiner = new StringJoiner(", ", "[", "]");
    for (String word : words) {
      joiner.add(word);
    }

    System.out.println(joiner.toString());
  }
}
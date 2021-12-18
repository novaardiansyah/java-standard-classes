package standard.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    String fullname = "John Doe Kim Rhodes";

    Pattern pattern = Pattern.compile("[a-zA-z]*[o][a-zA-z]*");
    Matcher matcher = pattern.matcher(fullname);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}

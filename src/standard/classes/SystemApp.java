package standard.classes;

public class SystemApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    System.out.println("current time (millis): " + System.currentTimeMillis());

    System.out.println("current time (nano): " + System.nanoTime());

    System.out.println("Home Environment: " + System.getenv("HOME"));
  }
}

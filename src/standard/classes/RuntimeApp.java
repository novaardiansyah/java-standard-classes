package standard.classes;

public class RuntimeApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    Runtime rt = Runtime.getRuntime();

    System.out.println(rt.availableProcessors());
    System.out.println(rt.freeMemory());
    System.out.println(rt.totalMemory());
    System.out.println(rt.maxMemory());

  }
}
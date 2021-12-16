package standard.classes;

import java.util.Scanner;

public class ScannerApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    scanner.close();

    System.out.println("You entered: " + number);
  }
}

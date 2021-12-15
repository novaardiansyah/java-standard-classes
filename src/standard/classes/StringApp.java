package standard.classes;

public class StringApp {
  public static void main(String[] args) {
    System.out.println(""); // ? newline

    String fullName = "John Leo Khan";
    String fullNameLower = fullName.toLowerCase();
    String fullNameUpper = fullName.toUpperCase();

    System.out.println("Original name: " + fullName);
    System.out.println("Lowercase name: " + fullNameLower);
    System.out.println("Uppercase name: " + fullNameUpper);

    System.out.println(""); // ? Newline

    System.out.println("Length of name: " + fullName.length());
    System.out.println("First Is John: " + fullName.startsWith("John"));
    System.out.println("Last Is Khan: " + fullName.endsWith("Khan"));

    System.out.println(""); // ? Newline

    String[] names = fullName.split(" ");
    for (var name : names) {
      System.out.println("Name: " + name);
    }
  }
}

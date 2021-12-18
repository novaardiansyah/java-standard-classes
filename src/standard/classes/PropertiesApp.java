package standard.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    // ? Get the properties file
    try {
      Properties properties = new Properties();
      properties.load(new FileInputStream("Application.properties"));

      System.out.println(properties.getProperty("database.host"));
      System.out.println(properties.getProperty("database.port"));
      System.out.println(properties.getProperty("database.user"));
      System.out.println(properties.getProperty("database.password"));

    } catch (FileNotFoundException fileNotFoundException) {
      System.out.println(fileNotFoundException.getMessage());
    } catch (IOException ioException) {
      System.out.println(ioException.getMessage());
    }

    // ? Put the properties file
    try {
      Properties properties = new Properties();
      properties.put("name.first", "John");
      properties.put("name.last", "Doe");
      properties.put("age", "30");

      properties.store(new FileOutputStream("User.properties"), "User Information");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

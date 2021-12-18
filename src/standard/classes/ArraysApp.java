package standard.classes;

import java.util.Arrays;

public class ArraysApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    int[] numbers = { 1, 10, 2, 9, 7, 3, 6, 8, 4, 5 };

    // * Sort the array
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));

    // * Search for a value
    System.out.println(Arrays.binarySearch(numbers, 3));

    // * Copy an array
    int[] copy = Arrays.copyOf(numbers, numbers.length);
    System.out.println(Arrays.toString(copy));
  }
}

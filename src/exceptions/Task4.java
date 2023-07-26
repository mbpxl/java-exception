package exceptions;

import java.util.Scanner;

public class Task4 {
  public static void emptyStringCheck() {
    String str;

    System.out.print("Input: ");
    Scanner scanner = new Scanner(System.in);
    str = scanner.nextLine();
    if (str.isEmpty()) {
      throw new IllegalArgumentException("Input empty string isn't permitted");
    } else {
      System.out.println("Nice");
    }

  }
}

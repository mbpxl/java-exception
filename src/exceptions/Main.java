package exceptions;

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println(numRequest());
  }

  public static float numRequest() {
    float num = 0;
    boolean bool = false;
    while (!bool) {
      System.out.print("Введите дробное число (тип double): ");
      Scanner scanner = new Scanner(System.in);
      try {
        num = Float.parseFloat(scanner.next());
        System.out.println();
        bool = true;
      } catch (NumberFormatException e) {
        System.err.println("Input data isn't float! Retry in 3.. 2.. 1.. :");
        num = 0;
      }
    }
    return num;
  }
}
package exercise4;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class MinIndex {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter size: ");
    int size = input.nextInt();

    double[] numbers = new double[size];

    System.out.println("Enter numbers: ");
    for (int index = 0; index < numbers.length; index++) {
      numbers[index] = input.nextDouble();
    }

    int minIndex = 0;
    for (int index = 1; index < numbers.length; index++) {
      if (numbers[index] < numbers[minIndex]) {
        minIndex = index;
      }
    }
    System.out.println("Min index: " + minIndex);
  }
}
package exercise4;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class MaxElement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter size: ");
    int size = input.nextInt();
    
    float arr[] = new float[size];
    float max = -100;
    for (int i = 0; i < arr.length; i++) {
      arr [i] = input.nextFloat();
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    System.out.println("Max number: " + max);

  }
}
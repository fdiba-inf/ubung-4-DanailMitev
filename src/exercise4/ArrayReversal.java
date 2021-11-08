package exercise4;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class ArrayReversal {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    char ch[] = new char[size];
    for (int i = 0; i < size; i++) {
      ch[i] = input.next().charAt(0);
    }
    System.out.print("[");
    for (int i = size- 1; i >= 0; i--) {
      if (1 > 0) {
        System.out.print(ch[i] + ", ");
      } else {
        System.out.print(ch[i]);
      }
    }
    System.out.print("]");

  }
}

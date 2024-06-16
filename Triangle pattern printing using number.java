import java.util.*;
public class Main {

  public static void main(String[] args) {
    int rows, k = 0, count = 0, count1 = 0;
    Scanner input=new Scanner(System.in);
    r=input.nextInt();
    for (int i = 1; i <= r; ++i) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
        ++count;
      }

      while (k != 2 * i - 1) {
        if (count <= r - 1) {
          System.out.print((i + k) + " ");
          ++count;
        } else {
          ++count1;
          System.out.print((i + k - 2 * count1) + " ");
        }

        ++k;
      }
      count1 = count = k = 0;

      System.out.println();
    }
  }
}

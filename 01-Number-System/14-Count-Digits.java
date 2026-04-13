// Problem: Count number of digits in a number
// Concept: Divide number by 10 repeatedly until it becomes 0
// Time Complexity: O(d) ≈ O(log n)
// Space Complexity: O(1)


import java.util.*;

public class CountDigits{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Number: ");

    int n = sc.nextInt();
    int count = 0;

    if(n == 0){
      count = 1;
    } else {
      n = Math.abs(n);  // handle negative numbers

      while(n > 0){
        n = n / 10;
        count++;
      }
    }

    System.out.println(count);
    sc.close();
  }
}

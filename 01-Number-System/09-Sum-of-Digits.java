// Problem: Find sum of digits of a number
// Concept: Use modulo (%) to extract digits and division (/) to remove digits
// Time Complexity: O(d) ≈ O(log n)
// Space Complexity: O(1)

import java.util.*;

public class SumOfDigits {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = 0;

    while(n > 0){
      sum += n % 10;  // get last digit
      n = n / 10;     // remove last digit
    }

    System.out.println("Sum of digits: " + sum);
  }
}

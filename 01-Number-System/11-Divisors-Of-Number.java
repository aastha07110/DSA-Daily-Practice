// Problem: Find all divisors of a number
// Concept: Loop till square root and use divisor pairs (i and n/i)
// Time Complexity: O(√n)
// Space Complexity: O(1)

import java.util.*;

public class DivisorsOfNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Number: ");
    int n = sc.nextInt();

    System.out.println("Divisors of " + n + ":");

    for(int i = 1; i * i <= n; i++){
      if(n % i == 0){
        System.out.print(i + " ");

        if(i != n / i){
          System.out.print(n / i + " ");
        }
      }
    }

    sc.close();
  }
}

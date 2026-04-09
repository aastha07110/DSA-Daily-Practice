// Problem: Check whether a number is a Perfect Number
// Concept: Sum all proper divisors (excluding the number itself)
// Time Complexity: O(n)
// Space Complexity: O(1)


import java.util.*;

public class PerfectNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int sum = 0;

    for(int i = 1; i <= n/2; i++){
      if(n%i == 0){
        sum = sum + i;
      }
    }
    if(sum == n){
      System.out.println(n + " is perfect");
    } else{
      System.out.println(n + " is not perfect");
    }
    sc.close();
  }
}

// Problem: Find GCD (Greatest Common Divisor) of two numbers
// Concept: Euclidean Algorithm using modulo (%) and loop
// Time Complexity: O(log(min(a,b)))
// Space Complexity: O(1)


import java.util.*;

public class GCD{
  static int gcd(int a, int b){
    while(b!=0){
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(gcd(a,b));
  }
}

// Problem: Find LCM (Least Common Multiple) of two numbers
// Concept: Use relation LCM(a,b) = (a*b) / GCD(a,b)
// Time Complexity: O(log(min(a,b))) (because of GCD inside)
// Space Complexity: O(1)


import java.util.*;

public class LCM{
  static int gcd(int a, int b){
    while(b!=0){
      int temp = b;
      b = a%b;
      a = temp;
    }
    return a;
  }

  static int lcm(int a, int b){
    return (a * b)/gcd(a,b);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(lcm(a,b));
  }
}

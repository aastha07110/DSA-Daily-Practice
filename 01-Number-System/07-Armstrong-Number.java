// Problem: Check if number is Armstrong
// Concept: Extract digits using modulo (%) and raise to power of number of digits
// Time Complexity: O(d) = O(logn)
// Space Complexity: O(1)

import java.util.*;

public class ArmstrongNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n, sum = 0;

    while(n>0){
      int d = n%10;
      sum += Math.pow(d, digits);
      n/=10;
    }
    System.out.println(temp==sum?" Armstrong ":" Not Armstrong");
  }
}

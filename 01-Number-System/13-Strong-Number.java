// Problem:
// Concept: 
// Time Complexity:
// Space Complexity:


import java.util.*;

public class StrongNumber{
  static int factorial(int n){
    int fact = 1;
    if(n==0) return 1;

    for(int i = 1; i<= n; i++){
      fact = fact*i;
    }
    return fact;
  }

  static boolean isStrong(int num){
    int temp = num;
    int sum = 0;

    while(temp>0){
      int digit = temp%10;
      sum = sum + factorial(digit);
      temp = temp/10;
    }
    return sum == num;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if(isStrong(n))
      System.out.println(n + " strong");
    else
      System.out.println()n + " not strong");
  }
}

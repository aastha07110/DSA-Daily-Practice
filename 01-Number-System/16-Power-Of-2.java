// Problem:
// Concept:
// Time Complexity:
// Space Complexity:


import java.util.*;

public class PowerOf2{
  static boolean isPowerOfTwo(int n){
    if(n<=0)return false;

    while(n%2==0){
      n=n/2;
    }
    return n==1;
  }
  public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    System.out.println(n + (isPowerOfTwo(n)? "Yes":"No");
  }
}

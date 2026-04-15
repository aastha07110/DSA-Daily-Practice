// Problem: Check if a number is a power of 2
// Concept: Keep dividing by 2 until number becomes 1 or not divisible
// Time Complexity: O(log n)
// Space Complexity: O(1)


import java.util.*;

public class PowerOf2{
  static boolean isPowerOfTwo(int n){
    if(n <= 0) return false;

    while(n % 2 == 0){
      n = n / 2;
    }

    return n == 1;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    System.out.println(n + (isPowerOfTwo(n) ? " is Power of 2" : " is NOT Power of 2"));

    sc.close();
  }
}

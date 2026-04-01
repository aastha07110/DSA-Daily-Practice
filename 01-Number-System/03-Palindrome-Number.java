// Problem: Check whether a number is palindrome or not
// Concept: Reverse number using loop, modulo (%) and division (/)
// Time Complexity: O(d) where d = number of digits
// Space Complexity: O(1)


import java.util.*;

public class PalindromeNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), temp = n, rev = 0;
    while(n>0){
      rev = rev * 10 + n % 10;
      n/=10;
    }
    System.out.println(temp == rev? " Palindrome ": " Not Palindrome ");
  }
}

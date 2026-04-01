//Problem: Reverse digits of a number
//Concept: Use modulo (%) to extract digits and division (/) to remove digits in a loop
//Time Complexity: O(d) where d = number of digits
//Space Complexity: O(1)

import java.util.*;

public class ReverseDigits{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), rev = 0;

    while(n>0){
      rev = rev * 10 + n % 10;
      n = n/10;
    }
    System.out.println("Reversed number: " + rev);
  }
}

// Probelem: Check Even/Odd Without Modulus
//Concept: Use bitwise AND (&) to check last bit (LSB)
//Time Complexity: O(1)
//Space Complexity: O(1)

import java.util.*;

public class EvenOddWithoutModulus{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println((n&1)==0?"Even":"Odd");
  }
}

// Problem: Swap two numbers without using a third variable
// Concept: Use arithmetic operations (addition and subtraction)
// Time Complexity: O(1)
// Space Complexity: O(1)


import java.util.*;

public class SwapNumbers{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("Before swap = a = " + a + ", b = " + b);

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("After swap: a = " + a + ", b = " + b);
  }
}

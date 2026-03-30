// Problem: Check whether a number is prime or not
// Concept: Loop + Square Root Optimization

import java.util.*;


public class PrimeNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    boolean isPrime = true;

    
    if(n <= 1) isPrime = false;
    else if(n==2) isPrime = true;
    else if(n % 2 == 0) isPrime = false;
    else{
      for(int i = 3; i*i <= n; i=i+2){
        if(n%i == 0){
          isPrime = false;
          break;
        }
      }
    }
    System.out.println(n + (isPrime? " is Prime ":" is not Prime "));
  }
}

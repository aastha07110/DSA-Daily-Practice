// Problem: 
// Concept: 
// Time Complexity:
// Space Complexity: 


import java.util.*;

public class DivisorsOfNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Number: ");
    int n = sc.nextInt();
    System.out.println("Divisors of " + n + ":");

    for(int i = 1; i <= n; i++){
      if(n%i==0){
        System.out.println(i + " ");
        if(i!=n/i){
          System.out.println((n/i) + " ");
        }
      }
    }
    sc.close();
  }
}

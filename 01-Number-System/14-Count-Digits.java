// Problem:
// Concept: 
// Time Complexity:
// Space Complexity:


import java.util.*;

public class CountDigits{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Number: ");
    
    int n = sc.nextInt();

    int count = 0;
    int temp = n;

    if(n == 0){
      count = 1;
    } else {
      if(n<0){
        n == n;
      }
      while(n>0){
        n=n/10;
        count;
      }
    }
    System.out.println(count);
  }
}

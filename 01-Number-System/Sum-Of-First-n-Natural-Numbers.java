// Problem: To find the sum of First n Natural numbers
// Concept: Use a loop to add numbers from 1 to n
// Time Complexity: O(n)
// Space Complexity: O(1)


import java.util.Scanner;

public class SumOfFirstnNaturalNumbers{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int sum = 0;

    for(int i = 1; i <= n; i++){
      sum = sum+i;
    }
    System.out.println(sum);
    sc.close();
  }
}

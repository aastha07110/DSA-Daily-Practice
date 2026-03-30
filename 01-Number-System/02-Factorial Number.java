// Problem: Find factorial of a number
// Concept: Recursion, Iterative

import java.util.*;

public class FactorialNumber {

    static int factorialIterative(int n){
        if(n < 0) {
            return -1;
        }

        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result * i;
        }
        return result;
    }

    static int factorialRecursive(int n){
        if(n < 0){
            return -1;
        }

        if(n == 0 || n == 1){
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int iterative = factorialIterative(n);
        int recursive = factorialRecursive(n);

        if(iterative == -1 || recursive == -1){
            System.out.println("Negative number not allowed");
        } else{
            System.out.println("Iterative: " + iterative);
            System.out.println("Recursive: " + recursive);
        }
    }
}

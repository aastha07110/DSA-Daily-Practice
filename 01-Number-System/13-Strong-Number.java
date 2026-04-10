// Problem:
// Concept: 
// Time Complexity:
// Space Complexity:


import java.util.*;

public class StrongNumber{
  static int factorial(int n){
    int fact = 1;

  if(n == 0) return 1;

  for(int i = 1; i<=n; i++){
    fact = fact*i;
  }
  return fact;
}
}

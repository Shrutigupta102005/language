package Recurrsion;

public class Factorial {
    public static void main(String[] args) {
       int n = 5;
         System.out.println(factorial(n));
       }
       static int factorial(int n){
         if(n==0){                  //base case
           return 1;
         }
         int fn = factorial(n-1);
         return n*fn;
       }
}

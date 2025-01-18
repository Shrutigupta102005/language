package Recurrsion;

public class NtoOne {
        public static void main(String[] args){
            int n =5;
    
            System.out.println(fact(5,1));
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        
        fun(n-1);
        System.out.println(n);
    }
    static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        int ans = pow(a,b-1);
        return a*ans;
    }

    // tailed recursion 
    // headed recursion 

    static int fact(int n,int ans){
        if(n==0){
            return ans;
        }
        return fact(n-1,ans*n);
    }
}

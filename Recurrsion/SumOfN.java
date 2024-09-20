package Recurrsion;

public class SumOfN {
    public int fun(int n){
        if(n==0){
            return 0;
        }
        return n+fun(n-1);

    }
    public static void main(String[] args) {
        SumOfN obj = new SumOfN();
        System.out.println(obj.fun(6));
        
    }
    
}

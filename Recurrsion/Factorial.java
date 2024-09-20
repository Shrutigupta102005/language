package Recurrsion;

public class Factorial {
    public int fun(int n){
        if(n==0){
            return 1;
        }
        return n*fun(n-1);

    }
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println(obj.fun(6));
        
    }
}

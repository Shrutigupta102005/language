package Recursion;

public class n_to_one {
    public static void main(String[] args){
        numbers(1,10);
    }
    static void numbers(int i ,int n){
        if(n<i){
            return;
        }
        System.out.println(n);
        numbers(i,n-1);


    }
}

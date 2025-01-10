package Recursion.Backtracking;

public class one_to_n {
    public static void main(String[] args){
        numbers(10,10);
    }
    static void numbers(int i,int n){
        if(i<1){
            return;
        }
        numbers(i-1,n);
        System.out.println(i);
    }
}

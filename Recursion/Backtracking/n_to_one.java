package Recursion.Backtracking;

public class n_to_one {
    public static void main(String[] args){
        num(1,10);
    }
    static void num(int i ,int n ){
        if(n<i){
            return;
        }
        num(i+1,n);
        System.out.println(i);
    }
}

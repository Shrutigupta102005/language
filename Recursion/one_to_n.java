package Recursion;

public class one_to_n {
    public static void main(String[] args){
        numbers(1,10);
    }
    static void numbers(int i , int n){
        if(i>n){
            return;
        }   
        else{
            System.out.println(i);
            numbers(i+1,n);
        }
    }
}

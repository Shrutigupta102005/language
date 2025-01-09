package Recursion;

public class namen {
    public static void main(String[] args){
        name(1,5);
    }
    static void name( int i , int n){
        if(i>n){
            return;
        }
        System.out.println("Shruti gupta");
        
        name(i+1,n);
    }
}

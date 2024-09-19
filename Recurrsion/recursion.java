package Recurrsion;

public class recursion {
     public void fun(){
        System.out.println(1); // recursion-  a function calling itself  
        fun();
     }
    public static void main(String[] args){
        recursion obj = new recursion();
        obj.fun();  // yaha per stackoverflow hu gaye ga kyuki fun() pura tuh call hu hi nahi paya hai bas agge chalta ja raha hai
    }
}

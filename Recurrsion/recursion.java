package Recurrsion;

public class recursion {
    int counter =0;
     public void fun(){
       
        if(counter==4)
            return;
        
        System.out.println(counter); 
        counter=counter+1;// recursion-  a function calling itself  
        fun();
        System.out.println("bye");
     }
    public static void main(String[] args){
        recursion obj = new recursion();
        obj.fun();  // yaha per stackoverflow hu gaye ga kyuki fun() pura tuh call hu hi nahi paya hai bas agge chalta ja raha hai
    }
}

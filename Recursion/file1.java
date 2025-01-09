package Recursion;
public class file1{
    public static void main(String[] args){
        fun();
    }

    static void fun(){
        System.out.println("Hello from file1");
        fun();
    }
}
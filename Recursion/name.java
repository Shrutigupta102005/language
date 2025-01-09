package Recursion;

public class name {
    static int count = 0;
    public static void main(String[] args){
        name();
    }
    static void name(){
        if(count == 5){
            return;
        }
        System.out.println("Shruti gupta");
        count++;
        name();
    }
}

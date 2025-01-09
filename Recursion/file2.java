package Recursion;

public class file2 {
    static int count = 0;  // Declare here as class variable
    
    public static void main(String[] args) {
        top();
    }
    
    static void top() {
        if(count == 8) {
            return;
        }
        System.out.println(count);
        count++;
        top();
    }
}
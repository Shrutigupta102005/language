package Stacks;  // Ensure this matches your folder structure
import java.util.Stack;  // Correct import

public class StackExample {  // Renamed class
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  // Correct Stack declaration
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        
        System.out.println(st.peek());  // Prints the top element (40)
    }
}

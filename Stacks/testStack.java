import java.util.Stack;

public class testStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(100);
        System.out.println(st.peek()); // Should print 100
    }
}

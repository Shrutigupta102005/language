import java.util.Stack;
public class Stack_creation {
    public static void main(String[] args){
        Stack <Integer> st = new Stack<>(); // default capacity 10 which cannot be changed 
        // lifo - last in first out 
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        st.push(90);
        st.push(100);
        st.push(20);
        //Add_Last(st,6);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.capacity());
        Add_Last(st,6);
        System.out.println(st);
        Stack_reverse(st,54);
        System.out.println(st);
        //without using extra stack --> use the approach of recurssion
        
    }
    public static void Add_Last(Stack<Integer> st,int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int x = st.pop();
        Add_Last(st,item);
        st.push(x);
    }
    public static void Stack_reverse(Stack<Integer> st,int item){
        if(st.isEmpty()){
            return;
        }
        int x = st.pop();
        Stack_reverse(st,item);
        Add_Last(st,x);
    }
}

import java.util.Stack;

public class leetcode87{
    public static void main(String[] args) {
        
    }
    public static void Largest_Histogram(int[] arr){
        Stack<Integer> st = new Stack<>();
        int ans = 0 ;
        for(int i =0; i <ans.length ; i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                int h = arr[st.pop()];
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = i+1;
            }else{
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        for(int i = 0 ; i <ans.length;i++){
            System.out.println(ans[i] + " ");
        }
    }
}
package oops;

import java.util.Stack;

public class Stack_span {
    public static void main(String[] args){
        int [] arr = {30, 35 , 40 ,38,35};
        Cal_Stack(arr);
    }
    public static void Cal_Stack(int[] arr){
        int [] ans = new int [arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i =0; i <ans.length ; i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
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

package Recurrsion;

public class First_occurence {
    public static void main(String[] args){
        int[] arr = { 2,3,4,5,56,6,7,5,6};
        int target = 5;
        int ans = foo(arr,target,0);
        System.out.println(ans);
    }
    static int foo(int[] arr , int target , int index){
        if(arr[index]== target){
            return index;
        }
        return foo(arr ,target ,index+1);
    }
}


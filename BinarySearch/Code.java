package BinarySearch;

public class Code {
    public static void main(String[] args) {
        int [] arr = {12,13,14,15,17,18,19};
        int target = 15 ;
        int rel = binarysearch(arr, target);
        System.out.println(rel);
        
    }
    static int binarysearch(int[] arr , int target){
        int s = 0;
        int e = arr.length-1;
        int m = s+(e-s)/2;
        while(s<=e){
            if(arr[m]<target){
                s = m-1;
            }
            else if(arr[m]>target){
                e = m-1;
            }
            else{
                return m ;
            }
        }
        return -1;
    }
}

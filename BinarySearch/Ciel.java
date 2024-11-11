package BinarySearch;

public class Ciel {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,7,8,9};
        int target = 5;
        int rel = ciel(arr, target);
        System.out.println(rel);
        
    }
    static int ciel(int[] arr , int target){
        int s = 0;
        int e = arr.length-1;

        if(arr.length==0){
            return -1 ;
        }
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m] == target){
                return arr[m];
            }
            else if(arr[m]>target){
                e=m-1;
            }
            else if(arr[m]<target){
                s=m+1;
            }
     }
     return arr[s]; // start or end ki value update hu rahi hai ...
    }
}

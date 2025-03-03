package Recurrsion.bracktrackin;

public class divide_and_conquer {
    public static void main(String[] args){
        int [] arr ={5,7,2,1,8,3,4};
        System.out.println(Partition(arr,0,arr.length-1));
    }
    public static int Partition(int[] arr , int si , int ei){
        int item = arr[ei];
        int idx = si ; 
        for(int i = si ; i <ei ; i++){
            if(arr[i] <= item){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp ;
                idx++ ;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
    
}



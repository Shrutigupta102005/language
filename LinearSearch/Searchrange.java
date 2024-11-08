package LinearSearch;

public class Searchrange {
    public static void main(String[] args) {
        int[] arr = {12,34,445,324,32,324,56,67,56,45,34,65,67,367,367,467,786};
        int target = 786;
        int start = 4;
        int end = 9;
        int rel = range(arr,target,start,end);
        System.out.println(rel);
    }
    // let the range in array to searched is from 4 to 9
    static int range(int[] arr, int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(target == arr[i]){
                return i ;
            }
        }
        return -1 ; // here -1 indicates element not found 
    }
}

package BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr ={0,10,5,2};
        // find the peak that is 7 
        // linear search -- time complexity is high
        int rel = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(rel<arr[i]){
                rel =arr[i];
            }
        }
        System.out.println(rel);
    }
}

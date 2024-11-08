package LinearSearch;

public class minimumnumber {
    public static void main(String[] args) {
        int[] arr ={12,34,45,435,233,55,43,5,3,53,53,5,9,5632,4,-7};
        int rel = search(arr);
        System.out.println(rel);
    }
    static int search(int[] arr ){
        int num = arr[0] ;
        
        for(int i =0;i<arr.length;i++){ // avoid using <= to overcome arrray out of bound error 
            if(arr[i]<num){
                num =arr[i];   
            }
        }
        return num;
    }
}

package LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class search2darray {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},
                      {3,64,5},
                      {6,7,8}};
        int target = 6 ; // search for row number as well as column number  
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr , int target){
        
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                if (target == arr[i][j]){
                    int[] rel ={i,j};
                    return rel;
                    
                }
            }
        }
        return new int[] {-1,-1};
    }
}

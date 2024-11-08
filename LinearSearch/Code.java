package LinearSearch;
public class Code{
    public static void main(String[] args){
       int[] nums ={12,34,5,54,65,75,65,453,54,7,565,544,5454,3,4346} ;
       int target = 0;
       int rel =linearsearch(nums, target);
       System.out.println(rel);
    }
    static int linearsearch(int[] nums,int target){
        if (nums.length == 0){
            return -1;
        }
        else{
            for(int i =0 ;i<=nums.length;i++){
                if (target==nums[i]){
                    return i;
                }
            }
        
        }
    return -1;

    }
}
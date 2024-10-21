package LinearSearch ;
public class Code{
    public static void main(String[] args){
        int[] nums = {23,3,4,445,65,67,454,6546,4,5,65,65,76,76,66,86,87,67,19};
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
        // linear search -- return the index if the item is found 
        static int linearSearch(int[] arr, int target) {
            if (arr.length == 0) {
                return -1;
            }
            // run a for loop
            for (int i = 0; i < arr.length; i++) {
                // check for element
                int element = arr[i];
                if (element == target) {
                    return i;
                }
            }
            // If the loop completes without finding the target, return -1
            return -1;
        }
    }
public class Array {
    public static void main(String[] args) {
        String cars[] = {"breeza","grand vitara","vaganar"};
        // to acces an element in java 
        System.out.println(cars[0]);
        //change an array element 
        cars[2] = "audi" ;
        System.out.println(cars[2]);
        // to find array lenght
        System.out.println(cars.length);
        // looping through an array
        for(int i = 0;i<cars.length;i++){
            System.out.println(i);

        }
        // looping through array with for each loop
        for (String j : cars){
            System.out.println(j);
        }
        //multi dimensional array
        // 2d array
        int nums[][] = {{1,2,3},{4,5,6}};
        System.out.println(nums[1][2]);
        //changing elements in 2d array 
        nums[1][2]=7;
        System.out.println(nums[1][2]);
        //looping through an elements in 2d array 
        for(int s=0;s<nums.length;s++){
            for(int h=0;h<nums[s].length;h++){
                System.out.println(nums[s][h]);
            }
        }

    }
}
// arrays are used to store multiple values in single variable
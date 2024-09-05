package array;

public class Array {
    public static void main(String[] args){
        //creating an interger array for that we have three ways 
        //1 declaration 
        //  memory allocation 
        int[] marks1;
        marks1 = new int[5];
        // 2 declaration + memmory allocation  
        int[] marks = new int[5];
        // storing values in  array element 
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 80;
        marks[4] = 90;
        //printing an array 
        System.out.println(marks[2]);

        // 3 declaration + intialisation 

        int [] marks3 = {11,34,56,78,34,23}; 
        System .out.println(marks3);
        /* output for above is this [I@4517d9a3
         * this means [ -- arrary
         *            I -- integer
         *             @ -- just a part of hash code 
         *            4517d9a3 --hexadecimal code
         */
        // array length
        System.out.println(marks.length);
        //displaying a array
    
       for(int i = 0; i<marks3.length;i++){
            System.out.print(marks3[i] + " "); //array traversal 
        }
        System.out.println();
        //displaying an array in reverse 
        for(int i = marks3.length-1; i>=0;i--){
            System.out.print(marks3[i] + " "); //array traversal 
        }
        // displaying using for each loop easier method 
        for(int i : marks3){
            System.out.print(i+ " ");
        }
        // rev of array from for each cannot be achived 

        
    }
}

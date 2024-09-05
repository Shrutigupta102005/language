package array;

public class CWD_assingment {
    public static void main(String[] args){
        ques1();
        ques3();
        ques4(); 
        ques5();
        ques6();
        ques7();
        ques8();

    }
    // create an array of 5 elements and give their sum
    static void ques1(){
      float[] num ={22f,33f,55f,66f,77f};
      float rel = 0;
      for(int i =0;i<num.length;i++){
        rel = rel +num[i];
      }
      System.out.println(rel);
    }

    static void ques2(){

    } 
// calculate avg marks from array
    static void ques3(){
        int [] marks = {12,34,56,23,45,23};
        int sum =0;
       
        for(int i = 0;i<marks.length;i++){
            sum = sum +marks[i];
        }
        int avg = sum/marks.length;
        System.out.println(avg);
        
    } 

    static void ques4(){
        int[][] array = new int[3][3];
        int[][] array2 = new int[3][3];
        int [][] array3 = new int[3][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[0][2] = 3;
        array2[1][0] = 4;
        array2[1][1] = 5;
        array2[1][2] = 6;
        array2[2][0] = 7;
        array2[2][1] = 8;
        array2[2][2] = 9;

        array3[0][0] = array[0][0]+array2[0][0];
        array3[0][1] = array[0][1]+array2[0][1];
        array3[0][2] = array[0][2]+array2[0][2];
        array3[1][0] = array[0][0]+array2[0][0];
        array3[1][1] = array[0][1]+array2[0][1];
        array3[1][2] = array[0][2]+array2[0][2];
        array3[2][0] = array[0][0]+array2[0][0];
        array3[2][1] = array[0][1]+array2[0][1];
        array3[2][2] = array[0][2]+array2[0][2];

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                System.out.print(array3[i][j] +" ");
            }
            System.out.println(" ");
        }
    } 
    // program for reversing an array
    static void ques5(){
        int [] array = {23,45,56,67,98};
        for(int i = array.length-1 ;i>=0;i--){
            System.out.print(array[i] + " ");
        }
    } 
    // program to find out max number from array
    static void ques6(){
        int[] array ={12,23,34,56,89,10100};
        int max = 0;
        for(int i = 0;i<array.length;i++){
            if (max < array[i]){
                 max = array[i];
            }
        }
        System.out.println(max);
        
    } 
     // program to find out minmum number from array
    static void ques7(){
        int[] array ={12,23,34,1,56,89,10100};
        int min = array[0];
        for(int i = 0;i<array.length;i++){
            if (min > array[i]){
                 min = array[i];
            }
        }
        System.out.println(min);
        
    } 
    // check whether an array is sorted or not
    static void ques8(){
        int[] array ={1,2,3,4};
        int min = array[0];
        boolean rel = true;
        for(int i = 0;i<array.length;i++){
            if (min > array[i]){
                rel = false;
                 
            }
           
        }
        if (rel ){
            System.out.println(" sorted array");
        }
        else{
            System.out.println(" not an sorted array");
        }
       
        
    } 
}

package ques_class;

public class SecondLargest {
    public static void main(String[] args){
        int[] a ={ 2,3,64, 76 ,32};
        int largest = a[0];
        for(int i = 0;i<a.length;i++){
            if (largest<a[i]){
                largest = a[i];
            }
        }
        // sl = secondlargest 
        int sl = -1;
        for (int i =0;i<a.length;i++){
        if (sl<a[i] && a[i]!=largest){
            sl = a[i];
        }
        }
        System.out.println(sl);
        System.out.println(largest );
        }
    }
        
    

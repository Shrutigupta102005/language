package ques_class;

public class trail {
    public static void main(String[] args) {
        int[] a = {2, 3, 64, 76, 32};
        
        // Find the smallest element
        int smallest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (smallest > a[i]) {
                smallest = a[i];
            }
        }

        // Find the second smallest element
        int ss = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != smallest && a[i] < ss) {
                ss = a[i];
            }
        }

        System.out.println("Second Smallest: " + ss);
        System.out.println("Smallest: " + smallest);
    }
}

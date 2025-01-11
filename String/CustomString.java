package String;

public class CustomString {
    public static void main(String[] args){
       String name = "Shruti Gupta"; // memory allocated in string pool inside heap
       String s2 = "Dhruv Gupta";
       String S3 = new String("Hello");
       String s4 = new String("bye"); // memory allocation in heap

       System.out.println(name);
       System.out.println(S3);

       System.out.println(name == s2);
       System.out.println(name == S3);
       System.out.println(name == s4);

       System.out.println(s2.length()); // this is function in array it was a attribute 

       // concatenation of two array 
       String S5 = S3+" " +s4;
       System.out.println(S5);

    }
}

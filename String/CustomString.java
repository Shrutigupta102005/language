package String;

public class CustomString {
    public static void main(String[] args){
    //    String name = "Shruti Gupta"; // memory allocated in string pool inside heap
    //    String s2 = "Dhruv Gupta";
    //    String S3 = new String("Hello");
    //    String s4 = new String("bye"); // memory allocation in heap

    //    System.out.println(name);
    //    System.out.println(S3);

    //    System.out.println(name == s2);
    //    System.out.println(name == S3);
    //    System.out.println(name == s4);

    //    System.out.println(s2.length()); // this is function in array it was a attribute 

    //    // concatenation of two array 
    //    String S5 = S3+" " +s4;
    //    System.out.println(S5);
    //    // method 2 
    //    String s6 = S3.concat(s4);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    //    System.out.println(S5);
                
    //    // methods
    //    System.out.println(s2==S3);
    //    System.out.println(s2.charAt(3));
    //    System.out.println(s2.equals(S3));


        boolean a=Compare("Shruti", "Shruti");
        System.out.println(a);
    }



    // creating our own equals method 

    static boolean Compare(String s1,String s2){
        if (s1==s2){
            return true;
        }
        if(s1.length()== s2.length()){
            for(int i =0 ; i<s1.length() ;i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

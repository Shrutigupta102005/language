public class InteralWorking {
    public static void main(String[] args){
    //ways of creating a string 
        // method 1 
        String a = "shruti";
        String b = "shruti";   // literal for  both the vaariable is same since string literal is created in string pool constant 
        System.out.println(a==b);

        // method 2 
        String c = new String("dhruv");
        String d = new String("dhruv");
        System.out.println(c==d); // literals are created in heap memory and seprated for same value 
    }
}

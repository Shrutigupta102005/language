public class type_conversion {
    public static void main(String[] args){
        // coversion from byte to int 
        byte b = 127;
        int a = 256 ;  
        // b=a; --> error
        a=b;
        System.out.println(b);
        System.out.println(a);
    }
}

public class type_conversion {
    public static void main(String[] args){
        // coversion from byte to int 
        byte b = 127;
        int a = 256 ;  
        // b=a; --> error sol of this is explicit conversion
        //implicit conversion
       // a=b;
        System.out.println(b);
        System.out.println(a);
        
        //explicit conversion --- known as casting
        b=(byte)a;  // the output here is 0 since it will perform %256 
        System.out.println(b);
        System.out.println(a);

        float f = 4.58f ;
        int x = (int)f ; //decimal part gayab hu gaye ga 
        System.out.println(x);

        // type promotion
        byte s = 10;
        byte h =20;
        int u =s*h;
        System.out.println(u);


    }
}

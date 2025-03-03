public class COunt_prime{
    public static void main(String[] args){
        for(int i=3)
    }
    public static boolean isprime(int n ){
        int div = 2;
        while(div * div <= n){
            if(n% div == 0){
                return false;
            }
            div++ ;
        }
        return true;
    }
}
public class Sieve_of_Eratosthenes{
    public static void mian(String[] args){
        int n = 100;
    }
    public static int prime_sieve(int n){
        int [] ans = new int[n+1] ;
        ans[0] = ans[1] =1;
        for(int i =2 ;i*i <= ans.lenght;i++){
            if(ans[i] == 0){ //i is prime 
                for(int j = 2 ;i *j < ans.length ; j++){
                    ans[ i * j] =1;
                }
                int c = 0
                for(int j=0;i*j < ans.lenght ; j++){
                    ans[ i * j] =1;
                }
                return c;
            }
        }
    }
}
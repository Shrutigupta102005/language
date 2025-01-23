package Recurrsion.bracktrackin;

public class coin_combination {
    public static void main(String[] args){
        int [] coin = {1,2,3,5};
        int amount = 5;
        permutation(coin,amount,"",0);
    }
    static void permutation(int[] coin , int amount ,String ans,int idx){
    
            if(amount == 0){
                System.out.println(ans);
                return;
            }
            for(int i = 0 ; i<coin.length;i++){
                if(amount >= coin[i]){
                    permutation(coin,amount-coin[i],ans+coin[i],i);
                }
            }
        }
    }  



   
    


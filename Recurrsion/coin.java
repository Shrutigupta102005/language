package Recurrsion;

public class coin {
    public static void main(String[] args){
        int n = 4;
        coin(n,"");
    }
    static void coin(int n , String ans){
        if(n==0){
            System.out.println(ans);
            return ; 
        }
        coin(n-1,ans+'T');
        coin(n-1,ans+'H');
    }
    
}

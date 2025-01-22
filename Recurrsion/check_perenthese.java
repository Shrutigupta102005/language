package Recurrsion;

public class check_perenthese {
    public static void main(String[] args){
        int n =3;
        checkperenthese(n,0,0,"");
    }
    static void checkperenthese(int n , int open,int close,String ans){
        if(open==n||close==n){
            System.out.println(ans);
            
        }
        if(open>n||close<n){
           return;
        }
    
            checkperenthese(n,open+1,close,")");
            checkperenthese(n,open,close+1,"(");
        
    }

}


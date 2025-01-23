package Recurrsion.bracktrackin;

public class game {

    public static void main(String[] args){
    int m = 3;
    int n = 3;
    print(0,0,n-1,m-1,"");
    }
    static void print(int cr, int cc ,int er,int ec,String ans){
        if(cr == er && cc == ec ){
            System.out.println(ans);
            return;
        }
        if(cr > er || cc > ec){
            return ;
        }
        print(cr,cc+1,er,ec,ans+"H");
        print(cr+1,cc,er,ec,ans+"V");
    }
}

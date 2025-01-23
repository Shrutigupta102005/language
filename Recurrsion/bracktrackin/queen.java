package Recurrsion.bracktrackin;

public class queen {
    public static void main(String[] args){
        int n = 4;
        int tq = 2;
        boolean [] board = new boolean[n];
        permutation(board,tq,"",0);
    }
    static void permutation(boolean[] board,int tq ,String ans,int qpsf ){

        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i<board.length;i++){
            if(board[i] != true){
                board[i]=true;
                permutation(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1);
                board[i] = false;
            }
        }
    }
}

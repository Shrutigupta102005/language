package Recurrsion;

public class permutation {
    public static void main(String[] args){
        printpermutation("abc","");
    }
    static void printpermutation(String ques,String ans ){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i =0;i<ques.length();i++){
            String a = ques.substring(0,i)+ques.substring(i+1);
            char ch = ques.charAt(i);
            printpermutation(a,ans+ch);
        }
    }
}

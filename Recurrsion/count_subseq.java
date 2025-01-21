package Recurrsion;

public class count_subseq {
    public static void main(String[] args){
        String ques = "abcd";
        String ans = "";
        System.out.println(countsubseq(ques,ans));
    }
    static int countsubseq(String ques,String ans){
        if(ques.length()==0){
            return 1;
        }
        char ch = ques.charAt(0);
        int a = countsubseq(ques.substring(1),"");
        int b = countsubseq(ques.substring(1),""+ch);
        return a+b;
    }
}

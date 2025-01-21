package Recurrsion;

public class Subseq {
    public static void main(String[] args) {
        String ques1 = "abc";
        subseq(ques1, "");
        System.out.println(count);
    }
    static int count = 0;
    static void subseq(String ques1, String ans) {
        // Base case
        if (ques1.length() == 0) {
            System.out.println(ans);
            count++;
            return;
        }
        
        char ch = ques1.charAt(0);
        String remaining = ques1.substring(1);
        
        // Include current character
        subseq(remaining, ans + ch);
        // Exclude current character
        subseq(remaining, ans);
    }
}
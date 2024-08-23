package pw_35;

public class ques20 {
    public static void main(String[] args){
    String word ="shruti";
    String rev_word = "" ;
    for (int i = 0 ; i<word.length(); i++)
    { rev_word = word.charAt(i) + rev_word;}
    System.out.println(rev_word);
    }
}

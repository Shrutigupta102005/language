package pw_35;

public class ques23 {
    public static void main (String[] args){
        String name = "shruti";
        int vowel = 0;
            int consonants =0;
        for(int i =0;i<name.length();i++){
            char first = name.charAt(i);
            
            if (first=='a'||first=='e'||first=='o'||first=='u'||first=='i')
            {
                vowel++;
            }
            else
            {
                consonants++;
            }
        }
        System.out.println("no of vowel"+" "+vowel);
        System.out.println("no of consonats"+" "+consonants);
    }
}

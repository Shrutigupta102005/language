package String;

public class substring {
    public static void main(String[] args){
        String s1 = "hellobye";
        System.out.println(s1.substring(2,5));
        for(int i = 0 ;i<s1.length();i++){
            for(int j =i;j<s1.length();j++){
                System.out.println(s1.substring(i,j));
            }
            
        }

        // palindrome - aage aur piche dono se same matlab huta hai 
        String word = "mada";
        int i = 0;
        int j = word.length()-1;
        while(i<j){
            if(word.charAt(i)!=word.charAt(j)){
                System.out.println(" not palindrome");
                break;
            }
                i++;
                j--;
            System.out.println("palindrome");
            break;

        }

    }
}
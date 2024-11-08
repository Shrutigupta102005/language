package LinearSearch;

public class stringsearch {
    public static void main(String[] args) {
        String word = "shruti";
        char target = 'u';
        int rel = search(word, target);
        System.out.println(rel);
    }
    static int search(String word,char target){
        if (word.length()==0){
            return -1;
        }
        for(int i = 0;i<=word.length();i++){
            if(word.charAt(i)==(target)){
                return i;
            }
        }
        return -1;
    }
}

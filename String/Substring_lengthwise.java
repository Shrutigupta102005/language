package String;

public class Substring_lengthwise{
    public static void main(String[] args){
        fun("love");
    }
    static void fun(String str){
        for(int i = 1;i<=str.length();i++){
            for(int j = i;j<=str.length();j++){
                int k = j-i;
                System.out.println(str.substring(k,j));
            }
        }
    }

}

package String;

public class Substring_lengthwise{
    public static void main(String[] args){
        int ans = fun("81615");
        System.out.println(ans);
    }
    static int fun(String str){

        
        int count = 0;
        for(int i = 1;i<=str.length();i++){
            for(int j = i;j<=str.length();j++){
                int k = j-i;
                String s = str.substring(k,j);
                int num = Integer.parseInt(s);
                if(num==0|| num == 1){
                    count = count + 0;
                }
                if(check(num)== true){
                    count++;
                }
                
                
            }
        }
        return count ;
    }
    static boolean check(int num ){
        if (num == 2 || num == 3|| num == 5|| num == 7|| num == 11|| num == 13|| num == 17|| num == 19|| num == 23|| num == 29){
            return true;
            
        }
        if (num % 2 != 0 ||num % 3 != 0 ||num % 5 != 0 ||num % 7 != 0 ||num % 11 != 0 ||num % 13 != 0 ||num % 17 != 0 ||num % 19 != 0 ||num % 23 != 0 ||num % 29 != 0 ){
            return true;
            
        }
        return false;
    }

}

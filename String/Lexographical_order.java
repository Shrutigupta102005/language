package String;

public class Lexographical_order {
    public static void main(String[] args){
        String s1 = "Komal" ;
        String  s2 = "Kunal";
        System.out.println(s1.compareTo(s2));
        int a = mera(s1,s2);
        System.out.println(a);
        
       
    }
    // to comapre too mera khud ka 
    static int mera(String s1,String s2){
        if(s1==s2){
            return 0;
        }
        int len = Math.min(s1.length(),s2.length());
        for(int i =0;i<len;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i);
            }
        }
        return s1.length()-s2.length();
    }
        
 }// if neg s2 is big ,if positive then s1 is big

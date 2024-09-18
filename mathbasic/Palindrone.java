package mathbasic;

public class Palindrone {
    public static void main(String[] args){
        int num = 1212;
        int copy = num ;
        int rev = 0;
        while(copy>0){
            int ld = copy % 10 ;
            rev = rev*10 + ld;
            copy = copy /10;
        }
        if (rev == num){
            System.out.println("its a palindrone");
        }
        else{
            System.out.println("na na bekar not a palindrone !!");
        }
    }
}

package mathbasic;

public class Armstrong {
    public static void main(String[] args){
        int num = 153;
        int copy = num;
        int sum = 0;
        while(copy >0){
            int ld = copy %10;
            sum = sum + ld*ld*ld;
            copy = copy/10;
        }
        if(num == sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("hmm na not an armstrong!!");
        }
    }
}

package mathbasic;

public class extractionofDigit {
    public static void main(String[] args){
        int n =7893;
        while(n>0){
            int ld= n%10;
            System.out.println(ld);
            n=n/10;
        }
    }
}

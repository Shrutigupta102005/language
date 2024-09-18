package mathbasic;

public class counter {
    public static void main(String[] args) {
        int num  = 222;
        int counter =0;
        while(num>0){
            num =num/10;
            counter = counter +1;
        }
        System.out.println(counter);
    }
}

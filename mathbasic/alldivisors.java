package mathbasic;

public class alldivisors {
    public static void main(String[] args){
        int num =10;
        for(int i =1; i<=num ;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}

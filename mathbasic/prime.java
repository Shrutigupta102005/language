package mathbasic;

public class prime {
    public static void main(String[] args){
    int num = 72;
    int counter =0;
    for(int i=1;i<=num;i++){
        if(num%i==0){
            counter=counter+1;
        }

    }
    if(counter>2){
        System.out.println("not a prime ");
    }
    else{
        System.out.println("prime");
    }
    }
}

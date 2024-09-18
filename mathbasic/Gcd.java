package mathbasic;

public class Gcd {
    public static void main(String[] args) {
        int a =3;
        int b =6;
        int num=0;
        int gcd =1;
        if(a>b){
            num=a;
        }
        else{
            num=b;
        }
        for(int i=1;i<=num;i++){
            if(a%i==0 && b%i==0){
                gcd =i;
            }
        }
        System.out.println(gcd);
    }
}

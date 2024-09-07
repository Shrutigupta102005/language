package ques_class;

public class CWDmethodQues {
    public static void main(String[] args){
        ques1(4);
        ques2(5);
        ques3(7);
        ques4(5);
        ques5(6);
        ques9(55);


    }
    //ques 1 print mulitiplation table of n number 
    static void ques1(int n){
        for(int i = 1; i<=10;i++){
            System.out.println(n+"X"+i+"="+n*i);
        }

    }
    // ques2 patern 
    /*
     * *
     * * *
     * * * *
     * * * * *
     */
    static void ques2(int n ){
        for(int i = 0;i<=n;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    // ques 3 sum of first natural number 
    static void ques3(int n){
        int sum = 0;
        for(int i =0;i<=n;i++){
            sum += i;
        }
        System.out.println("the dum of natural numbers are :"+sum);
    }
// ques 4 reverse pattern 
/*
 * *****
 * ****
 * ***
 * **
 * *
 */
    static void ques4(int n ){
        for(int i =0;i<=n;i++){
            for(int j =i;j<=n;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // ques 5 nth term fibbonaci series 
    static void ques5(int n ){
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
    for(int i =0 ; i<= n;i++){
        int c =a+b;
        System.out.print(c+ " ");
            a=b;
            b=c;
    }
    }
// celcius to fehrenite 
    static void ques9(int n ){
        int temp = (9/5)*n+32;
        System.out.println(temp);

    }
}

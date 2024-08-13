public class ques9 {
    public static void main (String[] args){
        int num1 = 153;
        while(num1>0)
        { 
            int digit = num1%10;
            num1 = num1/10;
            int sum = sum + (pow(digit,3));
        }
        if (sum == num1 ){ 
            System.out.println("Armstrong number");
        }
        else 
            {System.out.println("NOT AN Armstrong number ");}
    }
}

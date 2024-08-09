import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter your number:");
        int x = myObj.nextInt();
        int y = myObj.nextInt();

        if (x>y)
        {System.out.println(x);}
        else
            {System.out.println(y);}

    }
}

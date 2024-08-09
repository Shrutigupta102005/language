import java.util.Scanner;

public class coparision_of_3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter your number:");
        int x = myObj.nextInt();
        int y = myObj.nextInt();
        int z = myObj.nextInt();
        
        if ((x>y) && (x>z))
        {
                System.out.println(x);
        }
        else if ((y>x) && (y>z))
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
    }
    
}

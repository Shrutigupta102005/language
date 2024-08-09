import java.util.Scanner;

public class session2 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter your number:");
        int x = myObj.nextInt();
        int y = myObj.nextInt();
        int result =  x + y;
        System.out.println(result);  
    }
}

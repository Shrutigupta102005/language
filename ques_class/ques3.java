import java.util.Scanner;
public class ques3 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter your number:");
        int r = myObj.nextInt();
        double area = 3.14* r *r ;
        System.out.println(area);
    }
}

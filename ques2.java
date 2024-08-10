import java.util.Scanner;
public class ques2 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter your radius:");
        int radius = myObj.nextInt();
        System.out.println("Enter your height:");
        int height = myObj.nextInt();
        double volume  =  (3.14)*(radius)*(radius)*(height);
        System.out.println(volume); 
    }
}

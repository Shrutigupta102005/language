import java.util.Scanner;
public class methods{
    public static void main(String[] args){
         int d= sum();
         System.out.println(d);

         System.out.println(mul(3,6));
    }
    static int sum(){
        Scanner my_obj = new Scanner(System.in);
        System.out.println("enter first number");
        int a = my_obj.nextInt();
        System.out.println("enter second number");
        int b = my_obj.nextInt();
        int c = a+b;
        return c;

    }
    // methods with paramter 
    static int mul(int a,int b){
        int c = a*b;
        return c;
    }
}
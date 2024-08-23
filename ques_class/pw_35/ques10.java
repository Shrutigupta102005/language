package pw_35;

public class ques10 {
    public static void main(String[] args)
    {
       int year = 2023;
       if (year%4==0&&year%100!=0 || year%400==0)
       {System.out.println("This is an leap year!!");} 
       else
       {System.out.println("this is not an leap year!!");}
    }
    
}

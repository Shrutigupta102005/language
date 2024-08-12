package super_150_ques.day1;

public class Grade_card {
    public static void main(String[] args){
        int grade = 88;
        if (grade >=75)
            {System.out.println("A");}
        else if (grade<=65 && grade >75)
            {System.out.println("B");}
        else if (grade<=45 && grade >65)
            {System.out.println("C");}
        else if (grade<=33 && grade >45)
            {System.out.println("pass");}
            else 
            {System.out.println("Better luck next time!!");}
    }
    
}

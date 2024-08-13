package super_150_ques.day1;

public class comparing_3_numbers {
    public static void main(String[] args){
        int a = 2;
        int b = 3;
        int c = 5;
        // for largest number among three
        if (a>b && a>c)
        {System.out.println(a  + " is largest ");}
        else if( b>a && b>c)
        {System.out.println(b+"is largest");}
        else
        {System.out.println(c+"is largest");}
        // for smallest number among three
        if (a<b && a<c)
        {System.out.println(a  + " is smallest ");}
        else if( b<a && b<c)
        {System.out.println(b+"is smallest");}
        else
        {System.out.println(c);}
        //for finding the middle term
        if ((a>b && b>c) || (b<c && b>a))
        {System.out.println(b );}
        else if(( b>a && a>c) || (a>b && c>a))
        {System.out.println(a);}
        else
        {System.out.println(c);}
    }
}

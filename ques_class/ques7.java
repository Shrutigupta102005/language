public class ques7 {
    public static void main (String[] args){
        int a = 2;
        int b = 7;
        int sum = 0;
        for (int i  = a; i<b; i++)
        {
            if (i%2!=0){
                sum =sum +i;
            }
        }
        System.out.println(sum);
    }
}

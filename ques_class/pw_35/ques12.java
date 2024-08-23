package pw_35;

public class ques12 {
    public static void main(String[] args)
    {
        int P = 15000;
        float r = 5.5f;
        int t = 3;
        double ci = P*(Math.pow((1+(r/100)),t))-P;
        System.out.println(ci);
    }
}
// ** not valid in java
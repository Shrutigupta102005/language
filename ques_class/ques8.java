public class ques8 {
    public static void main(String[] args) {
        int num1 = 102;
        int sum = 0;
        // using toString() method 
        String str1 = Integer.toString(num1); 
        for (int i =0;i<str1.length();i++){
                int digit = (int) i ; // problem hai mujhe ques meh 
                sum = sum + digit ;
        }
        System.out.println(sum);
    }
}

package Recurrsion;
import java.util.Scanner;

public class OneToN {
    Scanner myobj = new Scanner(System.in);
    int n = myobj.nextInt();

    public void counter(int i) {
        if (i > n) {
            return; // Base case: Stop recursion when i exceeds n
        }

        System.out.println(i);

        counter(i + 1); // Recursive call with incremented i
    }

    public static void main(String[] args) {
        OneToN obj = new OneToN();
        obj.counter(1); // Start with i = 1
    }
}

package PCPH;

public class Ques2 {
    public static void main(String[] args) {
        int[] numbers = {121, 131, 20, 33, 44, 55, 66, 77, 88, 99};
        int sum = 0;

        for (int number : numbers) {
            if (isPalindrome(number)) {
                sum += number;
            }
        }

        System.out.println("Sum of palindrome numbers: " + sum);
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }
}

package codeforces;
import java.util.Scanner;
public class Square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int area  = n * m ;
        int flag_area = a*a;
        int num = area /flag_area ;
        System.out.println(num );
    }
}

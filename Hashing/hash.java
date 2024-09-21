package Hashing;
import java.util.Scanner;
public class hash {
    public static void main(String[] args){
        // taking input array from the user 
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<n;i++){
            arr[i] = myobj.nextInt();
        }
        // prestoring the counter of the array 
        int[] hash = new int[13];
        for(int i =0;i<n;i++){
        hash[arr[i]] += 1;
        } 
        // asking user which number frequency you want to see from the above array 
        int q = myobj.nextInt();
        while(q-- != 0){
            int number;
            number = myobj.nextInt();
            // fetching:
            System.out.println(hash[number]);

        }

    }
    
}

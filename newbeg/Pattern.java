package newbeg;


public class Pattern {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(7);
        pattern3(4);
        pattern4(6);
        pattern5(4);
        pattern6(5);
    }
    static void pattern1(int n ){
        for(int i = 1; i<=n ;i++){
            for(int j = 1; j<=n;j++){
                System.out.print("*");
            }
                System.out.println();
            }
        }

    static void pattern2(int n ){
        for (int i =1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n ){
        for(int i = 1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern4(int n ){
        for(int i = 1; i<=n;i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(i);    
            }
            System.out.println();

        }
    }
    static void pattern5(int n ){
        for (int i = 0; i < n; i++){
        for (int j = n; j > i; j--)
        {
            System.out.print("* ");
        }
        System.out.println();
         }
    }

    static void pattern6(int n){
        for(int i = 0;i<n;i++){
            for(int j =n,p=1;j>i;j--,p++){
                System.out.print(p);
            }
            System.out.println();
        }
    }
}
    



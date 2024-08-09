public class array {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        num[1] = 3; // replacing value in an array
        System.out.println(num[2]);
        for(int i=0; i<4 ; i++){
            System.out.println(num[i]);
        }
    }
}

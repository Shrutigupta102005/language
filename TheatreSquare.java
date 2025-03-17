import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read inputs as long to avoid overflow issues
        long n = sc.nextLong();  
        long m = sc.nextLong();  
        long a = sc.nextLong();  
        sc.close();
        
        // Calculate the required number of tiles (using integer math to avoid floating point issues)
        long tilesAlongLength = (n + a - 1) / a;  
        long tilesAlongWidth = (m + a - 1) / a;   
        
        // Total tiles needed
        long totalTiles = tilesAlongLength * tilesAlongWidth;
        
        // Print the result
        System.out.println(totalTiles);
    }
}

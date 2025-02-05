package Recurrsion;

public class sudoko {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		Print(grid, 0, 0);
	

	}

	public static boolean Print(int[][]grid,int row , int col) {
        if(grid[row][col]!=0){
            return Print(grid,row,col+1);
        }
        else{
            for(int val = 1; val <=9; val++){
                if(isitsafe(grid,row,col,val)){
                    grid[row][val]=val;
                    boolean ans = Print(grid,row,col+1);
                    if(ans){
                        return true;
                    }
                    grid[row][col] = 0 ;
                }
            }
        }
    }
}

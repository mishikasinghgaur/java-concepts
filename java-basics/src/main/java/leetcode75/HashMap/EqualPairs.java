package leetcode75.HashMap;

import java.util.Arrays;

public class EqualPairs {

    public static int equalPairs(int[][] grid) {

        int n = grid.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (isEqual(grid[i], getColumn(grid, j, n))) {
                    System.out.println("Row" + i + "and Column" + j + "are equal.");
                    System.out.println("Row is" + Arrays.toString(grid[i])
                    + "and Column is" + Arrays.toString(getColumn(grid, j, n)));
                    count++;
                }
            }
        }
        return count;
    }

    public static int[] getColumn (int[][] grid, int columnIndex, int n){
        int[] column = new int[n];
        for (int i = 0; i < n; i++){
            column[i] = grid[i][columnIndex];
        }
        return column;
    }

    public static boolean isEqual(int[] a1, int[] a2){
        if(a1.length != a2.length){
            return false;
        }

        for(int i = 0; i < a1.length; i++){
            if(a1[i] != a2[i]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        int[][] grid = new int[][]{
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}};

        int result = equalPairs(grid);

        System.out.println(result);
    }
}

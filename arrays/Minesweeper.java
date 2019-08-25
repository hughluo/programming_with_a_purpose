public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        int[][] grid = new int[m][n];

        // generate mines, denoted by -1
        int mined = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mined == k) break;
                grid[i][j] = -1; 
                mined++;
            }
        }

        // shuffle mines
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int placeCurrent = i * m + j;
                int placeToSwap = (int) (Math.random() * (m*n - placeCurrent) + placeCurrent);
                // swap
                int iToSwap = placeToSwap / m;
                int jToSwap = placeToSwap % m;
                int valueToSwap = grid[iToSwap][jToSwap];
                grid[iToSwap][jToSwap] = grid[i][j];
                grid[i][j] = valueToSwap;
            }
        }

        // generate mine count in cell without mine
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) {
                    if (j - 1 >= 0 && grid[i][j-1] != -1) grid[i][j-1]++;
                    if (j + 1 < n && grid[i][j+1] != -1) grid[i][j+1]++;
                    if (i - 1 >= 0) {
                        if (grid[i-1][j] != -1) grid[i-1][j]++;
                        if (j - 1 >= 0 && grid[i-1][j-1] != -1) grid[i-1][j-1]++;
                        if (j + 1 < n && grid[i-1][j+1] != -1) grid[i-1][j+1]++;
                    }
                    if (i + 1 < m) {
                        if (grid[i+1][j] != -1) grid[i+1][j]++;
                        if (j - 1 >= 0 && grid[i+1][j-1] != -1) grid[i+1][j-1]++;
                        if (j + 1 < n && grid[i+1][j+1] != -1) grid[i+1][j+1]++;
                    }
                }
            }
        }

        // print out grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) System.out.print('*');
                else System.out.print(grid[i][j]);
                System.out.print("  ");
            }
            System.out.print('\n');

        }


    }
}

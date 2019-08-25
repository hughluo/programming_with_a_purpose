public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        int[] mines = new int[m*n];
        // generate and shuffle mines
        for (int i = 0; i < k; i++) {
            mines[i] = -1;
        }
        for (int i = 0; i < mines.length; i++) {
            int r = (int) (Math.random() * (mines.length - i) + i);
            int temp = mines[r];
            mines[r] = mines[i];
            mines[i] = temp;
        }

        // convert mines to grid
        int[][] grid = new int[m][n];
        int minesIndex = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = mines[minesIndex];
                minesIndex++;
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

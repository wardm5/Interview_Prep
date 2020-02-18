// https://leetcode.com/explore/learn/card/queue-stack/231/practical-application-queue/1374/

// Faster solution
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int  i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    flip(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public void flip(char[][] matrix, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[i].length || matrix[i][j] == '0')
            return;
        matrix[i][j] = '0';
        flip(matrix, i+1, j);
        flip(matrix, i-1, j);
        flip(matrix, i, j+1);
        flip(matrix, i, j-1);
    }
}
// Runtime: 1 ms    99.98% of all Java submissions
// Memory Usage: 42.1 MB   33.49% of all Java submissions

class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int  i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    flip(grid, new Point(i, j));
                    count++;
                }
            }
        }
        return count;
    }
    public void flip(char[][] matrix, Point p) {
        Queue<Point> q = new LinkedList<>();
        q.add(p);
        while (!q.isEmpty()) {
            Point temp = q.remove();
            if (temp.row < 0 || temp.col < 0 || temp.row >= matrix.length|| temp.col >= matrix[temp.row].length || matrix[temp.row][temp.col] == '0')
                continue;
            matrix[temp.row][temp.col] = '0';
            q.add(new Point(temp.row+1, temp.col));
            q.add(new Point(temp.row-1, temp.col));
            q.add(new Point(temp.row, temp.col+1));
            q.add(new Point(temp.row, temp.col-1));
        }
    }
}
class Point {
    int row = 0;
    int col = 0;
    public Point(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

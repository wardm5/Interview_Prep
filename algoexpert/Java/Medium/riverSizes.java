import java.util.*;

class Program {
  public static List<Integer> riverSizes(int[][] matrix) {
		List<Integer> res = new ArrayList<>();
    for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1)
					res.add(helper(matrix, i, j));
			}
		}
    return res;
  }
	public static int helper(int[][] matrix, int i, int j) {
		if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[i].length || matrix[i][j] != 1)
			return 0;
		matrix[i][j] = 0;
		return helper(matrix, i + 1, j) + helper(matrix, i - 1, j) + helper(matrix, i, j + 1) + helper(matrix, i, j - 1) + 1;
	}
}

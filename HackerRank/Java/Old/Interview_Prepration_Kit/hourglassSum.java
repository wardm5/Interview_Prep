static int hourglassSum(int[][] arr) {
    int size = arr.length - 3;
    int result = Integer.MIN_VALUE; 
    for (int i = 0; i <= size; i++) {
        for (int j = 0; j <= size; j++) {
            int curr = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
            if (curr > result)
                result = curr;
        }
    }
    return result;
}

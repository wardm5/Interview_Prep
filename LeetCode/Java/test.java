class Solution {
    public int[][] kClosest(int[][] points, int K) {
        TreeMap<Double, List<int[]>> map = new TreeMap<>();
        for (int i = 0; i < points.length; i++) {
            double dist = distance(0,0, points[i]);
            List<int[]> temp =map.getOrDefault(dist, new ArrayList<>());
            temp.add(points[i]);
            map.put(dist, temp);
        }
        int[][] res = new int[K][2];
        int count = 0;
        for (double key : map.keySet()) {
            List<int[]> tempList = map.get(key);
            for (int j = 0; j < tempList.size(); j++) {
                if (count == K)
                    return res;
                res[count] = tempList.get(j);
                count++;
            }
        }
        return res;
    }
    private double distance(int x1, int y1, int[] point) {
        int x = (point[0] - x1);
        int y = (point[1] - y1);
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}

// Runtime: 67 ms, faster than 7.64% of Java online submissions for K Closest Points to Origin.
// Memory Usage: 49.7 MB, less than 100.00% of Java online submissions for K Closest Points to Origin.

//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a m * n matrix mat of ones (representing soldiers) and zeros (representing
civilians), return the indexes of the k weakest rows in the matrix ordered from
]the weakest to the strongest.

A row i is weaker than row j, if the number of soldiers in row i is less than the
number of soldiers in row j, or they have the same number of soldiers but i is
less than j. Soldiers are always stand in the frontier of a row, that is, always
ones may appear first and then zeros.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create tree map to keep sorted strengths
    2) loop through each row of matrix
        2.1) get the strength of that row, place the row into a map using the strength
    3) create the result array
    4) create count of items
    5) for each strength, add the row into the result array
    6) return result
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0 ; i < mat.length; i++) {
            int strength = calcRows(mat[i]);
            List<Integer> temp = map.getOrDefault(strength, new ArrayList<>());
            temp.add(i);
            map.put(strength, temp);
        }
        int[] res = new int[k];
        int count = 0;
        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            for (int i = 0; i < list.size(); i++) {
                if (count == k)
                    return res;
                res[count] = list.get(i);
                count++;
            }
        }
        return res;
    }
    public int calcRows(int[] row) {
        int strength = 0;
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 1)
                strength++;
        }
        return strength;
    }
}

/*
    Runtime: 3 ms, faster than 37.63% of Java online submissions for The K Weakest Rows in a Matrix.
    Memory Usage: 41.3 MB, less than 100.00% of Java online submissions for The K Weakest Rows in a Matrix.
*/

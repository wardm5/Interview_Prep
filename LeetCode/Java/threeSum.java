class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length <= 2)
            return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> dups = new HashSet<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[0] == 0 && nums[2] == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[0]);
                list.add(nums[1]);
                list.add(nums[2]);
                res.add(list);
                return res;
            }
            int first = ;
            if (dups.contains(first))
                continue;
            dups.add(first);
            if (first > 0)
                return res;
            int p1 = i + 1;
            int p2 = nums.length-1;
            while (p1 < p2) {
                List<Integer> list = new ArrayList<>();
                list.add(first);
                list.add(nums[p1]);
                list.add(nums[p2]);
                if (set.contains(list)) {
                    p1++;
                    continue;
                } else if (list.get(0)+list.get(1)+list.get(2) == 0) {
                    res.add(list);
                    set.add(list);
                    p1++;
                } else if (list.get(0) + list.get(1) + list.get(2) > 0)
                    p2--;
                else
                    p1++;
            }
        }
        return res;
    }
}

    // WORKS BUT SUPER SLOW
        // List<List<Integer>> list = new ArrayList<>();
        // HashSet<List<Integer>> set = new HashSet<>();
        // for (int i = 0; i < nums.length-2; i++) {
        //     for (int j = i + 1; j < nums.length-1; j++) {
        //         for(int k = j + 1; k < nums.length; k++) {
        //             List<Integer> subList = new ArrayList<>();
        //             subList.add(nums[i]);
        //             subList.add(nums[j]);
        //             subList.add(nums[k]);
        //             if (nums[i] + nums[j] + nums[k] == 0 && !set.contains(subList)) {
        //                 set.add(subList);
        //                 list.add(subList);
        //             }
        //         }
        //     }
        // }
        // return list;

    // DOES NOT WORK
        // List<List<Integer>> res = new ArrayList<>();
        // HashSet<List<Integer>> set = new HashSet<>();
        // HashSet<Integer> dups = new HashSet<>();
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     dups.add(nums[i]);
        // }
        // for (int i = 0; i < nums.length -1; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         // System.out.println(nums[i] + "  " + nums[j]);
        //         List<Integer> list = new ArrayList<>();
        //         list.add(nums[i]);
        //         list.add(nums[j]);
        //         list.add(-(nums[i] + nums[j]));
        //         Collections.sort(list);
        //         if (dups.contains(-(nums[i] + nums[j])) && !set.contains(list)) {
        //             set.add(list);
        //             res.add(list);
        //         }
        //     }
        // }
        // return res;

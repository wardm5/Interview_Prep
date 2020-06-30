//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
278. First Bad Version
Easy

You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check. Since
each version is developed based on the previous version, all the versions after
a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first
bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version
is bad. Implement a function to find the first bad version. You should minimize
the number of calls to the API.

Example:
Given n = 5, and version = 4 is the first bad version.

call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true

Then 4 is the first bad version.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) run binary search on files, return the value of the binary search
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0;
        while (low <= n) {
            int mid = (n-low)/2 + low;
            if (isBadVersion(mid))
                n = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}

/*
    Runtime: 12 ms, faster than 98.83% of Java online submissions for First Bad Version.
    Memory Usage: 36.2 MB, less than 43.36% of Java online submissions for First Bad Version.
*/

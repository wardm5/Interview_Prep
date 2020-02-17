//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for
the multiples of five output “Buzz”. For numbers which are multiples of both three
and five output “FizzBuzz”.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create result array
    2) loop through 1 to N
        3) check if the number is mod 3 and 5, if so, add FizzBuzz to list
        4) else if check if the number is mod 3, add Fizz
        5) else if check if the number is mod 5, add Buzz
        6) else add number
    7) return result array
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                res.add("FizzBuzz");
            else if (i % 3 == 0)
                res.add("Fizz");
            else if (i % 5 == 0)
                res.add("Buzz");
            else {
                StringBuilder build = new StringBuilder();
                res.add(build.append(i).toString());
            }
        }
        return res;
    }
}

/*
    Runtime: 1 ms, faster than 99.92% of Java online submissions for Fizz Buzz.
    Memory Usage: 41.7 MB, less than 5.40% of Java online submissions for Fizz Buzz.
*/

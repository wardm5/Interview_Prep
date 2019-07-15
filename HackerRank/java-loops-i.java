/*
    Objective 
    In this challenge, we're going to use loops to help us do some simple math.

    Task 
    Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: 
    N x i = result.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println( N + " x " + i + " = " + (i *N));
        }
    }
}

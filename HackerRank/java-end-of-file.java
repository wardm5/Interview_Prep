/*
    The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.

    Hint: Java's Scanner.hasNext() method is helpful for this problem.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int count = 1;
        while (scan.hasNextLine()) {
            String sentence = scan.nextLine();
            System.out.println(count + " " + sentence);
            count++;
        }
    }
}

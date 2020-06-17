import java.util.*;
import java.io.*;
public class PathNames {
    public static void main(String args[]) {
        // try-catch block to handle exceptions
        // try {
        //     File f = new File("/Users/misha_ward/Desktop/github/Interview_Prep/LeetCode/Java");
        //
        //     FilenameFilter filter = new FilenameFilter() {
        //         @Override
        //         public boolean accept(File f, String name) {
        //             // We want to find only .c files
        //             return name.endsWith(".java");
        //         }
        //     };
        //
        //     // Note that this time we are using a File class as an array,
        //     // instead of String
        //     File[] files = f.listFiles(filter);
        //
        //     // Get the names of the files by using the .getName() method
        //     for (int i = 0; i < files.length; i++) {
        //         System.out.println(files[i].getName());
        //     }
        // } catch (Exception e) {
        //     System.err.println(e.getMessage());
        // }
        // File[] files = new File("/Users/misha_ward/Desktop/github/Interview_Prep/LeetCode").listFiles((dir, name) -> name.endsWith(".java"));
        List<String> results = new ArrayList<String>();
        File[] files = new File("/Users/misha_ward/Desktop/github/Interview_Prep/LeetCode/java").listFiles();
        helper(results, files);


        //If this pathname does not denote a directory, then listFiles() returns null.


    }
    public static void helper(List<String> results, File[] files) {
        if (files == null)
            return;
        for (File file : files) {
            if (file.isFile() && getFileExtension(file).equals(".java")) {
                System.out.println(file.getName());
                results.add(file.getName());
            } else if  (file.isDirectory()) {
                // System.out.println(file.getName());
                // System.out.println(file.getAbsolutePath() + "/" + file.getName());
                File[] temp = new File(file.getAbsolutePath() + "/").listFiles();
                helper(results, temp);
            }
        }
    }
    private static String getFileExtension(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return ""; // empty extension
        }
        return name.substring(lastIndexOf);
    }
}

package com.zemoso.assignment.java;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * @author Devendar Reddy
 * Lists all the files matching regular expression in the directory.
 */
public class Problem1 {

    public static void main(String[] args) {
        String directoryName = "C:\\Users\\Devendar Reddy\\Downloads\\test";
        Scanner scanner = new Scanner(System.in);
        String pattern = scanner.next();
        listFiles(new File(directoryName), pattern).forEach(System.out::println);

    }

    /**
     * @param file  Search directory
     * @param regex regular expression to match with file Name
     * @return list of files Matched in the directory
     */
    private static List<String> listFiles(File file, String regex) {
        File[] filesInDirectory = file.listFiles();
        List<String> fileNames = new ArrayList<>();
        if (null != filesInDirectory) {
            for (File file1 : filesInDirectory) {
                if (file1.isDirectory()) {
                    fileNames.addAll(listFiles(file1, regex));
                }
                if (file1.getName().matches(regex)) {
                    fileNames.add(file1.getAbsolutePath());
                }
            }
        }
        return fileNames;
    }

}

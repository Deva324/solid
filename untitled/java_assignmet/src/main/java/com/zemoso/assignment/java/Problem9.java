package com.zemoso.assignment.java;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String input = scanner.next();
        //scanner.close();
        System.out.println(checkString("This"));
    }

    static boolean checkString(String s) {
        return s.matches("^[A-Z]");
    }
}

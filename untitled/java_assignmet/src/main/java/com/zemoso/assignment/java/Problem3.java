package com.zemoso.assignment.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.next();
        scanner.close();
        List<Integer> times = pingHost(ip);
        Collections.sort(times);
        System.out.println(getMedian(times, times.size()));
    }

    static List<Integer> pingHost(String ip) {
        List<Integer> times = new ArrayList<>();
        try {
            Process p = Runtime.getRuntime().exec("ping " + ip);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            String s;
            while ((s = inputStream.readLine()) != null) {
                if (s.contains("time=")) {
                    times.add(Integer.valueOf(s.substring(s.indexOf('=') + 1, s.indexOf("ms"))));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return times;
    }

    static double getMedian(List<Integer> list, int n) {
        if (n % 2 != 0)
            return (double) list.get(n / 2);

        return (double) (list.get((n - 1) / 2) + list.get(n / 2)) / 2.0;
    }

}
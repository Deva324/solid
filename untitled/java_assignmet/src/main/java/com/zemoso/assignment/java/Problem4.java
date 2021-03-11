package com.zemoso.assignment.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem4 {

    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDates = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfDates; i++) {
            String dates = scanner.nextLine();
            System.out.println(getDatesRange(dates));
        }

    }

    static String getDatesRange(String dates) {
        String[] date = dates.split(" ");
        String signUpDate = date[0];
        String currentDate = date[1];
        if (currentDate.compareTo(signUpDate) < 0) {
            return "No Range";
        }
        LocalDate current = convertStringToDate(currentDate);
        LocalDate signUp = convertStringToDate(signUpDate);
        int currentYear = current.getYear();
        int signUpYear = signUp.getYear();
        signUp = signUp.plusYears(currentYear - signUpYear);
        LocalDate rangeStartDate = signUp.plusDays(-30);
        LocalDate endDate = signUp.plusDays(30);
        endDate = endDate.compareTo(current) > 0 ? current : endDate;
        return convertLocalDateToString(rangeStartDate) + " " + convertLocalDateToString(endDate);
    }

    private static LocalDate convertStringToDate(String date) {
        return LocalDate.parse(date, dtf);
    }

    private static String convertLocalDateToString(LocalDate date) {
        return date.format(dtf);
    }


}

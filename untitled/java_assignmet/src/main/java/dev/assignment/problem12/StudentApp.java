package dev.assignment.problem12;

import dev.assignment.problem12.model.Student;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.stream().map(Student::getEngDepartment).forEach(System.out::println);
        List<String> names = filterList(list, s -> s.getYearOfEnrollment() > 2018).stream().map(Student::getName).collect(toList());
        Map<String, List<Student>> studentsInDepartment = list.stream().collect(Collectors.groupingBy(Student::getEngDepartment));
        List<Student> maleStudentsCSE = filterList(studentsInDepartment.get("Computer Science"), s -> "Male".equalsIgnoreCase(s.getGender()));
        List<Student> femaleStudentsCSE = filterList(studentsInDepartment.get("Computer Science"), s -> "FeMale".equalsIgnoreCase(s.getGender()));
        Map<String, List<Student>> studentsByGender = list.stream().collect(Collectors.groupingBy(Student::getGender));
        int noOfMales = studentsByGender.get("Male").size();
        int noOfFeMales = studentsByGender.get("FeMale").size();
        if (noOfMales > 0) {
            double maleAgeAverage = studentsByGender.get("Male").stream().map(Student::getAge).reduce(0, Integer::sum) / noOfMales;
        }
        if (noOfFeMales > 0) {
            double maleAgeAverage = studentsByGender.get("FeMale").stream().map(Student::getAge).reduce(0, Integer::sum) / noOfFeMales;
        }
        Comparator<Student> percentageComparator = (s1, s2) -> {
            return s2.getPercentage().compareTo(s1.getPercentage());
        };
        Optional<Student> studentWithHighPercentage = list.stream().sorted(percentageComparator).findFirst();
        Map<String, Integer> count = studentsInDepartment.entrySet().stream().collect(toMap(e -> e.getKey(), e -> e.getValue().size()));

        Optional<Student> youngerStudentInElectronic = studentsInDepartment.get("Electronic").stream().collect(minBy((s1, s2) -> {
            return s1.getAge().compareTo(s2.getAge());
        }));
        studentsInDepartment.entrySet().stream().collect(toMap(e -> e.getKey(), e -> e.getValue().stream().mapToDouble(s -> s.getPercentage()).average()));
    }

    static List<Student> filterList(List<Student> list, Predicate<Student> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}

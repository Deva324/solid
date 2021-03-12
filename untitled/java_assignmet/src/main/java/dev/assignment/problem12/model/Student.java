package dev.assignment.problem12.model;

public class Student {
    private long id;
    private String name;
    private String gender;
    private int age;
    final private String engDepartment;
    private int yearOfEnrollment;
    private double percentage;

    public Student(long id, String name, int age, String gender, String engDepartment, int yearOfEnrollment, double percentage) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.percentage = percentage;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public Double getPercentage() {
        return percentage;
    }
}

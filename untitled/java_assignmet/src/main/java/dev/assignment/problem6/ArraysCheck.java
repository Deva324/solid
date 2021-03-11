package dev.assignment.problem6;

public class ArraysCheck {

    public ArraysCheck(String test) {
        System.out.println(test);
    }

    public static void main(String[] args) {
        ArraysCheck a1 = new ArraysCheck("1");
        ArraysCheck a2 = new ArraysCheck("2");
        ArraysCheck a3 = new ArraysCheck("3");
        ArraysCheck[] arr = {a1, a3, a2};
    }
}

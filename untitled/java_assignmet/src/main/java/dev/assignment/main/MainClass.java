package dev.assignment.main;

import dev.assignment.data.Problem5;
import dev.assignment.singleton.SingletonP;

public class MainClass {
    public static void main(String[] args) {
        Problem5 p5=new Problem5();
        //p5.print(); not accessible since method is not public and cannot be accessed out side package.
        SingletonP p= new SingletonP();
        p.print();

    }

}

package dev.assignment.program7.point4;

public class CycleMain {
    public static void main(String[] args) {
        BiCycleFactory.createInstance().balance();
        UniCycleFactory.createInstance().balance();
        TriCycleFactory.createInstance().balance();
    }
}

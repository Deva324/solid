package dev.assignment.program7.cycle;

public class CycleMain {
    public static void main(String[] args) {
        BiCycle bi = new BiCycle();
        TriCycle tri = new TriCycle();
        UniCycle uni = new UniCycle();
        Cycle c = (Cycle) bi;
        System.out.println(c.balance());
        c = (Cycle) tri;
        System.out.println(c.balance());
        c = (Cycle) uni;
        System.out.println(c.balance());
        System.out.println(bi.balance());
        System.out.println(tri.balance());
        System.out.println(uni.balance());
    }
}

package dev.assignment.program7.rodent;

public class RodentMain {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[]{new Mouse(), new Hamster(), new Gerbil()};
        for (int i = 0; i < rodents.length; i++) {
            System.out.println(rodents[i].behaviouralType());
        }
    }
}

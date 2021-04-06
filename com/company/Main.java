package com.company;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Kirill", "Pold", "First", 5);
        Student aspirant = new Aspirant("Oleg", "Sold", "First", 4);
        student.getScholarShip();
        aspirant.getScholarShip();
        int massiv[] = new int[2];
        massiv[0] = (int) student.getScholarShip();
        massiv[1] = (int) aspirant.getScholarShip();
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
    }
}

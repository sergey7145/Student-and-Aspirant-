package com.company;

public class Aspirant extends Student {
    private String firstName, lastName, group;
    private double averageMark;

    Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override

    public double getScholarShip() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
package com.company;

public class Student {
    private final String firstName, lastName, group;
    private final double averageMark;


    Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarShip() {
        if (averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }
}
package com.example.tomcat_study.models;

public class Student extends Person {
    private int pesel;
    private double mark;
    public Student(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Student(String name, String surname, int age, int pesel, double mark) {
        super(name, surname, age);
        this.pesel = pesel;
        this.mark = mark;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name="+super.getName()+" "+
                "surname="+super.getSurname()+" "+
                "age="+super.getAge()+" "+
                "course=" + pesel +
                ", mark=" + mark +
                ", age=" + age +
                '}';
    }
}

package com.example.tomcat_study.models;

public class Teacher extends Person{
    private String subject;
    private int pesel;

    public Teacher(String name, String surname, int age, String subject, int pesel) {
        super(name, surname, age);
        this.subject = subject;
        this.pesel = pesel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name="+super.getName()+" "+
                "surname="+super.getSurname()+" "+
                "age="+super.getAge()+" "+
                "subject='" + subject + '\'' +
                ", pesel=" + pesel +
                ", age=" + age +
                '}';
    }
}

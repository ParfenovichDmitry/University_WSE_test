package com.example.tomcat_study;

import com.example.tomcat_study.models.Person;
import com.example.tomcat_study.models.Student;
import com.example.tomcat_study.models.Teacher;
import com.example.tomcat_study.models.University;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Jacek", "kowalski", 18,12345678,4.6);
        Student st2 = new Student("Paweł", "Duda", 23,18945678,3.75);
        Student st3 = new Student("Maria", "Nowak", 21,12345678,5.0);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);

        Teacher tc1 = new Teacher("Iwan","Petrow",38,"matematyka",35798765);
        Teacher tc2 = new Teacher("Anna","Zelinska",42,"fizyka",35794665);
        Teacher tc3 = new Teacher("Lan","Ryś",62,"chemia",41798765);

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(tc1);
        teacherList.add(tc2);
        teacherList.add(tc3);


        University university = new University(studentList,teacherList);

        findByPesel(university,35798765);



}

        public static void findByPesel(University university, int pesel){
        university.getStudentList().stream()
                        .forEach(a->{if(a.getPesel()==pesel){
                            System.out.println(a);
                        }else System.out.println("Nie ma takej osoby");});
        university.getTeacherList().stream()
                    .forEach(a->{if(a.getPesel()==pesel){
                System.out.println(a);
            }else System.out.println("Nie ma takej osoby");});

        }
}
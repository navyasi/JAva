package com.ofs.club;
//object oriented programming
public class Student {
    String name; //attributes
    String subject;
    int grade;
    String homebase;
    public Student(String studentName, String studentSubject, int studentGrade, String studentHomebase){
        name = studentName;
        subject = studentSubject;
        grade = studentGrade;
        homebase = studentHomebase;
    }
    public static void main (String [] args){
        Student student1 = new Student("Navya", "Math", 11, "V");
    }

}

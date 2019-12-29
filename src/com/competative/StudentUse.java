package com.competative;

public class StudentUse {

    public static void main(String[] args) {
        Student s1 = new Student("first student",1);

        s1.name = "surya";
        System.out.println(s1.name);
        System.out.println(s1.msg);
        System.out.println(s1.getRollNumber());

        Student s2 = new Student("Secound student",2);
        System.out.println(Student.getNumStudent());


    }
}

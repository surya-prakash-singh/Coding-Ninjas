package com.oops;

public class Student {
    public String msg;
    public String name;
    static private int numStudent;
    private final int rollNumber;

    public Student(String msg,int rollNumber){
        super();
        this.msg = msg;
        this.rollNumber = rollNumber;
        numStudent++;
    }

    public static int getNumStudent() {
        return numStudent;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

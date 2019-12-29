package com.competative;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public int getReal(){
        return this.real;
    }

    public int getImaginary(){
        return this.imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void print(){
        System.out.println(this.real+"+"+this.imaginary+"i");
    }

    public ComplexNumber add(ComplexNumber C2){
        int newReal = this.real + C2.real;
        int newImaginary = this.imaginary + C2.imaginary;
        return new ComplexNumber(newReal,newImaginary);
    }

    public static ComplexNumber Conjugate(ComplexNumber C3){
        int newReal = C3.real;
        int newImaginary = (-1)*(C3.imaginary);
        return new ComplexNumber(newReal,newImaginary);
    }
}

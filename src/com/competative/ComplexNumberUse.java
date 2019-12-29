package com.competative;

public class ComplexNumberUse {
    public static void main(String[] args) {
    ComplexNumber c1 = new ComplexNumber(2,3);
    c1.print();
    c1.setImaginary(5);
    c1.print();
    System.out.print(ComplexNumber.Conjugate(c1).getImaginary());
    }
}

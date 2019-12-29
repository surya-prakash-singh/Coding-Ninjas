package com.competative;

//Give me a new Fraction
public class fraction {
    private int numerator;
    private int denominator;

    public fraction(int numerator, int denominator){

        this.numerator = numerator;
        if(denominator == 0){
            //ToDO error out
        }
        this.denominator = denominator;
        simplify();
    }

    private void simplify(){
       int gcd = 1;

       for (int i = 1;i<=numerator; i++){
           if(numerator%i == 0 && denominator %i == 0){
               gcd = i;
           }
       }
        numerator = numerator/gcd;
        denominator = denominator/gcd;

    }

    public void print(){
        if(denominator == 1){
            System.out.println(numerator);
        }else{
            System.out.println(numerator+"/"+denominator);
        }
    }

    public void add(fraction f2){
        this.numerator = (f2.numerator * this.denominator) + (this.numerator * f2.denominator);
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }
    public void multiply(fraction f2){
        this.denominator = this.denominator * f2.denominator;
        this.numerator = this.numerator*f2.numerator;
        simplify();
    }
    public String toString()
    {
        return numerator + " " + denominator;
    }



    public static fraction add(fraction f1, fraction f2){
        fraction f3 = new fraction(f1.numerator* f2.denominator + f2.numerator*f1.denominator, f1.denominator*f2.denominator);
      return f3;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
        simplify();
    }
}

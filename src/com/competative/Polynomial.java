package com.competative;

public class Polynomial {

    private int[] data;

    public Polynomial(){
        data = new int[5];
    };

    public int getCoefficient(int index){

        if(index < data.length){
            return  data[index];
        }else{
            return 0;
        }
    };

    public void setCoefficient(int degree, int coeff){

        if( degree > data.length-1) {
            restructure(degree);
        }
            this.data[degree] = coeff;
    }

    public void print(){
        for(int i = 0;i< data.length;i++){
            if(data[i]!=0){
                System.out.print(data[i]+"x"+i+" ");
            }
        }
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        Polynomial P3 = new Polynomial();
        int plen1 = this.data.length;
        int plen2 = p.data.length;
        int len = Math.min(plen1,plen2);
        int i;
        for(i=0;i<len;i++){
            P3.setCoefficient(i,this.data[i] + p.data[i]);
        }
        while(i<plen1){
            P3.setCoefficient(i,this.data[i]);
            i++;
        }
        while(i<plen2){
            P3.setCoefficient(i,p.data[i]);
            i++;
        }
        return P3;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        Polynomial P3 = new Polynomial();
        int plen1 = this.data.length;
        int plen2 = p.data.length;
        int len = Math.min(plen1,plen2);
        int i;
        for(i=0;i<len;i++){
            P3.setCoefficient(i,this.data[i] - p.data[i]);
        }
        while(i<plen1){
            P3.setCoefficient(i,this.data[i]);
            i++;
        }
        while(i<plen2){
            P3.setCoefficient(i,-p.data[i]);
            i++;
        }
        return P3;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p) {
        Polynomial P3 = new Polynomial();
        int term;
        int result;
        int current;
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < p.data.length; j++) {
                result = this.data[i] * p.data[j];
                if (P3.getCoefficient(i + j) != 0) {
                    P3.setCoefficient(i + j, result + P3.getCoefficient(i + j));
                } else {
                    P3.setCoefficient(i + j, result);
                }
            }
        }
        return P3;
    }


    public void restructure(int degree){

        int temp[] = data;

        data = new int[degree + 1];

        for(int i = 0; i< temp.length;i++){
            data[i] = temp[i];
        }
    }
}

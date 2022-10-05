package com.ofs.chap1234;

public class Prac52 {
    public static void main(String [] args){
        double term = 1.0;
        double sum = 0;


        for(int i = 1; i < 100; i++){
            term = 1.0 / (i*i);
            sum = sum + term;
            IBIO.output(term);
        }
        IBIO.output("total is " + sum);
    }
}

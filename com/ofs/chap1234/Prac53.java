package com.ofs.chap1234;

public class Prac53 {
    public static void main(String [] args){
        int sign = 1;
        double sum = 0;
        for (double i = 1; i<10000; i++){
            sum = sum + sign * 1/(2*i-1);
            sign = sign * -1;
        }
        IBIO.output(4*sum);
    }
}

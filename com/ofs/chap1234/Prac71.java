package com.ofs.chap1234;

public class Prac71 {
    public static void main (String [] args){
        double num = 1;
        for (int i = 0; i<10; i++){
            num = num * 3.732;
            num = (int)(num * 100);
            num = (double) num / 100;
            IBIO.output(num);
        }
    }
}
//int * int = int
//int * deci = deci
//deci * int = deci
//deci * deci = deci
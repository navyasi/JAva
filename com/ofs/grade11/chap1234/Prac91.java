package com.ofs.grade11.chap1234;

public class Prac91 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++)
        { double xx = Math.random() * 6; //Math.random - decimal
            int yy = (int)(xx + 1);//change to number 1 to 6
            sum = sum + yy;
            IBIO.output(yy);
        }
       int avg = sum/100;
        IBIO.output(avg);

    }
}


package com.ofs.chap1234;

public class Prac54 {

        public static void main(String [] args){
            double num = 1;
            double den = 1;
            double sum = 1;
            for (double i = 1; i<100; i++){

                den = den * (2*i + 1);
                num = num*i;
                sum = sum + num/den;
                IBIO.output(num + "/" + den);

            }
            IBIO.output(2*sum);
        }
    }


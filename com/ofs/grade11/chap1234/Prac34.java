package com.ofs.grade11.chap1234;

public class Prac34 {
    public static void main(String [] args) {
        int n = IBIO.inputInt("Enter a number: ");
        int counter = 0;
        do {
            if (n % 2 == 0) {
                n = n/2;
            }
            else
                n = 3*n + 1;
            counter = counter + 1;
            IBIO.out(n + ", ");
        } while(n>1);
        IBIO.output(counter + " steps taken.");
    }
}

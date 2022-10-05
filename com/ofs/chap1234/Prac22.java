package com.ofs.chap1234;

public class Prac22 {
    public static void main(String[] args){
        int n = IBIO.inputInt("Enter a number: ");
        if (n % 2 == 0)
            IBIO.output("The number is Even.");
        if(n % 2 != 0)
            IBIO.output("The number is Odd.");

    }
}

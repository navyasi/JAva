package com.ofs.chap1234;

public class Prac21 {
    public static void main(String[] args){
        int n = IBIO.inputInt("input a number between 50 and 60: ");
        if (n<50)
            IBIO.output("The number entered was too less!");
        if(n>60)
            IBIO.output("Number is too big");

    }
}

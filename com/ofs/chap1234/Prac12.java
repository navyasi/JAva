package com.ofs.chap1234;

public class Prac12 {
    public static void main (String[] args){
        int step = IBIO.inputInt("How many steps?");
        int start = IBIO.inputInt("What is the starting number?");
        int increment = IBIO.inputInt("What is the increment?");
        int output = start;
        IBIO.output(start);
        for(int i = 0; i < step-1; i++){
            output = output + increment;
            IBIO.output(output + "");

        }
    }
}

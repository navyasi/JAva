package com.ofs.grade11.chap1234;

public class Prac61 {
    public static void main(String[] args){
        int numofstars = IBIO.inputInt("How many stars? ");
        String staroutput = stars1(numofstars);
        for (int i = 0; i<numofstars; i++){
            IBIO.output(staroutput);
        }

        }
    public static String stars1 (int x){
        String starline = "          ";    // printing 10 spaces out
        for (int i = 0; i<x; i++){
            starline = starline + "*";

        }
        return starline;
    }
}


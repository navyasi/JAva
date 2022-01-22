package com.ofs.grade11.chap1234;

public class Prac63 {
    public static void main(String [] args){    //printing arrow shape with stars
        int lines = IBIO.inputInt("How many lines? ");
        for(int i = lines; i > 0; i--){
            String spaces = spaces3(i);
            IBIO.out(spaces);
            String staroutput = stars3(lines);
            IBIO.output(staroutput);
        }
        IBIO.output(stars3(lines));
        for(int i = 0; i < lines; i++){
            String spaces = spaces3(i+1);
            IBIO.out(spaces);
            String staroutput = stars3(lines);
            IBIO.output(staroutput);
        }

    }
    public static String stars3(int x){
        String s = "";
        for(int i = 0; i<x; i++){
            s = s + "* ";
        }
        return s;
    }
    public static String spaces3(int x){
        String sp = "";
        for(int j = 0; j<x; j++){
            sp = sp + " ";
        }
        return sp;
    }
}

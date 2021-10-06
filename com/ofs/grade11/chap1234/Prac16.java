package com.ofs.grade11.chap1234;

public class Prac16 {
    public static void main(String[] args){
        int numberofterms = IBIO.inputInt("How many terms?");
        int none = 0;
        int ntwo = 1;
        int newnum = 0;
        for(int i = 0; i<numberofterms; i++){
            newnum = none + ntwo;
            IBIO.output(newnum);
            none = ntwo;
            ntwo = newnum;
        }
    }
}

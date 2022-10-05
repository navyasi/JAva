package com.ofs.chap1234;

public class Prac24 {
    public static void main(String [] args){
        int cube = 0;
        for (int i = 0; i < 11; i++){
            cube = i*i*i;
            if (cube < 10)
                IBIO.output("   " + cube);
            if (cube < 100)
                IBIO.output("  " + cube);
            else
                IBIO.output(" " + cube);
        }
    }
}

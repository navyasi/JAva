package com.ofs.chap1234;

public class Prac84 {
    public static void main (String [] args){
        int y = gcd(100, 20);
        IBIO.output("gcd = " + y);
    }
    static int gcd(int a, int b){
        int x = a;
        int y=b;
        int z = 0;
        do{
            x = x-y;
            y = y- x;
            y = y-x;

        } while(x!=y);
        if (x==y){
            z = x;
        }
        return z;
    }
}

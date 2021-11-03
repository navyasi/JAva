package com.ofs.grade11.chap1234;

public class Prac31 {
    public static void main(String[] args)
    { int x;
        do
        { x = IBIO.inputInt("enter a number less than 100 ");
        } while (x % 2 != 0 || x <= 0 || x>=100);
        IBIO.output("thank you");
    }
}

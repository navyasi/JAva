package com.ofs.grade11.chap1234;

public class Prac25 {
    public static void main(String[] args) {
        int printthis = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                printthis = i;
                IBIO.output(printthis);
            }
        }
    }
}

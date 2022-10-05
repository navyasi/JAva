package com.ofs.chap1234;

public class Prac26 {
    public static void main(String[] args) {
        int printthis = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                printthis = i;
                IBIO.output(printthis);
            }
        }
    }

}

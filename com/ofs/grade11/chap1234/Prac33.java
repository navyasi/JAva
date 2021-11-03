package com.ofs.grade11.chap1234;

public class Prac33 {
    public static void main(String [] args){
        int sum = 0;
        int n = IBIO.inputInt("Enter a number: ");
        do{
            int digit = n % 10;
            int cube = digit * digit * digit;
            sum = sum + cube;
            n = n/10;
        } while(n != 0);
        IBIO.output("The sum of the cube of the digits of the number is " + sum);
    }
}

package com.ofs.chap1234;

public class Prac32 {
    public static void main(String[] args){
        int i = 1;
        int x;
        do
            {
                x = IBIO.inputInt("enter a number greater than 1: ");

            } while (x <= 1);

        do{
            i++;
        }while (x%i != 0);


        if(x == i){
            IBIO.output(x + " is prime.");
        }
        else
            IBIO.output(x + " is not prime and smallest factor is  " +i);

    }

}
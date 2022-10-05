package com.ofs.grade12;

public class Chap114 {
    public static int inputNumber() throws Exception{
        int num = IBIO.inputInt("Enter a number between 40 and 50: ");
        if (num<40){
            throw new Exception("number too small");
        }
        else if (num>50){
            throw new Exception("number too big ");
        }
        return num;
    }
    public static void main(String[] args) {
        while(true){
            try{
                int num = inputNumber();
                IBIO.output("That was correct!");
                break;
            } catch(Exception e){
                IBIO.output(e.getMessage());
            }
        }
    }

}

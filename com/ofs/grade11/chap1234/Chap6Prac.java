package com.ofs.grade11.chap1234;

public class Chap6Prac {
    public static void main(String [] args){
      int num = IBIO.inputInt("How big square?");
      for(int i = 0; i < num; i++){
          stars(num);
      }

    }

    public static String stars (int x) {
        String s = "";
        for (int j = 0; j<x; j++){
            s = s + "*";
        }
        return s;
    }
}

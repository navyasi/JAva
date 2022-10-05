package com.ofs.club;

public class ClubArray {
    public static void main (String [] args){
        int [] array = {1, 2, 3, 4, 5};
        int sum = 0;
        //System.out.println (array[3]); //finding an element inside array using index
        for (int i =0; i<array.length; i++){
             int x = (array[i]);
             sum = sum + x;

        }
        int average = sum/ array.length;
        System.out.println(average);
    }
}
//array.length gives array length
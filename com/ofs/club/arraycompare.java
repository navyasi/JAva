package com.ofs.club;

public class arraycompare {
    public static void main (String [] args){
        String [] array1 = {"a", "b", "c", "d", "e", "f"};
        String [] array2 = {"a", "g", "f", "w", "f"};
        if (array1[0] == array2[0]){
            System.out.println("First elements are equal");
        }
        else{
            System.out.println("First elements are not equal");
        }
        if (array1[array1.length - 1] == array2[array2.length -1]){
            System.out.println("Last elements are equal");
        }
        else{
            System.out.println("Last elements are not equal");
        }


    }
}

package com.ofs.grade11.classwork;

import javax.swing.plaf.basic.BasicIconFactory;

public class sortsearchstrings {
    public static void printArray(String [] array)
    {
        System.out.print(array[0]);
        for( int i = 1; i<array.length ; i++  )
        {	System.out.print( ", "+ array[i]);
        }
        System.out.println();
    }
    public static String[] clone(String [] array) // returns a copy of array
    {
        if(array.length == 0) return null;
        String [] copy = new String[array.length];
        for(int i = 0; i < array.length; i++)
        {
            copy[i] = array[i];
        }
        return copy;
    }

    public static void bubbleSortStr(String [] a){
        int len = a.length;
        String temp;
        boolean elementsSwapped = true;
        while(elementsSwapped){
            printArray(a);
            int j = 0;
            elementsSwapped = false;
            while (j<len -1){
                if(a[j].compareToIgnoreCase(a[j+1]) > 0){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    elementsSwapped = true;
                }
                j++;
            }
            len--;
        }

    }

    public static void selectionSortStr(String [] a){
        int sposition = 0;
        String svalue = a[0];

        for(int i = 0; i<a.length; i++){
            printArray(a);
            svalue = a[i];
            sposition = i;
            for(int j = i+1; j<a.length; j++){
                if(a[j].compareToIgnoreCase(svalue)<0){ //change to > for descending order
                    svalue = a[j];
                    sposition = j;
                }
            }
            String temp = a[i];
            a[i] = svalue;
            a[sposition] = temp;
        }
    }

    public static int linearsearchStr(String []a, String target){
        for(int i = 0; i<a.length; i++){
            if(a[i].compareToIgnoreCase(target) == 0){
                return i;
            }
        }
        return -1;

    }

    public static int binarysearchStr (String [] a, String target){
        int start = 0;
        int end = a.length - 1;
        int mid = (start + end)/2;
        while(start <= end ){
            if (target.compareToIgnoreCase(a[mid])<0){
                end = mid -1;
            }
            else if(target.compareToIgnoreCase(a[mid])>0){
                start = mid +1;
            }
            else{
                return mid;
            }
            mid = (start + end)/2;

        }

        return-1;

       /* else{
            IBIO.output("Index = " + mid);
        }*/

    }


    public static void main (String [] args){
        String[] original = { "Bob", "Gale", "Ed", "Faye", "Ives", "Chuck", "Abe", "Dean", "StarLord", "Groot", "Steve", "Max" };
        String [] array = clone(original);
        System.out.println("Original array");
        printArray(original);

        System.out.println("\nBubble sort");
        array = clone(original);
        bubbleSortStr( array );
       // printArray(array);
        System.out.println();

        System.out.println("\nSelection sort");
        array = clone(original);
        selectionSortStr( array );
        printArray(array);
        System.out.println();

        printArray(array);
        String target = IBIO.inputString("Who do you want to find?");
        System.out.println("\nLinear search");
        System.out.println("Index = "+ linearsearchStr(array, target));

        System.out.println("\nBinary Search");
        IBIO.output("Index = "+binarysearchStr(array, target));





    }


}

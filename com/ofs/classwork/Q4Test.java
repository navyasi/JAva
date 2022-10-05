package com.ofs.classwork;

public class Q4Test {
    /*
     * Searching and Sorting algorithms
     * Quarter 4 test
     * Tomorrow we take over Google
     *
     */

        public static void printArray(String[] array)
        {
            System.out.print(array[0]);

            for(int i = 1; i < array.length; i++)
            {
                System.out.print( ", " + array[i]);
            }
            System.out.println();
        }

        public static String[] clone(String[] array) // returns a copy of array
        {
            if(array.length == 0) return null;
            String [] copy = new String[array.length];
            for(int i = 0; i < array.length; i++)
            {
                copy[i] = array[i];
            }
            return copy;
            // your code goes here, you may want/need to modify the line below, too
        }


        public static void bubble(String[] a) {
            int len = a.length;
            String temp;
            boolean elementsSwapped = true;
            while (elementsSwapped) {
                //printArray(a);
                int j = 0;
                elementsSwapped = false;
                while (j < len - 1) {
                    if (a[j].compareToIgnoreCase(a[j + 1]) > 0) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        elementsSwapped = true;
                    }
                    j++;
                }
                len--;
            }
            printArray(a);
        }

        public static void selection(String[] a)
        {
            int sposition = 0;
            String svalue = a[0];

            for(int i = 0; i<a.length; i++){
                //printArray(a);
                svalue = a[i];
                sposition = i;
                for(int j = i+1; j<a.length; j++){
                    if(a[j].compareToIgnoreCase(svalue)>0){ //change to > for descending order
                        svalue = a[j];
                        sposition = j;
                    }
                }
                String temp = a[i];
                a[i] = svalue;
                a[sposition] = temp;
            }
            printArray(a);
        }

        public static int linearSearch(String[] array, String key)
        {
            int location = -1;
            for(int i = 0; i<array.length; i++){
                if(array[i].compareToIgnoreCase(key) == 0){
                    return i;
                }
            }
            return location;
        }

        public static int binarySearch(String[] array, String key) {
            if (isSortedAsc(array)) {
                int location = -1;    // not found
                int start = 0;
                int end = array.length - 1;
                int mid = (start + end) / 2;
                while (start <= end) {
                    if (key.compareToIgnoreCase(array[mid]) < 0) {
                        end = mid - 1;
                    } else if (key.compareToIgnoreCase(array[mid]) > 0) {
                        start = mid + 1;
                    } else {
                        return mid;
                    }
                    mid = (start + end) / 2;

                }
               return location;
            }
           /* else{
                return -2;
            }*/ //since i have enough time
            else{
                bubble(array);
                int location = -1;    // not found
                int start = 0;
                int end = array.length - 1;
                int mid = (start + end) / 2;
                while (start <= end) {
                    if (key.compareToIgnoreCase(array[mid]) < 0) {
                        end = mid - 1;
                    } else if (key.compareToIgnoreCase(array[mid]) > 0) {
                        start = mid + 1;
                    } else {
                        return mid;
                    }
                    mid = (start + end) / 2;

                }
                return location;
            }
        }

        public static boolean isSortedAsc(String[] array)
        {

            int i = 0;
            while (i < array.length -1){
                if(array[i+1] != null && array[i] != null){
                    if(array[i].compareTo(array[i+1])>0){
                        return false;
                    }
                }
                i++;
            }
            return true;
        }

        public static boolean isSortedDesc(String[] array)
        {
            // your code goes here, you may want/need to modify the line below, too
            int i = 0;
            while (i < array.length -1){
                if(array[i+1] != null && array[i] != null){
                    if(array[i].compareTo(array[i+1])<0){
                        return false;
                    }
                }
                i++;
            }
            return true;
        }

        public static String sortedMode(String[] array)
        {
            String bSorted = "unsorted";
            if(isSortedDesc(array)){
                bSorted = "descending";
            }
            else if(isSortedAsc(array)){
                bSorted = "ascending";
            }
            return bSorted;
        }

        public static void main(String[] args)
        {
            System.out.println("Navya Singhal");

            // DO NOT MODIFY THE CODE BELOW THIS COMMENT!!! ////// POLICE LINE DO NOT CROSS //////////////////////////////////////////////////////////////////////
            String[] original = { "dulcie","ernest","vasilis","juanita","saraann","torin","mathian","stanly","georgetta","dalis","taddeo","haroun","clyde","wake","hilary","mallory","prinz","carolin","barton","garnette","hanson","reina","bernice","carmela","drusie","ermentrude","abbey","lene","casey","kahaleel","glennie","kim","afton","wenda","prince","maddalena","nickey","elijah","ashlin","dex","morrie","alvin","jammal","andrej","liza","benedikt","hillard","manon","robby","cari","jilly","carlyn","isa","reg","lincoln","basilio","avivah","jamie","chandal","bourke","heloise","midge","fernandina","gasper","sterling","jemmy","rosco","ardella","curcio","kitti","jamey","alejandrina","kimmie","hervey","hurley","joice","gisele","isac","armin","drusie","edyth","carlie","con","neddie","augustine","loraine","sloan","tilda","meggy","walther","averyl","marshall","meridel","tanny","merry","sibilla","carin","linnie","edy","clayson","zelig","imogene","amandie" };
            String[] b = clone(original);
            String[] s = clone(original);
            System.out.println( "The orginal array is " + sortedMode(original) );

            System.out.println("\nBubble sort on array b");
            bubble( b );
            System.out.println( "Array b is sorted in " + sortedMode(b) + " order." );


            System.out.println("\nSelection sort on array s");
            s = clone(original);
            selection( s );
            System.out.println( "Array s is sorted in " + sortedMode(s) + " order."  );

            System.out.print("\nSearching algorithms\n> Strings to search for: ");
            String[] searches = { "kaori", "benedikt", "dulcie", "amandie", "kitti" };
            int[] locationsL = { -1,45,0,102,69 };
            int[] locationsB = { -1,14,33,4,65 };
            printArray(searches);
            System.out.println();

            for(int i = 0; i < searches.length; i++)
            {
                int linear = linearSearch(original, searches[i]);
                System.out.printf("Linear search for %s (%d): %d\n", searches[i], locationsL[i], linear);
                int binary = binarySearch(b, searches[i]);
                System.out.printf("Binary search for %s (%d): %d\n", searches[i], locationsB[i], binary);
            }
            System.out.println( "\nbinarySearch(original, \"chandal\") [-2 or 24] = " + binarySearch(s, "chandal") );
        }


}

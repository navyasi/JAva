package com.ofs.classwork;

public class Q3Practest {
    public static int max(int[] a)
    {
        // REPLACE THE LINE BELOW WITH YOUR CODE
        int max = a[0];
        // Maximum: the code for your method (function) goes here
        for(int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

    public static int min(int[] a)
    {
        int min = a[0];
        // Minimum: the code for your method (function) goes here
        for(int i = 0; i < a.length; i++)
        {
            if (a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }

    public static double average(int[] a)
    {
        // REPLACE THE LINE BELOW WITH YOUR CODE
        double average = 0.0;
        // Average: the code for your method (function) goes here
        for (int i = 0; i < a.length; i++)
        {
            average = average + a[i];
        }
        return average/a.length;
    }

    public static int above(int[] a)
    {
        // REPLACE THE LINE BELOW WITH YOUR CODE
        int counter = 0;
        int temp = 0;
        double avg = 0.0;

        for (int i = 0; i < a.length; i++)
        {
            avg = avg + a[i];
        }
        avg = avg/a.length;

        for (int i = 0; i < a.length; i++)
        {
            temp = a[i];
            if (temp > avg)
            {
                counter = counter + 1;
            }
        }
        return counter;

    }

    public static int below(int[] a)
    {
        // REPLACE THE LINE BELOW WITH YOUR CODE
        int counter = 0;
        int temp = 0;
        double avg = 0.0;

        for (int i = 0; i < a.length; i++)
        {
            avg = avg + a[i];
        }
        avg = avg/a.length;

        for (int i = 0; i < a.length; i++)
        {
            temp = a[i];
            if (temp < avg)
            {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public static boolean isUnique(int[] a)
    {
        // REPLACE THE LINE BELOW WITH YOUR CODE

        for (int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a.length; j++)
            {
                if(a[i] == a[j])
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printArray(int[] a)
    {
        // YOUR CODE GOES HERE
        for(int i = 0; i < a.length; i++)
        {
            if( i > 0)
            {
                System.out.print(", ");
            }
            System.out.print(a[i]);
        }
    }
    /*System.out.println();
    printArray(numbers);
		System.out.println();
		System.out.println( "Min            (2) = " + min(numbers) );
		System.out.println( "Max          (523) = " + max(numbers) );
		System.out.println( "Average   (235.96) = " + average(numbers) );
		System.out.println( "Above average (48) = " + above(numbers));
		System.out.println( "Below average (52) = " + below(numbers) );
		System.out.println( "Array has only unique elements (true): " + isUnique(numbers) );
		System.out.println();
		System.out.print( "How many largest and smallest numbers to find (2~20)? " );

    // INPUT HOWMANY BELOW, AND VALIDATE THE INPUT PROPERLY
    int howMany = inputInt("How many largest and smallest numbers to find in the array: ");
		while (howMany > 20 || howMany < 1)
    {
        howMany = inputInt("Error- enter a number between 1 and 20: ");*/


}

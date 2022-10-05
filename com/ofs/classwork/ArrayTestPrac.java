package com.ofs.classwork;
/*
 *	Practical Test #2 IB Computer Science MDV: Arrays, statistics
 */
import java.util.*;
import java.io.*;

public class ArrayTestPrac
{
	// Array size:
	public static int size(double[] array)
	{
		int result = 0; // modify
		result = array.length;
		return result;
	}
	//------------------------------------------------------------------

	public static double min(double[] array)
	{
		double min = array[0];
		for(int i = 0; i< array.length; i++){
			if(array[i] < min){
				min = array[i];
			}
		}
		// Minimum: the code for your method (function) goes here
		return min;
	}
	//------------------------------------------------------------------
	
	public static double max(double[] array)
	{
		double max = array[0];
		// Maximum: the code for your method (function) goes here
		for(int i = 0; i< array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	//------------------------------------------------------------------

	public static double range(double[] array)
	{
		double result = 0;
		// Range: the code for your method (function) goes here
		result = max(array) - min(array);
		return result;
	}
	//------------------------------------------------------------------

	public static double average(double[] array)
	{
		double result = 0;
		double sum = 0;
		// Average: the code for your method (function) goes here
		for(int i = 0; i<array.length; i++){
			sum = sum + array[i];
		}
		result = sum/ array.length;

		return result;
	}
	//------------------------------------------------------------------

	public static double median(double[] array)
	{
		double result = 0;
		Arrays.sort(array);
		int len = array.length;
		int mid = len/2;
		// Median: the code for your method (function) goes here
		if (len % 2 == 0) {
			result = (array[mid - 1] + array[mid +1])/2;
		}
		else{
			result = array[mid];
		}
		return result;
	}
	//------------------------------------------------------------------

	public static double mode(double[] array)
	{
		double mode = 0;
		int maxFreq = 0;
		int modeIndex = -1;	// rogue value to indicate no mode found
		for(int i = 0; i < array.length; i++)
		{	int frequency = 0;
			for( int j = 0; j < array.length; j++)
			{	if( array[i] == array[j] )
			{	frequency++;
			}
			}
			if( frequency > maxFreq )
			{	maxFreq   = frequency;
				modeIndex = i;
			}
		}
		if( modeIndex != -1 )			// (single mode found)
		{	mode = array[modeIndex];
		} else {	// otherwise, -1 will be returned => mode not found
			mode = modeIndex;
		}
		return mode;
	}
	//------------------------------------------------------------------
	//------------------------------------------------------------------

	public static void main (String args[]) throws IOException
	{
		System.out.println("\n*** Statistical Analysis of Data Sets ***\n");

		double rainfall[]    = load("rainfall.txt");	// load data from files
		double temperature[] = load("temperature.txt"); // into arrays

		System.out.println( "Navya Singhal"+ "\nSingapore Rainfall Statistics" );
		System.out.printf( "Measurements   : " + size(rainfall) );
		System.out.printf( "\nMinimum   (0.2): %.2f\n", min(rainfall) );
		System.out.printf( "Maximum (765.9): %.2f\n", max(rainfall) );
		System.out.printf( "Range   (765.7): %.2f\n", range(rainfall) );
		System.out.printf( "Average(178.89): %.2f\n", average(rainfall) );
		System.out.printf( "Mode    (127.2): %.2f\n", mode(rainfall) );
		System.out.printf( "Median  (159.7): %.2f\n", median(rainfall) );

		System.out.println();
		
		System.out.println( "\nSingapore Temperature Statistics" );
		System.out.printf( "Measurements   : " + size(temperature) );
		System.out.printf( "\nMinimum  (25.4): %.2f\n", min(temperature) );
		System.out.printf( "Maximum  (29.5): %.2f\n", max(temperature) );
		System.out.printf( "Range     (4.1): %.2f\n", range(temperature) );
		System.out.printf( "Average (27.62): %.2f\n", average(temperature) );
		System.out.printf( "Mode     (27.3): %.2f\n", mode(temperature) );
		System.out.printf( "Median   (27.7): %.2f\n", median(temperature) );

		System.out.println();
	}

	//------------------------------------------
	//- DO NOT MODIFY THE CODE BELOW THIS LINE -
	//------------------------------------------

    public static double[] load(String fileName) throws IOException
    {
        //System.out.println("<<< Loading data >>>");
        File file = new File(fileName);
        if (!file.exists())
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return null;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		double[] data = new double[countLines(fileName)];
		while ( br.ready() )
		{
            temp = br.readLine();
            data[count] = Double.parseDouble(temp);
            count++;
        }
        br.close();
        System.out.println(fileName + " file loaded.");// optional
        return data;
    }

    public static int countLines(String fileName) throws IOException
    {
        File file = new File(fileName);
        if ( !file.exists() )
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return 0;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		while ( br.ready() )
		{
			temp = br.readLine();
            count++;
        }
        br.close();
        return count;
    }


}



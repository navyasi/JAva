package com.ofs.grade11.classwork;

import java.lang.annotation.ElementType;

/* Sorting algorithms assignment
 * 
 * Student Name: Navya Singhal
 * 
 * 
 * Please read https://en.wikipedia.org/wiki/Insertion_sort
 */
public class SortingSkeleton
{
	public static void printArray(int[] array)
	{
		for( int e: array )
		{	System.out.print( e + " " );
		}
		System.out.println();
	}
	
	public static int[] clone(int[] array) // returns a copy of array
	{
		if(array.length == 0) return null;
		int[] copy = new int[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		return copy;
	}

	public static void bubble(int[] a) //adjacent index and checks then swaps if need be then removes
	{
		int len = a.length;
		int temp;
		boolean Elements_Swapped = true;
		while(Elements_Swapped){

			int j = 0;
			Elements_Swapped = false;
			while(j<len - 1){
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					Elements_Swapped = true;
				}
				j++;

			}
			len--;
		}
	}

	public static void bubbledesc(int []a){
		int len = a.length;
		int temp;
		boolean elementswapped = true;
		while (elementswapped){

			int j = 0;
			elementswapped = false;
			while(j<len - 1){
				if(a[j+1]>a[j]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					elementswapped = true;

				}
				j++;
			}
			len--;
		}
	}

	public static void selection(int[] a) //picks one and checks the minimum and then swaps
	{
		int s_position = 0;
		int s_value = a[0];

		for(int i = 0; i<a.length; i++){
			s_value = a[i];
			s_position = i;
			for(int j = i+1; j<= a.length -1; j++){
				if(a[j]<s_value){
					s_value = a[j];
					s_position = j;
				}
			}
			int temp = a[i];
			a[i] = s_value;
			a[s_position] = temp;
		}
	}

	public static void selectiondesc(int [] a){
		int sposition=0;
		int svalue = a[0];
		for (int i = 0 ; i < a.length; i++){
			svalue = a[i];
			sposition = i;
			for(int j = i+1; j<a.length; j++){
				if(a[j]>svalue){
					svalue=a[j];
					sposition=j;
				}
			}
			int temp = a[i];
			a[i] = svalue;
			a[sposition] = temp;

		}
	}

	public static void linearsearch(int[] a, int key){
		int index = 0;
		for(int i = 0; i<a.length-1; i++){
			if(a[i] == key){
				index = i;
			}
		}
		if(a[index] == a[key]){
			IBIO.output("Index = " + index);
		}
		else{
			IBIO.output(-1);
		}
	}

	public static void binarysearch(int [] a, int key){
		//int [] b = new int[a.length];
		//b = bubble(a);
		int start = 0;
		int end = a.length -1;
		int mid = (start + end)/2;
		while(start<= end && a[mid] != key){
			if (key < a[mid]){
				end = mid -1; //left half
			}
			else{
				start = mid +1; //right half
			}
			mid = (start + end)/2;
		}
		if(start>end){
			IBIO.output(-1);//key not found
		}
		else{
			IBIO.output("Index = "+mid); //returning key index
		}

	}

	// https://youtu.be/JU767SDMDvA
	public static void simpleInsertion(int[] a)
	{
		for(int i = 1; i < a.length; i++) // traverse the array
		{
			int j = i; // j=temporary index to sort items; starts from 2nd element in the array; you may say this is the index of the key or element being compared
			while(j > 0 && a[j-1] > a[j]) // stop at j=1 ...
			{	// ... comparing key to the element to its left
				// if they are out of order, swap them until they are
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				j--;
				//System.out.print(">>> ");
				//printArray(a);
			}
		}
	}

	// https://youtu.be/OGzPmgsI-pQ
	public static void insertion(int[] a)
	{
		for (int i = 1; i < a.length; i++)
		{	int key = a[i]; // element being compared
			int j = i - 1;  // index of element before the key
			/* Move elements of array to make room to insert 
			they key in its right place */
			while (j >= 0 && a[j] > key)
			{	a[j + 1] = a[j]; 
				j = j - 1;
				//System.out.print(">> "); printArray(a);
			} 
			a[j + 1] = key; // place the key in the right place
			//printArray(a); System.out.println();
		} 
	}

	// No need to modify the main method.
	public static void main(String[] args)
	{
		int[] original = { 7,9,6,8,1,3,5,2,4 };
		int[] array = clone(original);
		System.out.println("Original array");
		printArray(original);

		System.out.println("\nBubble sort");
		bubble( array );
		printArray(array);
		System.out.println();

		System.out.println("\nBubble descending sort");
		bubbledesc( array );
		printArray(array);
		System.out.println();

		System.out.println("\nSelection sort");
		array = clone(original);
		selection( array );
		printArray(array);

		System.out.println("\nSelection desc sort");
		array = clone(original);
		selectiondesc( array );
		printArray(array);

		System.out.println("\nSimple Insertion sort");
		array = clone(original);
		simpleInsertion( array );
		printArray(array);

		System.out.println("\nInsertion sort");
		array = clone(original);
		insertion( array );
		printArray(array);

		int key = IBIO.inputInt("What number do you want to find?");
		while(key>9 || key<1){
			key = IBIO.inputInt("Error - number not found. Please enter again.");
		}
		System.out.println("\nBinary Search for " + key);
		bubble(array);
		binarysearch(array, key);
		printArray(array);
		System.out.println();

		System.out.println("\nLinear Search for " + key);
		binarysearch(array, key);
		printArray(array);
		System.out.println();



	}
}

package main;
import github.SiddhantR.Algorithm.GenericAlgo.*;


public class Main {
	
public static void main(String[] args)  {

	
/*
 * Binary Serach Test	
 */
	int[] testArr = { 0,1,2,3,4,5,6,7,8,9 };	
	BinarySearch binarySearch= new BinarySearch(true);
	int indexOfVal = binarySearch.binarySearch(2, testArr);
	if (indexOfVal != -1) {
		System.out.println("Found at " + indexOfVal);
	}
	else {
		System.out.println("Not Found");
	}


	
}

}

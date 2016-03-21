package github.SiddhantR.Algorithm.GenericAlgo;

import java.util.Arrays;

public class BinarySearch {
	
	/*
	 * Note that binary search needs the array to be sorted.
	 * In this case sorting should be in ascending order.
	 */
	boolean verbose = false;
	
	public BinarySearch(boolean... params) {
		
		/*
		 * This is to set verbose mode. 
		 * Verbose mode displays run time explanation of execution.
		 */
		
		if(params.length == 1 ) if(params[0]) verbose=true;
		
	}
	
	public int binarySearch(int target, int[] nums) {
		if(verbose)	System.out.println("* * BINARY SEARCH * *");
		if(verbose) System.out.println("Input Array : " + Arrays.toString(nums));
		if(verbose) System.out.println("Searching for : " + target);
	    /*  see if target appears in nums
	     *  we think of floorIndex and ceilingIndex as "walls" around 
	     *  the possible positions of our target so by -1 below we mean to 
	     *  start our wall "to the left" of the 0th index (we /don't/ mean "the last index")
	     */
		
	    int floorIndex = -1;
	    int ceilingIndex = nums.length;
	    if(verbose) System.out.println("floorIndex = " + floorIndex);
	    if(verbose) System.out.println("ceilingIndex = " + ceilingIndex);

	    // if there isn't at least 1 index between floor and ceiling,
	    // we've run out of guesses and the number must not be present
	    while (floorIndex + 1 < ceilingIndex) {

	        // find the index ~halfway between the floor and ceiling
	        // we use integer division, so we'll never get a "half index"
	        int distance = ceilingIndex - floorIndex;
	        int halfDistance = distance / 2;
	        int guessIndex = floorIndex + halfDistance;

	        int guessValue = nums[guessIndex];
	        
	        if(verbose) {
	        	if(verbose) System.out.println("distance = " + distance);
	        	if(verbose) System.out.println("halfDistance = " + halfDistance);
	        	if(verbose) System.out.println("guessIndex = " + guessIndex);
	        	if(verbose) System.out.println("guessValue = " + guessValue);
	        }

	        if (guessValue == target) {
	        	if(verbose) System.out.println("Found! Returning index = " + guessIndex);
	        	return guessIndex;
	        }

	        if (guessValue > target) {
	        	if(verbose) System.out.println("guessValue is greater than target, making ceilingIndex = guessIndex = " + guessIndex);
	            // target is to the left
	            // so move ceiling to the left
	            ceilingIndex = guessIndex;

	        } else {
	        	if(verbose) System.out.println("guessValue is smaller than target, making floorIndex = guessIndex = " + guessIndex);
	            // target is to the right
	            // so move floor to the right
	            floorIndex = guessIndex;
	        }
	    }
    	if(verbose) System.out.println("Not Found! Return false (-1)");
	    return -1;
	}




}

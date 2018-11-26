package com.codility.lessons.counting;

import org.junit.Test;

public class MaxCounter {

	@Test
	public void test() {
		int[] solution = solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 });
		for (int i : solution) {
			System.out.print(i + ", ");
		}
	}

	public int[] solution(int N, int[] A) {
		int[] values = new int[N];
		int max = 0;
		int lastUpdateAllValue = 0;
		for (int i = 0; i < A.length; i++) {
			int counter = A[i];

			// all values should follow max value
			if (counter > N) {
				lastUpdateAllValue = max;
			} 
			// valid counter (value <= N)
			else {
				int index = counter - 1;
				// this means that the previous iteration met counter > N
				// all values in array should have been changed to the max value
				if (values[index] < lastUpdateAllValue) {
					values[index] = lastUpdateAllValue + 1;
				} 
				// increment counter
				else {
					values[index]++;
				}
				
				// track max counter value
				if (values[index] > max) {
					max = values[index];
				}
			}
		}
		
		
		for (int i = 0; i < values.length; i++) {
			if (values[i] < lastUpdateAllValue) {
				values[i] = lastUpdateAllValue;
			}
		}

		return values;

	}
	
	  public int[] solution2(int N, int[] A) {
	        int currentMax = 0;
	        int lastUpdate = 0;
	        int values[] = new int[N];

	        for (int i = 0; i < A.length; i++) {
	            int currentValue = A[i];
	            // Max Value
	            if (currentValue > N) {
	                lastUpdate = currentMax;
	            } 
	            // Value is lower than condition
	            else {
	                int index = currentValue - 1;
	                
	                if (values[index] < lastUpdate)
	                    values[index] = lastUpdate + 1;
	                else
	                    values[index]++;

	                if (values[index] > currentMax) {
	                    currentMax = values[index];
	                }
	            }

	        }

	        for (int iii = 0; iii < N; iii++)
	           if (values[iii] < lastUpdate)
	               values[iii] = lastUpdate;

	        return values;
	    }

}

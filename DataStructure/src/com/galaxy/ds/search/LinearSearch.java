/**
 * 
 */
package com.galaxy.ds.search;

/**
 * @author Ashish_Dadhore
 *
 */
public class LinearSearch implements SearchIntf {
	
	@Override
	public int search(int []arr,int number) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==number) {
				return i;
			}
		}
		return -1;
	}
}

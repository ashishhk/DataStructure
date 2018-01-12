/**
 * 
 */
package com.galaxy.ds.search;

import java.util.Scanner;

import com.galaxy.ds.JobType;

/**
 * @author Ashish_Dadhore
 *
 */
public class SearchJobFactory implements JobType {

	@Override
	public void execute() {
		System.out.println("Which Searching Algorithm to use ?");
		SearchIntf newJob= createSearchJob((new Scanner(System.in)).next());
		newJob.search(new int[] {}, 6);
	}

	private SearchIntf createSearchJob(String algo) {

		algo=algo.toUpperCase();
		switch (algo) {
		case "SEARCH":
			return new LinearSearch();
		case "SORT":
			return new BinarySearch();
		default:
			return null;
		}
	
	}
	
}

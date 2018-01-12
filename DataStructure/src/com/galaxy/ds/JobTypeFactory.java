/**
 * 
 */
package com.galaxy.ds;

import com.galaxy.ds.search.SearchJobFactory;
import com.galaxy.ds.sort.SortJobFactory;

/**
 * @author Ashish_Dadhore
 *
 */
public class JobTypeFactory {

	public static JobType createJob(String jobType) {
		jobType=jobType.toUpperCase();
		switch (jobType) {
		case "SEARCH":
			return new SearchJobFactory();
		case "SORT":
			return new SortJobFactory();
		default:
			return null;
		}
	}
}

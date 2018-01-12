/**
 * 
 */
package com.galaxy.ds.search;

import java.util.Scanner;

/**
 * @author Ashish_Dadhore
 *
 */
public abstract class SearchJob {

	private static final String STR_DEFAULT = "default";
	private static final String COMMA_DELIMITER = ",";

	public void execute() {
		 System.out.println("Enter the input(else say \"default\"): ");
		String[] strArray=prepareInputArray();
		System.out.println("What to Search: ");
		
				
	}

	private String getStringInput() {
		Scanner scanner= new Scanner(System.in);
		String input=scanner.next();
		scanner.close();
		return input;
	}

	public String[] prepareInputArray() {
		Scanner scanner= new Scanner(System.in);
		StringBuilder strBuilder= new StringBuilder();
		while(scanner.hasNext()) {
			strBuilder.append(scanner.next());
			if(strBuilder.toString().equals(STR_DEFAULT)) {
				return new String[] {STR_DEFAULT};
			}
			strBuilder.append(COMMA_DELIMITER);
		}
		scanner.close();
		return strBuilder.toString().split(COMMA_DELIMITER);
	}
}

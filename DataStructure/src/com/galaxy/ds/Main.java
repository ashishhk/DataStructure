package com.galaxy.ds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to DataStructure World");
		System.out.println("what would you like to do? ");
		JobType newJob= JobTypeFactory.createJob((new Scanner(System.in)).next());
		newJob.execute();
	}
}
